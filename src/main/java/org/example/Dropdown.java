package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\38267\\Desktop\\selenium-tasks\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelect = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelect);
        List<WebElement> allOldSelectOptions = select.getOptions();
        for(WebElement singleOptions:allOldSelectOptions){

            System.out.println(singleOptions.getText());
        }
        select.selectByIndex(4);
        Thread.sleep(2000);
        select.selectByVisibleText("Magenta");
        Thread.sleep(2000);
        select.selectByValue("10");
        Thread.sleep(2000);

        WebElement theMultipleSelectDropdown = driver.findElement(By.id("cars"));
        Select multipleSelect = new Select(theMultipleSelectDropdown);

        if (multipleSelect.isMultiple()){
            multipleSelect.selectByIndex(2);
            multipleSelect.deselectByIndex(2);
            Thread.sleep(2000);
            multipleSelect.selectByValue("saab");
            multipleSelect.deselectByValue("saab");
            Thread.sleep(2000);
            multipleSelect.deselectAll();
        }else{
            System.out.println("Can not select multiple select. ");
        }

        driver.quit();

    }
}
