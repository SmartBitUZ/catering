package com.smartbit.catering.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Andrey on 28.05.2014.
 */
@ManagedBean
@ViewScoped
public final class LoginController implements Serializable {
    public void init() {
    }

    @PostConstruct
    public void postConstruct(){
        String renderKitId = FacesContext.getCurrentInstance().getViewRoot().getRenderKitId();
        if (renderKitId.equalsIgnoreCase("PRIMEFACES_MOBILE")) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath()+ "/m/login");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
