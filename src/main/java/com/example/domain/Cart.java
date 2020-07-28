package com.example.domain;
import javax.persistence.*;
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer user;
    private Integer good;
    private Integer quantity;
    public Cart() {
    }
    public Cart(Integer user, Integer good) {
        this.user = user;
        this.good = good;
        quantity = 1;
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
}