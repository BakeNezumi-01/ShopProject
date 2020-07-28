package com.example.domain;
import javax.persistence.*;
@Entity
@Table(name = "goods")
public class Good {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String goodName;
    private Integer price_purchase;
    private Integer price_selling;
    private Integer seller;
    private String date_added;
    private String product_description;
    private Integer length;
    private Integer width;
    private String material;
    private Integer copies;
    private String imageName;
    public Good() { }
    public Good( String goodName, Integer price_purchase, Integer price_selling, Integer seller,
                String date_added, String product_description,  String material,
                Integer copies, String imageName) {
    }
    public Integer getId() {
        return id;
    }
    public float getPrice_purchase() {
        return price_purchase;
    }
    public String getGoodName() {
        return goodName;
    }
    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
    public float getPrice_selling() {
        return price_selling;
    }
    public void setPrice_selling(Integer price_selling) {
        this.price_selling = price_selling;
    }
    public Integer getSeller() {
        return seller;
    }
    public void setSeller(Integer seller) {
        this.seller = seller;
    }
    public String getDate_added() {
        return date_added;
    }
    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }
    public String getProduct_description() {
        return product_description;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public float getLength() {
        return length;
    }
    public void setLength(Integer length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Integer getCopies() {
        return copies;
    }
    public void setCopies(Integer copies) {
        this.copies = copies;
    }
    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}