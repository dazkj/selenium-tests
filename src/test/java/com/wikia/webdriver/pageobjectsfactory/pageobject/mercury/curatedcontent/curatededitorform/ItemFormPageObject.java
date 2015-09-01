package com.wikia.webdriver.pageobjectsfactory.pageobject.mercury.curatedcontent.curatededitorform;

import com.wikia.webdriver.pageobjectsfactory.pageobject.mercury.curatedcontent.CuratedEditorFormPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @ownership: Content X-Wing
 */
public class ItemFormPageObject extends CuratedEditorFormPageObject {

  @FindBy(css = "input#title")
  private WebElement pageNameField;

  public ItemFormPageObject(WebDriver driver) {
    super(driver);
  }

  public void typePageName(String pageName) {
    waitAndSendKeys(pageNameField, pageName);
  }

}
