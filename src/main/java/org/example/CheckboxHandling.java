package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\38267\\Desktop\\selenium-tasks\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement theSportsCheckbox = driver.findElement(By.cssSelector("[for='hobbies-checkbox-1']"));
        theSportsCheckbox.click();

        WebElement theReadingLabel = driver.findElement(By.cssSelector("[for='hobbies-checkbox-2']"));
        theReadingLabel.click();

        WebElement theMusicCheckbox = driver.findElement(By.cssSelector("[for='hobbies-checkbox-3']"));

        if(theMusicCheckbox.isSelected()){
            System.out.println("Music checkbox is checked.");
        }else{
            System.out.println("Music checkbox is not checked.");
        }

        //radio buttons

        List<WebElement> allRadioButtons = driver.findElements(By.cssSelector("[type='radio']"));
        WebElement theFemaleRadioButton = driver.findElement(By.id("gender-radio-2"));

        for(WebElement radioButton:allRadioButtons){
            if(radioButton.isEnabled()){
                allRadioButtons.get(1).click();
            }
        }

        if(theFemaleRadioButton.isSelected()){
            System.out.println("Test passed.");
        }else {
            System.out.println("Test failed.");
        }


    }
}
