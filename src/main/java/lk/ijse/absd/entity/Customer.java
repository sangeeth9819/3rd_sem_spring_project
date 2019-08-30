package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String address;
    private int mobile;


    public Customer(String name,String email, String address, int mobile) {
        this.name = name;
        this.email=email;
        this.address = address;
        this.mobile = mobile;
    }

    public Customer(long id, String name, String email, String address, int mobile) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
        this.id=id;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
