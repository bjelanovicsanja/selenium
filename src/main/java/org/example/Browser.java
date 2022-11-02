package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\38267\\Desktop\\selenium-tasks\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://akademija.amplitudo.me");
        String title = driver.getTitle();
        int length = title.length();
        System.out.println("Page title is: " + title + " and title length is: " + length);
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains("https")){
        }else{
            System.out.println("Page is not secure");
        }
        String pageSource = driver.getPageSource();
        int lengthPageSource = pageSource.length();
        System.out.println("Length of page source is: " + lengthPageSource);
        driver.quit();
    }
}
