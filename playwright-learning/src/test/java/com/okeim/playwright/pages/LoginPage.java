package com.okeim.playwright.pages;

import com.microsoft.playwright.Page;

public class LoginPage extends MasterPage<LoginPage> {
    public static String URL = "http://the-internet.herokuapp.com/login";

    public LoginPage(Page page) {
        super(page);
    }
    @Override
    public LoginPage navigate() {
        page.navigate(URL);
        return this;
    }

    public SecureAreaPage successfulLogin(String username, String password) {
        page.fill("#username", username);
        page.fill("#password", password);
        page.click("button[type='submit']");
        return new SecureAreaPage(page);
    }

/**
         * Attempts to log in with the provided username and password.
         * This method simulates a failed login attempt by submitting invalid credentials.
         *
         * @param username The username to input in the login form.
         * @param password The password to input in the login form.
         * @return The current instance of `LoginPage` for method chaining.
         */
        public LoginPage failedLogin(String username, String password) {
            page.fill("#username", username); // Fill the username field with the provided value.
            page.fill("#password", password); // Fill the password field with the provided value.
            page.click("button[type='submit']"); // Click the submit button to attempt login.
            return this; // Return the current page instance for chaining.
        }
}
