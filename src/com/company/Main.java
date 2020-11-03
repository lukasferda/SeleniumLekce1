package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\lferda\\Documents\\Homeworks\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");

        WebDriver firefox = new FirefoxDriver(options);

        Thread.sleep(2000);

        firefox.navigate().to("https://czechitas-shopizer.azurewebsites.net/shop/");

        Thread.sleep(2000);

        firefox.manage().window().maximize();

        Thread.sleep(2000);

        firefox.quit();

    }
}
