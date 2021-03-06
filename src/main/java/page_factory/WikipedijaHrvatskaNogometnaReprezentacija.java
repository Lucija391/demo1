package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipedijaHrvatskaNogometnaReprezentacija {

    WebDriver driver;

    @FindBy(id="firstHeading")
    WebElement titleHrvatskaNogometnaReprezentacija;

    public WikipedijaHrvatskaNogometnaReprezentacija (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        return    titleHrvatskaNogometnaReprezentacija.getText();
    }
}
