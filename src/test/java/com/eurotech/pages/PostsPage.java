package com.eurotech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PostsPage extends BasePage{

    @FindBy(id = "post-form-title")
    public WebElement titleInput;
    @FindBy(id = "post-form-textarea")
    public WebElement postInput;
    @FindBy(id = "post-form-btn")
    public WebElement submitBtn;
    @FindBy(css = ".alert.alert-success")
    public WebElement postCreatedMsg;

    public void postComment(String titleText, String postText) {
        titleInput.sendKeys(titleText);
        postInput.sendKeys(postText);
        submitBtn.click();
        Assert.assertEquals("Post Created", postCreatedMsg.getText());
    }
}
