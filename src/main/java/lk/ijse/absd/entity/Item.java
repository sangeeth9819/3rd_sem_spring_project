package lk.ijse.absd.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {
    @Id
    @GeneratedValue
    @Column(name = "iid")
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "qty")
    private int qty;


    @OneToMany(mappedBy = "item", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails = new ArrayList<>();



    public Item(Category category, String name, double price, int qty, List<OrderDetail> orderDetails) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.orderDetails = orderDetails;
    }

    public Item(int item_code, Category category, String description, double price, int qtyOnHand) {
        this.id=item_code;
        this.category = category;
        this.name = description;
        this.price = price;
        this.qty = qtyOnHand;
    }

    public Item(String name, long cat_id, double price, int qty) {
    }

    public Item(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public Item(){

    }

    public Item(String name, Category category, double price, int qty) {
        this.name = name;
        this.category=category;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
