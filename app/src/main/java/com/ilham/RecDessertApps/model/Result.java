
package com.ilham.RecDessertApps.model;

import java.util.HashMap;
import java.util.Map;

public class Result {

    private String id_recipe;
    private String nama_dessert;
    private String bahan;
    private String cara;
    private String gambar_dessert;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId_recipe() {
        return id_recipe;
    }

    public void setId_recipe(String id_recipe) {
        this.id_recipe = id_recipe;
    }

    public String getNama_dessert() {
        return nama_dessert;
    }

    public void setNama_dessert(String nama_dessert) {
        this.nama_dessert = nama_dessert;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public String getGambar_dessert() {
        return gambar_dessert;
    }

    public void setGambar_dessert(String gambar_dessert) {
        this.gambar_dessert = gambar_dessert;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
