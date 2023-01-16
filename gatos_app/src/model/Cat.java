/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Candela
 */
public class Cat {
   
    String id;
    String url;
    //esta apikey no se deberia compartir, en este caso es solo por fines practicos que se comparte
    String apikey = "live_GVuqk1zu6c1hIvGWp0yGmF8gFvJDuvvlx3ngLdMYrc22q2bcXJmoHFgO2Lat8lUR";
    String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
