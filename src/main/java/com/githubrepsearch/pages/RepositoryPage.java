package com.githubrepsearch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class RepositoryPage extends BasePage{

    public RepositoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "query-builder-test-result-apache")
    WebElement apache;

    public RepositoryPage clickOnSearchOption() {
        wait.until(ExpectedConditions.elementToBeClickable(apache)).click();

        return new RepositoryPage(driver);

    }
    @FindBy(xpath = "//em[text()='Apache']")
    WebElement repApache;

    public RepositoryPage verifyRepositoryName() {
        Assert.assertTrue(shouldHaveText(repApache,"Apache",5));

        return this;
    }
}
