package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @GeneratedValue
    private int code;
    private String date;
    private double amount;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name ="oid",referencedColumnName = "oid")
    private Orders orders;

    public Payment() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
