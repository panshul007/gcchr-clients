package com.gcchr.client.admin.ui;

import org.vaadin.spring.VaadinUI;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@VaadinUI
public class LandingPageUI extends UI
{
    @Override
    protected void init(VaadinRequest vaadinRequest)
    {
        setContent(new Label("Hello! I am the root UI..!!"));
    }
}
