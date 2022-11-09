package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsPractise {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\38267\\Desktop\\selenium-tasks\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        //find input elements
        WebElement theFirstNameField = driver.findElement(By.id("firstName"));
        WebElement theLastNameField = driver.findElement(By.id("lastName"));
        WebElement theEmailField = driver.findElement(By.id("userEmail"));
        WebElement theFemaleRadioButton = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement theMobileField = driver.findElement(By.id("userNumber"));
        WebElement theHobiesCheckbox = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement theCurrentAdress = driver.findElement(By.id("currentAddress"));
        WebElement theStateSelect = driver.findElement(By.id("state"));
        WebElement theCitySelect = driver.findElement(By.id("city"));

        WebElement submitButton = driver.findElement(By.id("submit"));


        //send keys

        theFirstNameField.sendKeys("sanja");
        theLastNameField.sendKeys("bjelanovic");
        theEmailField.sendKeys("bjelanovic@gmail.com");
        theFemaleRadioButton.click();
        theMobileField.sendKeys("0647859478");
        theHobiesCheckbox.click();
        theCurrentAdress.sendKeys("Podgorica");
        theStateSelect.click();
        Thread.sleep(2000);
        WebElement theNCRCountry = driver.findElement(By.id("react-select-3-option-0"));
        theNCRCountry.click();
        theCitySelect.click();
        WebElement theCityDelhi = driver.findElement(By.id("react-select-4-option-0"));
        theCityDelhi.click();

        submitButton.click();

        WebElement theSuccessMessage = driver.findElement(By.id("example-modal-sizes-title-lg"));
        if(theSuccessMessage.isDisplayed()){
            System.out.println("You are success submit the form");
        }else{
            System.out.println("You are not success submit the form");
        }
    }
}
