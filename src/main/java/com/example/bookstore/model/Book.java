package com.example.bookstore.model;

public class Book {
    private int id;
    private String name;
    private int authorId;
    private int categoryId;
    private String image;
    private int price;
    private int numberOfBook;
    private boolean status;

    public Book() {
    }

    public Book(int id, String name, int authorId, int categoryId, String image, int price, int numberOfBook, boolean status) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.image = image;
        this.price = price;
        this.numberOfBook = numberOfBook;
        this.status = status;
    }

    public Book(int id, String name, String image, int price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}