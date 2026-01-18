package com.githubrepositorysearch.test;

import com.githubrepsearch.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchForRepositoryTest extends  TestBase{
    @BeforeMethod
    public void precondition(){
       new HomePage(driver)
               .clickOnSearchField();

    }

    @Test
    public void searchRepository(){
        String query = System.getProperty("query", "apache");

        new HomePage(driver)
                .enterRepositoryNameIntoSearchField(query)
                .clickOnSearchOption()
                .verifyRepositoryName();
    }
}
