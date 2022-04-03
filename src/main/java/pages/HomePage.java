package pages;

import helpers.PageActionHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageActionHelper {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickProduct(){
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[1]")).click();
        return new ProductPage(driver);
    }
}
