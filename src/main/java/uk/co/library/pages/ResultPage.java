package uk.co.library.pages;

import com.aventstack.extentreports.Status;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

//***  Created by Dipak Pansuriya  ***//

public class ResultPage extends Utility {

    @FindBy(xpath = "//div/h1[@class = 'search-header__title']")
    WebElement result;

//*********************************************************************

    public String verifyTheResults(String expected){
      return getTextFromElement(result);
    }

}
