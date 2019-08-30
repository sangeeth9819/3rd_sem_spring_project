package lk.ijse.absd.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Orders {

    @Id
    @GeneratedValue
    @Column(name = "oid")
    private int oid;

    @ManyToOne()
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Customer customer;

    @Column(name = "date")
    private String date;

    @OneToMany(mappedBy = "orders", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails = new ArrayList<>();// uses a list as many orders for one customer



    public Orders(int oid, Customer customer, String date) {
        this.oid = oid;
        this.customer = customer;
        this.date = date;
    }

    public Orders() {
    }

    public Orders(int oid, String date) {
        this.oid = oid;
        this.date = date;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}