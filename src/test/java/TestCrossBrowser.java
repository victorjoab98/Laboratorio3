/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author victorjoab
 */
public class TestCrossBrowser {
    By sumaTag = By.cssSelector("a[href=/laboratorio/views/suma.xhtml;jsessionid=813a9dc3f5d4765ee1bb026c33c3");
    
//     @Test
//    public void testChrome(){
//        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://localhost:8080/laboratorio/");
//        WebElement botonSuma = driver.findElement(sumaTag);
//        botonSuma.click();
//    }
//    
//    @Test
//    public void testFirefox(){
//        System.setProperty("webdriver.gecko.driver", "src/test/java/resources/geckodriver");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://localhost:8080/laboratorio/");
//    }

   
}
