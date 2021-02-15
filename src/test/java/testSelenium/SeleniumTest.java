/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSelenium;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 *
 * @author fernando
 */
public class SeleniumTest {

    WebDriver driver;
    WebDriverWait wait;

    public SeleniumTest() {
    }

    @BeforeClass
    public void SetUp() {
        try {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
            driver.get("http://localhost:8080/Lab1-analisis/");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    @Test
    public void Login() {
        try {
            System.out.println(driver.getTitle());
            
            WebElement usuario = driver.findElement(By.xpath("//*[@id=\"num1\"]"));
            usuario.sendKeys("5");
            WebElement pass = driver.findElement(By.xpath("//*[@id=\"num2\"]"));
            pass.sendKeys("5");
            WebElement btn = driver.findElement(By.xpath("//*[@id=\"ejecutar\"]"));
            btn.click();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
