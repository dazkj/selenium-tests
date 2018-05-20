package com.wikia.webdriver.testcases.adstests;

import com.wikia.webdriver.common.core.annotations.Execute;
import com.wikia.webdriver.common.core.annotations.InBrowser;
import com.wikia.webdriver.common.core.annotations.NetworkTrafficDump;
import com.wikia.webdriver.common.core.configuration.Configuration;
import com.wikia.webdriver.common.core.drivers.Browser;
import com.wikia.webdriver.common.core.helpers.Emulator;
import com.wikia.webdriver.common.core.url.Page;
import com.wikia.webdriver.common.dataprovider.TrackingOptInDataProvider;
import com.wikia.webdriver.common.templates.NewTestTemplate;
import com.wikia.webdriver.pageobjectsfactory.componentobject.TrackingOptInModal;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.List;


@InBrowser(
        browser = Browser.CHROME,
        emulator = Emulator.GOOGLE_NEXUS_5
)
public class TestAdsTrackingOptInRequestsMobileWiki extends NewTestTemplate {

    private static final Page ADS_HOME_PAGE = new Page("project43", "Project43_Wikia");

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsKikimoraDataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForKikimora(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsKruxDataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForKrux(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsNetzAthletenDataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForNetzAthleten(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsMoatDataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForMoat(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsNordicsDataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForNordics(List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "DE");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(urlPatterns, networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsPrebidDataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForPrebid(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsA9DataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForA9(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsComscoreQuantcastDataProvider",
            groups = "adsOptInRejectedMobileWiki"
    )
    public void adsTrackingRejectedForComscoreAndQuantcast(List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsNotSend(urlPatterns, networkTrafficInterceptor, ADS_HOME_PAGE);

    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsKikimoraDataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void verifyAdsTrackingAcceptedForKikimora(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsKruxDataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void adsTrackingAcceptedForKrux(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsNetzAthletenDataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void adsTrackingAcceptedForNetzAthleten(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsMoatDataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void adsTrackingAcceptedForMoat(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsNordicsDataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void adsTrackingAcceptedForNordics(List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "DE");

        new TrackingOptInModal().verifyTrackingRequestsSend(urlPatterns, networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsPrebidDataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void adsTrackingAcceptedForPrebid(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsA9DataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void adsTrackingAcceptedForA9(String[] instantGlobals, List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsSend(instantGlobals, urlPatterns,
                networkTrafficInterceptor, ADS_HOME_PAGE);
    }

    @NetworkTrafficDump(useMITM = true)
    @Execute(trackingOptIn = false)
    @Test(
            dataProviderClass = TrackingOptInDataProvider.class,
            dataProvider = "adsComscoreQuantcastDataProvider",
            groups = "adsOptInAcceptedMobileWiki"
    )
    public void adsTrackingAcceptedForComscoreAndQuantcast(List<String> urlPatterns) {
        networkTrafficInterceptor.startIntercepting();
        setGeoCookie("EU", "PL");

        new TrackingOptInModal().verifyTrackingRequestsSend(urlPatterns, networkTrafficInterceptor, ADS_HOME_PAGE);
    }


    private void setGeoCookie(String continent, String country) {
        Cookie geoCookie = driver.manage().getCookieNamed("Geo");
        driver.manage().deleteCookie(geoCookie);
        driver.manage().addCookie(new Cookie(
                "Geo",
                "{%22region%22:%22WP%22%2C%22country%22:%22" + country + "%22%2C%22continent%22:%22" + continent + "%22}",
                String.format(".%s", Configuration.getEnvType().getWikiaDomain()),
                null,
                null
        ));
    }

}
