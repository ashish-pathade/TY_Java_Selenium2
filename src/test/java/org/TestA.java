package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestA {
    WebDriver driver=null;
    @Test
    public void openBrowser(){
        String browser = System.getProperty("browser");
        String url =System.getProperty("url");
        if (browser.equals("chrome")){
           driver= new ChromeDriver();
        }else{
            driver= new EdgeDriver();
        }
        driver.get(url);
    }
}
