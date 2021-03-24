/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author fernando
 */


public class testSuite {
    
    
    
    public static WebDriver driver;
    
    @BeforeClass
    public void SetUp() {
        try {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
            //wait = new WebDriverWait(driver, 10);
            driver.manage().window().maximize();
           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://localhost:9999/Lab1-analisis/");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    
    @Test
    public void ExecuteMultiplicar() {
        try {
            driver= testSuite.driver;
            System.out.println(driver.getTitle());
            
            WebElement num1 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num1_input\"]"));
            num1.sendKeys("\b\b\b\b");
            
            num1.sendKeys("30");
            Thread.sleep(1000);
            WebElement num2 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num2_input\"]"));
            num2.sendKeys("\b\b\b\b"); 
            num2.sendKeys("20");
            Thread.sleep(1000);
            /*
            
            */
             WebElement prueba =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion\"]"));
            
            prueba.click();
            Thread.sleep(500);
            WebElement mult =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion_1\"]"));
                    
            mult.click();
            Thread.sleep(500);
            
            
            WebElement btn = driver.findElement(By.xpath("//*[@id=\"j_idt6:j_idt17\"]"));
            /*****************/
            
            
            
                  
            btn.click();
           Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
    @Test(dependsOnMethods = "ExecuteMultiplicar")
    public void ExecuteDivision() {
        try {
            driver= testSuite.driver;
            System.out.println(driver.getTitle());
            
            WebElement num1 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num1_input\"]"));
            num1.sendKeys("\b\b\b\b\b\b");
            
            num1.sendKeys("300");
            Thread.sleep(1000);
            WebElement num2 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num2_input\"]"));
            num2.sendKeys("\b\b\b\b\b\b"); 
            num2.sendKeys("10");
            Thread.sleep(1000);
            /*
            
            */
             WebElement prueba =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion\"]"));
            
            prueba.click();
            Thread.sleep(500);
            WebElement mult =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion_2\"]"));
                    
            mult.click();
            Thread.sleep(500);
            
            
            WebElement btn = driver.findElement(By.xpath("//*[@id=\"j_idt6:j_idt17\"]"));
            /*****************/
            
            
            
                  
            btn.click();
           Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
    @Test(dependsOnMethods = "ExecuteDivision")
    public void ExecuteSuma() {
        try {
            driver= testSuite.driver;
            System.out.println(driver.getTitle());
            
            WebElement num1 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num1_input\"]"));
            num1.sendKeys("\b\b\b\b\b\b");
            
            num1.sendKeys("500");
            Thread.sleep(1000);
            WebElement num2 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num2_input\"]"));
            num2.sendKeys("\b\b\b\b\b\b"); 
            num2.sendKeys("300");
            Thread.sleep(1000);
            /*
            
            */
             WebElement prueba =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion\"]"));
            
            prueba.click();
            Thread.sleep(500);
            WebElement mult =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion_3\"]"));
                    
            mult.click();
            Thread.sleep(500);
            
            
            WebElement btn = driver.findElement(By.xpath("//*[@id=\"j_idt6:j_idt17\"]"));
            /*****************/
            
            
            
                  
            btn.click();
           Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    @Test(dependsOnMethods = "ExecuteSuma")
    public void ExecuteResta() {
        try {
            driver= testSuite.driver;
            System.out.println(driver.getTitle());
            
            WebElement num1 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num1_input\"]"));
            num1.sendKeys("\b\b\b\b\b\b");
            
            num1.sendKeys("500");
            Thread.sleep(1000);
            WebElement num2 = driver.findElement(By.xpath("//*[@id=\"j_idt6:num2_input\"]"));
            num2.sendKeys("\b\b\b\b\b\b"); 
            num2.sendKeys("250");
            Thread.sleep(1000);
            /*
            
            */
             WebElement prueba =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion\"]"));
            
            prueba.click();
            Thread.sleep(500);
            WebElement mult =driver.findElement(By.xpath("//*[@id=\"j_idt6:operacion_4\"]"));
                    
            mult.click();
            Thread.sleep(500);
            
            
            WebElement btn = driver.findElement(By.xpath("//*[@id=\"j_idt6:j_idt17\"]"));
            /*****************/
            
            
            
                  
            btn.click();
           Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
    //@AfterClass
    public void closeBrowser(){
        driver.quit();
    }
    
}
