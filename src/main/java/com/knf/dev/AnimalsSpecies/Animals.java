package com.knf.dev.AnimalsSpecies;

import javax.persistence.*;

@Entity
@Table
public class Animals {
    private String info;
    private String url;
    private String type;
    //animal-endangerd
    //animal-extinct
    //bird-endangerd
    //bird-extinct
    @Id
    private long id;

    public Animals(String info, String url,Long id,String type) {
        this.info = info;
        this.url = url;
        this.id=id;
        this.type=type;
    }
    public Animals()
    {}

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
