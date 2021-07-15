package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaMaglevVlak {

    WebDriver driver;

    @FindBy (id="firstHeading")
    WebElement titleMaglevVlak;

    public WikipedijaMaglevVlak(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getTitleText(){
        return titleMaglevVlak.getText();
    }
}
