package impl;

import myInterface.Ibook;

/**
 * Created by yangxb on 2017/11/28.
 */
public class JavaBook implements Ibook{

    private String name;
    private Double price;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public JavaBook(String name, Double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public JavaBook() {
    }

    @Override
    public String toString() {
        return "JavaBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
