/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
//import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author Candela
 */
public class FavCat {
  
    String id;
    String imageId;
    //esta apikey no se deberia compartir, en este caso es solo por fines practicos que se comparte
    String apikey= "live_GVuqk1zu6c1hIvGWp0yGmF8gFvJDuvvlx3ngLdMYrc22q2bcXJmoHFgO2Lat8lUR";
    public ImageX image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
//
    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public ImageX getImage() {
        return image;
    }

    public void setImage(ImageX image) {
        this.image = image;
    }
}
