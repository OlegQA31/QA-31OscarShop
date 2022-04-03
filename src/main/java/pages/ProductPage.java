package pages;

import helpers.PageActionHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends PageActionHelper {

    public ProductPage(WebDriver driver) {
        this.driver=driver;
    }

    public ProductPage addItem(){
        new WebDriverWait(driver,15)
                .until(ExpectedConditions.visibilityOf(driver
                        .findElement(By.xpath("//form[@action='/en-gb/basket/add/207/']"))));

        driver.findElement(By.xpath("//form[@action='/en-gb/basket/add/207/']")).click();
        return new ProductPage(driver);
    }
}
