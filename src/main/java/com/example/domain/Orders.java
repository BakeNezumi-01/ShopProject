package com.example.domain;
import javax.persistence.*;
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer user;
    private Integer good;
    private Integer quantity;
    private Integer paid;
    private String date;
    private Integer sum;
    public Integer getSum() {
        return sum;
    }
    public void setSum(Integer sum) {
        this.sum = sum;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUser() {
        return user;
    }
    public void setUser(Integer user) {
        this.user = user;
    }
    public Integer getGood() {
        return good;
    }
    public void setGood(Integer good) {
        this.good = good;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getPaid() {
        return paid;
    }
    public void setPaid(Integer paid) {
        this.paid = paid;
    }
    public Orders() {
    }
    public Orders(Integer user, Integer good, Integer quantity) {
        this.user = user;
        this.good = good;
        this.quantity = quantity;
    }
}