package com.okeim.playwright.pages;

import com.microsoft.playwright.Page;

public class SecureAreaPage extends MasterPage<SecureAreaPage> {
    public static String URL = "http://the-internet.herokuapp.com/secure";

    public SecureAreaPage(Page page) {
        super(page);
    }

    @Override
    public SecureAreaPage navigate() {
        page.navigate(URL);
        return this;
    }

    public String getSuccessMessage() {
        return page.locator(".subheader").textContent();
    }
}
