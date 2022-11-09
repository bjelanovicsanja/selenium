package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\38267\\Desktop\\selenium-tasks\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

        List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
        int numberOfInputs = allInputElements.size();
        System.out.println("On this page we have " + numberOfInputs + " input elements.");

        driver.quit();

    }
}
