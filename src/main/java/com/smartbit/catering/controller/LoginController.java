package com.smartbit.catering.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * Created by Andrey on 28.05.2014.
 */
@ManagedBean
@ViewScoped
public class LoginController {
    public void init() {
    }

    @PostConstruct
    public void postConstruct(){
        String renderKitId = FacesContext.getCurrentInstance().getViewRoot().getRenderKitId();
        if (renderKitId.equalsIgnoreCase("PRIMEFACES_MOBILE")) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath()+ "/mobile/login");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
