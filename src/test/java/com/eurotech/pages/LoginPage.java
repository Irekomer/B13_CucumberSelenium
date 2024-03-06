package com.eurotech.pages;

import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(id = "rcc-confirm-button")
    public WebElement understandBtn;
    @FindBy(id ="loginpage-input-email")
    public WebElement userEmail;
    @FindBy(id = "loginpage-form-pw-input")
    public WebElement password;
    @FindBy (id = "loginpage-form-btn")
    public WebElement loginBtn;
    @FindBy(css = ".alert.alert-danger")
    public WebElement errorMessage;


    //////////////////////////////////////////////////////////////////

    //Example From https://the-internet.herokuapp.com/
    @FindBy(tagName = "li")
    public List<WebElement> menuListExample;

    // examples From https://demoqa.com/text-box
    //Full Name --> [id='userName'][placeholder='Full Name']

    // OR true+false / false+true / true+true
    // To use multiple locators, if at least one of them matches with webElement, then we can locate webElement
    @FindAll({ // Like Logical OR
            @FindBy(id = "userName"),
            @FindBy(css = "[placeholder='Full Name']")
    })
    public WebElement fullNameFindAll;

    // AND  true+true
    // To locate webElement with FindBys all locators have to match with the webElementuse multiple locators, if at least one of them matches with webElement, then we can locate webElement
    @FindBys({ // Like Logical AND
            @FindBy(id = "userName"),
            @FindBy(css = "[placeholder='Full Name']")
    })
    public WebElement fullNameFindBys;

     //////////////////////////////////////////////////////////////////


    public void login(){
        String email= ConfigurationReader.get("usernameTeacher");
        String userPassword = ConfigurationReader.get("passwordTeacher");
        understandBtn.click();
        userEmail.sendKeys(email);
        password.sendKeys(userPassword);
        loginBtn.click();
    }
    public void login(String email,String userPassword){
        understandBtn.click();
        userEmail.sendKeys(email);
        password.sendKeys(userPassword);
        loginBtn.click();
    }
    public void loginAsTeacher(){
        understandBtn.click();
        userEmail.sendKeys(ConfigurationReader.get("usernameTeacher"));
        password.sendKeys(ConfigurationReader.get("passwordTeacher"));
        loginBtn.click();
    }
    public void loginAsStudent(){
        understandBtn.click();
        userEmail.sendKeys(ConfigurationReader.get("usernameStudent"));
        password.sendKeys(ConfigurationReader.get("passwordStudent"));
        loginBtn.click();
    }
    public void loginAsDeveloper(){
        understandBtn.click();
        userEmail.sendKeys(ConfigurationReader.get("usernameDeveloper"));
        password.sendKeys(ConfigurationReader.get("passwordDeveloper"));
        loginBtn.click();
    }

    public String getDisappearingWarningMessage(String message){
        String actualMessage=null;

        if (message.contains("@")||message.contains("\".\"")){ //".",
            actualMessage= userEmail.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
        } else if (message.contains("valid")) {
            actualMessage= errorMessage.getText();
            System.out.println("actualMessage = " + actualMessage);
        }
        return actualMessage;
    }
}
