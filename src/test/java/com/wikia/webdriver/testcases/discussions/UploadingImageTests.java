package com.wikia.webdriver.testcases.discussions;

import com.wikia.webdriver.common.core.Assertion;
import com.wikia.webdriver.common.core.annotations.Execute;
import com.wikia.webdriver.common.core.annotations.InBrowser;
import com.wikia.webdriver.common.core.drivers.Browser;
import com.wikia.webdriver.common.core.helpers.Emulator;
import com.wikia.webdriver.common.core.helpers.User;
import com.wikia.webdriver.common.remote.Utils;
import com.wikia.webdriver.common.remote.discussions.DiscussionsClient;
import com.wikia.webdriver.common.templates.NewTestTemplate;
import com.wikia.webdriver.elements.mercury.components.discussions.common.BasePostsCreator;
import com.wikia.webdriver.elements.mercury.components.discussions.common.BaseReplyCreator;
import com.wikia.webdriver.elements.mercury.components.discussions.common.PostEntity;
import com.wikia.webdriver.elements.mercury.components.discussions.common.TextGenerator;
import com.wikia.webdriver.elements.mercury.pages.discussions.PostDetailsPage;
import com.wikia.webdriver.elements.mercury.pages.discussions.PostsListPage;
import org.testng.annotations.Test;

@Execute(onWikia = "sandbox-s3.dman", asUser = User.USER_2)
public class UploadingImageTests extends NewTestTemplate {

  private static final String DESKTOP = "uploading-image-desktop";
  private static final String MOBILE = "uploading-image-mobile";

  /**
   * fixture methods
   */

  private PostEntity.Data setUp(String wikiName) {
    String siteId = Utils.excractSiteIdFromWikiName(wikiName);
    return DiscussionsClient
      .using(User.USER_2, driver)
      .createPostWithUniqueData(siteId);
  }

  /**
   * test methods
   */

  @Test(groups = DESKTOP)
  @InBrowser(emulator = Emulator.DESKTOP_BREAKPOINT_BIG)
  public void userCanUploadImageToTheirPostOnDesktop() {
    PostsListPage page = new PostsListPage().open();
    startPostCreationDesktop(page).uploadFile().clickSubmitButton();
    page.waitForPageReload();
    Assertion.assertTrue(page.getPost().findNewestPost().hasImage());
  }

  @Test(groups = DESKTOP)
  @InBrowser(emulator = Emulator.DESKTOP_BREAKPOINT_BIG)
  public void userCanUploadImageToTheirReplyOnDesktop() {
    PostEntity.Data post = setUp("dman");
    PostDetailsPage page = new PostDetailsPage().open(post.getId());
    startReplyCreationDesktop(page).uploadValidImage().clickSubmitButton();
    page.waitForPageReload();
    Assertion.assertTrue(page.findNewestReply().hasImage());
  }

  @Test(groups = DESKTOP)
  @InBrowser(emulator = Emulator.DESKTOP_BREAKPOINT_BIG)
  public void userCannotUploadUnsupportedImageToTheirPostDesktop() {

  }

  @Test(groups = DESKTOP)
  @InBrowser(emulator = Emulator.DESKTOP_BREAKPOINT_BIG)
  public void userCannotUploadUnsupportedImageToTheirReplyDesktop() {

  }

  /**
   * mobile test methods
   */

  @Test(groups = MOBILE)
  @InBrowser(browser = Browser.CHROME, emulator = Emulator.GOOGLE_NEXUS_5)
  public void userCanUploadImageToTheirPostOnMobile() {
    PostsListPage page = new PostsListPage().open();
    startPostCreationMobile(page).uploadFile().clickSubmitButton();
    page.waitForPageReload();
    Assertion.assertTrue(page.getPost().findNewestPost().hasImage());
  }

  @Test(groups = MOBILE)
  @InBrowser(browser = Browser.CHROME, emulator = Emulator.GOOGLE_NEXUS_5)
  public void userCanUploadImageTotheirReplyOnMobile() {
    PostEntity.Data post = setUp("dman");
    PostDetailsPage page = new PostDetailsPage().open(post.getId());
    startReplyCreationMobile(page).uploadValidImage().clickSubmitButton();
    page.waitForPageReload();
    Assertion.assertTrue(page.findNewestReply().hasImage());
  }

  @Test(groups = MOBILE)
  @InBrowser(browser = Browser.CHROME, emulator = Emulator.GOOGLE_NEXUS_5)
  public void userCannotUploadUnsupportedImageToTheirPostOnMobile() {

  }

  @Test(groups = MOBILE)
  @InBrowser(browser = Browser.CHROME, emulator = Emulator.GOOGLE_NEXUS_5)
  public void userCannotUploadUnsupportedImageToTheirReplyOnMobile() {

  }

  /**
   * helper methods
   */

  private BasePostsCreator startPostCreation(BasePostsCreator postCreator) {
    postCreator
      .click()
      .closeGuidelinesMessage()
      .addTitleWith(TextGenerator.defaultText())
      .addDescriptionWith(TextGenerator.defaultText())
      .clickAddCategoryButton()
      .selectFirstCategory();
    return postCreator;
  }

  private BasePostsCreator startPostCreationDesktop(PostsListPage page) {
    return startPostCreation(page.getPostsCreatorDesktop());
  }

  private BasePostsCreator startPostCreationMobile(PostsListPage page) {
    return startPostCreation(page.getPostsCreatorMobile());
  }

  private BaseReplyCreator startReplyCreation(BaseReplyCreator replyCreator) {
    replyCreator.click()
      .clickGuidelinesReadButton()
      .add(TextGenerator.defaultText());
    return replyCreator;
  }

  private BaseReplyCreator startReplyCreationDesktop(PostDetailsPage page) {
    return startReplyCreation(page.getReplyCreatorDesktop());
  }

  private BaseReplyCreator startReplyCreationMobile(PostDetailsPage page) {
    return startReplyCreation(page.getReplyCreatorMobile());
  }

}
