package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DynamicTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String row = "5";
        String column = "3";
        WebElement dynamicTableCell = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + row + "]/td[" + column + "]"));
        String dynamicTableText = dynamicTableCell.getText();
        System.out.println(dynamicTableText);

        int sumForAllPrices = 0;
        List<WebElement> allRows = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[last()]"));

        for(WebElement singleRow:allRows){
            sumForAllPrices+= Integer.parseInt(singleRow.getText());
        }
        System.out.println("Sum of all amounts is "+sumForAllPrices);

        // select 2. radio button

        WebElement theSecondRadioButton = driver.findElement(By.xpath("//input[@value='radio2']"));
        theSecondRadioButton.click();

        // select 2. option

        WebElement selectDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectDropdown);

        // select 2. checkbox

        WebElement theSecondCheckbox = driver.findElement(By.id("checkBoxOption2"));
        theSecondCheckbox.click();

        // choose dynamically second row and print it from first table

        String rowTwo = "2";
        WebElement dynamicTableRow = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + rowTwo + "]"));
        String dynamicTableRowText = dynamicTableRow.getText();
        System.out.println(dynamicTableRowText);

        // print all positions from second table

        List<WebElement> allPositions = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[2]"));

        for(WebElement singlePosition:allPositions){
            System.out.println(singlePosition.getText());
        }
        int numberOfPosition = allPositions.size();
        System.out.println(numberOfPosition);


        driver.quit();
    }
}
