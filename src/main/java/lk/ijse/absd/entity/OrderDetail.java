package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetail {
    @Id
    @GeneratedValue
    private int orderID;
    private String customerId;
    private int qty;
    private double unitPrice;
    private double discount;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "oid", referencedColumnName = "oid")
    private Orders orders;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "iid", referencedColumnName = "iid")
    private Item item;


    public OrderDetail() {
    }



    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrderDetail(int orderID, String customerId, int qty, double unitPrice, double discount, Orders orders, Item item) {
        this.orderID = orderID;
        this.customerId = customerId;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.orders = orders;
        this.item = item;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

