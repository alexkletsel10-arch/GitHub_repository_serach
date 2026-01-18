package com.githubrepsearch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".Primer_Brand__Heading-module__Heading___IVpmp.Primer_Brand__Heading-module__Heading-font--mona-sans___SCnTx.Primer_Brand__Heading-module__Heading--1___Ufc7G.Primer_Brand__Heading-module__Heading--textWrap-balance___AOKvC.Primer_Brand__Hero-module__Hero-heading___QuVBH")
    WebElement headLine;

    public HomePage waitUntilLoaded() {
        Assert.assertTrue(shouldHaveText(headLine,"The future of building happens together",5));

        return this;
    }
    @FindBy(css = "[data-target='qbsearch-input.inputButtonText']")
    WebElement search;

    public HomePage clickOnSearchField() {
        wait.until(ExpectedConditions.elementToBeClickable(search)).click();
        return this;
    }
    @FindBy(id = "query-builder-test")
    WebElement searchField;

    public RepositoryPage enterRepositoryNameIntoSearchField(String query) {
        wait.until(ExpectedConditions.visibilityOf(searchField)).sendKeys(query);

        return new RepositoryPage(driver);
    }


}
