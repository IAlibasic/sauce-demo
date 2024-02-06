package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_121.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".btn_action")).click();
        driver.findElement(By.cssSelector(".inventory_list>:nth-child(2) button")).click();
        driver.findElement(By.cssSelector("[data-icon='shopping-cart']")).click();
        driver.findElement(By.className("checkout_button")).click();
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Ibrahim");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Alibasic");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("88000");
        driver.findElement(By.className("cart_button")).click();
        driver.findElement(By.className("cart_button")).click();
        driver.findElement(By.className("bm-burger-button")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
//      driver.quit();
    }
}
