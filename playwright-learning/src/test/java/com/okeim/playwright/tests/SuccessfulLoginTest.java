package com.okeim.playwright.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;
import com.okeim.playwright.pages.LoginPage;
import com.okeim.playwright.pages.SecureAreaPage;
import org.junit.jupiter.api.Test;

@UsePlaywright
public class SuccessfulLoginTest {
  @Test
  void testSuccessfulLogin(Page page) {
    SecureAreaPage secureAreaPage =
        new LoginPage(page).navigate().successfulLogin("tomsmith", "SuperSecretPassword!");
    String successMessage = secureAreaPage.getSuccessMessage();
    assertEquals(
        "Welcome to the Secure Area. When you are done click logout below.", successMessage.trim());
  }

  @Test
  void testFailedLogin(Page page) {
    LoginPage loginPage = new LoginPage(page).navigate();
    loginPage.successfulLogin("invalidUser", "invalidPassword");
    String errorMessage = page.locator(".flash.error").textContent();
    assertThat(errorMessage).contains("Your username is invalid!");
  }
}
