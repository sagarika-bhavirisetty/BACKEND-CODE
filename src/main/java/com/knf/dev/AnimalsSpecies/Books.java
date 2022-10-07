package com.knf.dev.AnimalsSpecies;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
    private int price;
    private String Book_name;
    private String Book_image;
    @Id
    private long Book_id;

    public Books(int price, String book_name, String book_image, long book_id) {
        this.price = price;
        Book_name = book_name;
        Book_image = book_image;
        Book_id = book_id;
    }

    public Books() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getBook_image() {
        return Book_image;
    }

    public void setBook_image(String book_image) {
        Book_image = book_image;
    }

    public long getBook_id() {
        return Book_id;
    }

    public void setBook_id(long book_id) {
        Book_id = book_id;
    }
}
