package untils;

import component.data.datastructures.LeadCaptureFormDataObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class EndPointData {
    public static LeadCaptureFormDataObject getData() throws Exception{
        URL url  = new URL("https://fs28.formsite.com/api/users/ecnvietnam/forms/form1/results?fs_api_key=Qm8nO3h6auh7");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        List<String> rawData = new ArrayList<String>();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new InputSource(new StringReader(response.toString())));
        NodeList nListItem = doc.getElementsByTagName("items");

        if (nListItem.getLength() > 0) {
            Node nNode = nListItem.item(0);
            Element eElement = (Element) nNode;
            NodeList listAttribute = eElement.getElementsByTagName("item");

            for(int temp = 0; temp < listAttribute.getLength(); temp++) {
                Element nodeAttribute = (Element) listAttribute.item(temp);
//                System.out.println("Item id : " + nodeAttribute.getAttribute("id"));
                rawData.add(nodeAttribute.getElementsByTagName("value").item(0).getTextContent());
            }
        }
        return new LeadCaptureFormDataObject(rawData.get(0), rawData.get(1), rawData.get(2), rawData.get(3), rawData.get(4), rawData.get(5), rawData.get(6), rawData.get(7), rawData.get(8), rawData.get(9));
    }

}
