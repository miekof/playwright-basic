package com.okeim.playwright.pages;

import com.microsoft.playwright.Page;

public abstract class MasterPage<T extends MasterPage<T>> {
    protected Page page;

    MasterPage (Page page) {
        this.page = page;
    }
    public abstract T navigate();
}
