package component.data.sampledata;

import component.data.datastructures.LeadCaptureFormDataObject;
import untils.DateTime;
import untils.UniqueData;

public class ValidSubmitedInformation {
    public static LeadCaptureFormDataObject getSampleUniqueData(){
        LeadCaptureFormDataObject temp = new LeadCaptureFormDataObject(
                UniqueData.createString("Tai", 15),
                UniqueData.createString("Do", 15),
                "Floor 13, MB Sunny Tower",
                "Floor 13, MB Sunny Tower 2",
                "HCMc",
                "Michigan",
                "70000",
                UniqueData.createNo("1225", 11),
                UniqueData.createString("brian", 15) + "@gmail.com",
                DateTime.getCurrentDate()
        );
        return temp;
    }
}
