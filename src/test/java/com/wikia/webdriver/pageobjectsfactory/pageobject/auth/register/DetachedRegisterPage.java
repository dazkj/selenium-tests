package com.wikia.webdriver.pageobjectsfactory.pageobject.auth.register;

import com.wikia.webdriver.pageobjectsfactory.pageobject.BasePageObject;

public class DetachedRegisterPage extends BasePageObject implements RegisterPage {

  @Override public AttachedRegisterPage open() {
    return null;
  }

  @Override public AttachedRegisterPage typeEmailAddress(String email) {
    return null;
  }

  @Override public AttachedRegisterPage typeUsername(String username) {
    return null;
  }

  @Override public AttachedRegisterPage typePassword(String password) {
    return null;
  }

  @Override public AttachedRegisterPage typeBirthdate(String month, String day, String year) {
    return null;
  }

  @Override public void clickSignUpSubmitButton() {

  }

  @Override public boolean doesErrorMessageContainText() {
    return false;
  }

  @Override public void verifyBirthdateError() {

  }
}
