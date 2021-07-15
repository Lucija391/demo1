package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaPortalBeethoven {

    WebDriver driver;

    @FindBy (id = "firstHeading")
    WebElement titleBeethoven;

    public WikipedijaPortalBeethoven(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getPortalTitle(){
        return titleBeethoven.getText();
    }

}