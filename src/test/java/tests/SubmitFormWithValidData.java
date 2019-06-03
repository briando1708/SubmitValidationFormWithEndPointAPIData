package tests;

import commons.DriverType;
import component.data.datastructures.LeadCaptureFormDataObject;
import component.data.sampledata.ValidSubmitedInformation;
import constant.LoginInfo;
import constant.Time;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LeadCaptureFormPage;
import pages.ProtectedFormLoginPage;
import org.testng.Assert;
import untils.EndPointData;

import java.util.concurrent.TimeUnit;

public class SubmitFormWithValidData {
    protected WebDriver driver;
    protected String baseUrl;
    protected WebDriverWait wait;

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws Exception {
        if(browser.equals(DriverType.EDGE.toString())){
            System.getProperty("webdriver.edge.driver", "src\\main\\resources\\Drivers\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }
        else if(browser.equals(DriverType.FIREFOX.toString())){
            System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else
        {
            System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        wait = new WebDriverWait(driver, Time.DEFAULT_WAIT_SECONDS);
        baseUrl = "https://fs28.formsite.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl + "/ecnvietnam/form1/index.html");
    }
    @Test
    public void test() throws Exception {
        // Init parameter
        ProtectedFormLoginPage pFLPage = new ProtectedFormLoginPage(this.driver);
        pFLPage.fillPassword(LoginInfo.PASSWORD);
        pFLPage.clickSubmit();
        LeadCaptureFormPage leadCFPage = new LeadCaptureFormPage(this.driver);

        // Generate sample unique data
        LeadCaptureFormDataObject validDataObject = ValidSubmitedInformation.getSampleUniqueData();


        // Fill up data sample
        leadCFPage.fillFirstName(validDataObject.getFirstName());
        leadCFPage.fillLastName(validDataObject.getLastName());
        leadCFPage.fillAddress1(validDataObject.getStreedAddress01());
        leadCFPage.fillAddress2(validDataObject.getStreedAddress02());
        leadCFPage.fillCity(validDataObject.getCity());
        leadCFPage.selectState(validDataObject.getState());
        leadCFPage.fillZipCode(validDataObject.getZipCode());
        leadCFPage.fillPhoneNumber(validDataObject.getPhoneNo());
        leadCFPage.fillEmailAddress(validDataObject.getEmail());
        leadCFPage.fillDate(validDataObject.getDate());

        // Submit form
        leadCFPage.clickSubmit();

        // Get data after creating information successfully
        LeadCaptureFormDataObject createdData = EndPointData.getData();


        // Verify data from end point api and data sample
        Assert.assertEquals(createdData.getFirstName(), validDataObject.getFirstName());
        Assert.assertEquals(createdData.getLastName(), validDataObject.getLastName());
        Assert.assertEquals(createdData.getStreedAddress01(), validDataObject.getStreedAddress01());
        Assert.assertEquals(createdData.getStreedAddress02(), validDataObject.getStreedAddress02());
        Assert.assertEquals(createdData.getCity(), validDataObject.getCity());
        Assert.assertEquals(createdData.getState(), validDataObject.getState());
        Assert.assertEquals(createdData.getZipCode(), validDataObject.getZipCode());
        Assert.assertEquals(createdData.getPhoneNo(), validDataObject.getPhoneNo());
        Assert.assertEquals(createdData.getEmail(), validDataObject.getEmail());
        Assert.assertEquals(createdData.getDate(), validDataObject.getDate());


    }
    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}
