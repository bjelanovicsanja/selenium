package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsContactUs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\38267\\Desktop\\selenium-tasks\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Faker faker = new Faker();

        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

        //find input elements
        WebElement theFirstNameField = driver.findElement(By.name("first_name"));
        WebElement theLastNameField = driver.findElement(By.name("last_name"));
        WebElement theEmailField = driver.findElement(By.name("email"));
        WebElement theMessageField = driver.findElement(By.name("message"));
        WebElement theResetButton = driver.findElement(By.cssSelector(".contact_button"));
        WebElement theSubmitButton = driver.findElement(By.cssSelector("[type='submit']"));

        theFirstNameField.click();
        theFirstNameField.sendKeys(faker.name().firstName());
        theLastNameField.click();
        theLastNameField.sendKeys(faker.name().lastName());
        theEmailField.click();
        theEmailField.sendKeys(faker.name().firstName() +"@mailinator.com");
        theMessageField.click();
        theMessageField.sendKeys(faker.funnyName().name());

        theResetButton.click();

        theFirstNameField.click();
        theFirstNameField.sendKeys(faker.name().firstName());
        theLastNameField.click();
        theLastNameField.sendKeys(faker.name().lastName());
        theEmailField.click();
        theEmailField.sendKeys(faker.name().firstName() +"@mailinator.com");
        theMessageField.click();
        theMessageField.sendKeys(faker.funnyName().name());

        theSubmitButton.click();

        WebElement theSuccessMessage = driver.findElement(By.cssSelector("#contact_reply h1"));

        if(theSuccessMessage.getText().equalsIgnoreCase("thank you for your message!")){
            System.out.println("Success.");
        }else{
            System.out.println("Unsuccess.");
        }

        driver.quit();
    }
}
