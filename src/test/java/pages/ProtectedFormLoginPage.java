package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProtectedFormLoginPage extends BasePage{
    private final By TXT_PASSWORD = By.xpath("//input[@id='Password']");
    private final By BTN_SUBMIT = By.xpath("//div[@class='outside_container']//input[@value='Submit']");

    public ProtectedFormLoginPage(WebDriver driver) {
        super(driver);
    }

    public By getPasswordTextBox() {
        return TXT_PASSWORD;
    }

    public By getSubmitButton() {
        return BTN_SUBMIT;
    }
    public void fillPassword(String password){
        this.fillFormBy(TXT_PASSWORD, password);
    }
    public void clickSubmit(){
        this.clickButton(BTN_SUBMIT);
    }
}
