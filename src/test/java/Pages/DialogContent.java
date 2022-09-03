package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;
    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(css = "dynamic-view[class='ng-star-inserted']")
    private WebElement  successMessage;
    //div[contains(text(),'successfully')]

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;


    WebElement myElement;
    public void findAndSend(String strElement,String value)
    {
        switch (strElement)
        {
            case "username" : myElement=username;break;
            case "password" : myElement=password;break;
            case "nameInput" : myElement=nameInput;break;
            case "shortName" : myElement=shortNameInput;break;
        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "loginButton" : myElement=loginButton;break;
            case "acceptCookies":myElement=acceptCookies;break;
            case "add":myElement=addButton;break;
            case "saveButton":myElement=saveButton;break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement,String text)
    {
        switch (strElement)
        {
            case "dashboard" : myElement=dashboard;break;
            case "success":myElement=successMessage;break;
        }
        verfyContainsText(myElement,text);
    }

    public void SearchAndDelete(String searchText)
    {
//        findAndSend("searchInput",searchText);
//        findAndClick("searchButton");
//        waitUntilLoading();
//        findAndClick("deleteButton");
//        findAndClick("deleteDialogBtn");

    }







}
