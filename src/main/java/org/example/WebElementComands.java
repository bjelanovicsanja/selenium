package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementComands {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\38267\\Desktop\\selenium-tasks\\drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("http://automationpractice.com/index.php");

        WebElement theSearchField = driver.findElement(By.id("search_query_top"));
        WebElement theSearchButton = driver.findElement(By.name("submit_search"));

        String stringToSearch = "dress";
        theSearchField.click();
        theSearchField.sendKeys(stringToSearch);
        theSearchButton.click();

        WebElement theSearchPageHeading = driver.findElement(By.cssSelector(".page-heading.product-listing"));
        if(theSearchPageHeading.isDisplayed()){
            System.out.println("Search successful.");
        }else{
            System.out.println("Search unsuccessful.");
        }

        driver.quit();

    }
}
