package com.test.qa.testdata;

import com.test.qa.pageobjects.utils.Constants;
import org.testng.annotations.DataProvider;

/**
 * UserDetailsDataProvider.java - To Manage User related Data Set
 * Created by SrirankanK on 10/3/2018.
 */
public class UserDetailsDataProvider {

    @DataProvider
    public static Object[][] MultipleUserDetails() {
        return new Object[][]{
        	    {"", ""},
        		{"John", "John123"},
                {"Siva", "Siva456"},
                {"tomS", Constants.LOGIN_PASSWORD},




        };
    }
    @DataProvider
    public static Object[][] MultipleUserDetails2() {
        return new Object[][]{
                {"", "",Constants.LOGIN_INVALID_MSG},
                {"John", "John123",Constants.LOGIN_INVALID_MSG},
                {"Siva", "Siva456",Constants.LOGIN_INVALID_MSG},
                {Constants.LOGIN_USER_NAME, "rfffggg",Constants.LOGIN_INVALID_MSg2},
                { "rfffggg",Constants.LOGIN_PASSWORD,Constants.LOGIN_INVALID_MSG},


        };
    }

}
