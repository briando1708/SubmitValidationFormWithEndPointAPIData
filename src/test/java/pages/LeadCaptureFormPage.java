package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadCaptureFormPage extends BasePage{

    public LeadCaptureFormPage(WebDriver driver) {
        super(driver);
    }
    private final By TXT_FIRSTNAME = By.xpath("//input[@id='RESULT_TextField-1']");
    private final By TXT_LASTNAME = By.xpath("//input[@id='RESULT_TextField-2']");
    private final By TXT_ADDRESS_1 = By.xpath("//input[@id='RESULT_TextField-3']");
    private final By TXT_ADDRESS_2 = By.xpath("//input[@id='RESULT_TextField-4']");
    private final By TXT_CITY = By.xpath("//input[@id='RESULT_TextField-5']");
    private final By SLT_STATE = By.xpath("//select[@id='RESULT_RadioButton-6']");
    private final By TXT_ZIPCODE = By.xpath("//input[@id='RESULT_TextField-7']");
    private final By TXT_PHONE = By.xpath("//input[@id='RESULT_TextField-8']");
    private final By TXT_EMAIL = By.xpath("//input[@id='RESULT_TextField-9']");
    private final By TXT_DATE = By.xpath("//input[@id='RESULT_TextField-10']");
    private final By BTN_SUBMIT = By.xpath("//input[@id='FSsubmit']");
    private final By LBL_INVALID_HEADER_TABLE_MASSAGE = By.xpath("//div[@class='form_table invalid']//div[@class='invalid_message']");
    private final By LBL_INVALID_FIRSTNAME_MASSAGE = By.xpath("//div[@id='q17']//div[@class='invalid_message']");
    private final By LBL_INVALID_LASTNAME_MASSAGE = By.xpath("//div[@id='q18']//div[@class='invalid_message']");
    private final By LBL_INVALID_ADDRESS_01_MASSAGE = By.xpath("//div[@id='q19']//div[@class='invalid_message']");
    private final By LBL_INVALID_CITY_MASSAGE = By.xpath("//div[@id='q21']//div[@class='invalid_message']");
    private final By LBL_INVALID_STATE_MASSAGE = By.xpath("//div[@id='q22']//div[@class='invalid_message']");
    private final By LBL_INVALID_ZIP_CODE_MASSAGE = By.xpath("//div[@id='q23']//div[@class='invalid_message']");
    private final By LBL_INVALID_EMAIL_MASSAGE = By.xpath("//div[@id='q25']//div[@class='invalid_message']");
    private final By LBL_INVALID_DATE_MASSAGE = By.xpath("//div[@id='q27']//div[@class='invalid_message']");
    public void fillFirstName(String firstName){
        this.fillFormBy(TXT_FIRSTNAME, firstName);
    }
    public void fillLastName(String lastName){
        this.fillFormBy(TXT_LASTNAME, lastName);
    }
    public void fillAddress1(String Address01){
        this.fillFormBy(TXT_ADDRESS_1, Address01);
    }
    public void fillAddress2(String Address02){
        this.fillFormBy(TXT_ADDRESS_2, Address02);
    }
    public void fillCity(String city){
        this.fillFormBy(TXT_CITY, city);
    }
    public void selectState(String state){
        this.selectOptionByText(SLT_STATE, state);
    }
    public void fillZipCode(String zipCode){
        this.fillFormBy(TXT_ZIPCODE, zipCode);
    }
    public void fillPhoneNumber(String phoneNumber){
        this.fillFormBy(TXT_PHONE, phoneNumber);
    }
    public void fillEmailAddress(String email){
        this.fillFormBy(TXT_EMAIL, email);
    }
    public void fillDate(String date){
        this.fillFormBy(TXT_DATE, date);
    }
    public void clickSubmit(){
        this.clickButton(BTN_SUBMIT);
    }
    public String getInvalidHeaderTableMassageLabel() {
        return driver.findElement(LBL_INVALID_HEADER_TABLE_MASSAGE).getText();
    }

    public String getInvalidFirstNameMassageLabel() {
        return driver.findElement(LBL_INVALID_FIRSTNAME_MASSAGE).getText();
    }

    public String getInvalidLastNameMassageLabel() {
        return driver.findElement(LBL_INVALID_LASTNAME_MASSAGE).getText();
    }

    public String getInvalidAddressMassage01Label() {
        return driver.findElement(LBL_INVALID_ADDRESS_01_MASSAGE).getText();
    }

    public String getInvalidCityMessageLabel() {
        return driver.findElement(LBL_INVALID_CITY_MASSAGE).getText();
    }

    public String getInvalidStateMassageLabel() {
        return driver.findElement(LBL_INVALID_STATE_MASSAGE).getText();
    }

    public String getInvalidZipCodeMassageLabel() {
        return driver.findElement(LBL_INVALID_ZIP_CODE_MASSAGE).getText();
    }

    public String getInvalidEmailMessageLabel() {
        return driver.findElement(LBL_INVALID_EMAIL_MASSAGE).getText();
    }

    public String getInvalidDateMassageLabel() {
        return driver.findElement(LBL_INVALID_DATE_MASSAGE).getText();
    }
}
