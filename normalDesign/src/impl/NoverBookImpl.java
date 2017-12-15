package impl;

import myInterface.NovelBook;

/**
 * Created by yangxb on 2017/11/28.
 */
public class NoverBookImpl implements NovelBook {


    private String name;
    private Double price;
    private String author;
    private String scope;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getScope() {
        return scope;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public NoverBookImpl(String name, Double price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    public NoverBookImpl() {
    }

    @Override
    public String toString() {
        return "NoverBookImpl{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
