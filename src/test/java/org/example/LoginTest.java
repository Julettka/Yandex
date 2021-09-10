package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        driver= new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest1() {

        loginPage.btn1In();
        String title1 = driver.getTitle();
        Assert.assertEquals("Яндекс Плюс - фильмы, музыка и кешбэк баллами", title1);
        loginPage.btn2In();
        loginPage.loginFieldClick();
        loginPage.loginFieldIn(ConfProperties.getProperty("login"));
        loginPage.singIn();
        loginPage.passFieldClick();
        loginPage.passIn(ConfProperties.getProperty("passwd"));
        loginPage.singIn();
        Assert.assertEquals("jul.ettka@gmail.com", ConfProperties.getProperty("login"));
        Assert.assertEquals("9141505", ConfProperties.getProperty("passwd"));
    }

    @Test
    public void loginTest2() {
        String title1 = driver.getTitle();
        Assert.assertEquals("Авторизация", title1);
        loginPage.logoYClick();
        loginPage.textClick();
        loginPage.textIn(ConfProperties.getProperty("txt"));
        loginPage.btn3In();
    }
}
