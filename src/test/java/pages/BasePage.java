package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void fillFormBy(By elementPath, String value){
        driver.findElement(elementPath).sendKeys(value);
    }
    public void clickButton(By elementPath){
        driver.findElement(elementPath).click();
    }
    public void selectOptionByText(By elementPath, String valueOption){
        Select dropDownList = new Select(driver.findElement(elementPath));
        dropDownList.selectByVisibleText(valueOption);

    }
}
