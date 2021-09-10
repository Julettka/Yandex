package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(css = ".ui-burger__inner")
    private WebElement btn1;

    @FindBy(css = ".ui-button_blue .ui-typography > span")
    private WebElement btn2;

    @FindBy(xpath = "//span/input")
    private WebElement loginField;

    @FindBy(id = "passp:sign-in")
    private WebElement signIn;

    @FindBy(id = "passp-field-passwd")
    private WebElement passField;

    @FindBy(css = ".plogo_yandex")
    private WebElement logoY;

    @FindBy(css = "#text")
    private WebElement text;

    @FindBy(css = ".button")
    private WebElement btn3;

    public void btn1In (){
        btn1.click();
    }

    public void btn2In(){
        btn2.click();
    }
    public void loginFieldClick(){
        loginField.click();
    }

    public void loginFieldIn(String login){
        loginField.sendKeys(login);
    }

    public void singIn(){
        signIn.click();
    }

    public void passFieldClick(){
        passField.click();
    }
    public void passIn(String passwd){
        passField.sendKeys(passwd);
    }

    public void logoYClick(){
        logoY.click();
    }
    public void textClick(){
        text.click();
}
    public void textIn(String txt){
        text.sendKeys(txt);

    }
    public void btn3In(){
        btn3.click();
    }
   }
