package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name ="SUPPLIER")
public class Supplier {

    @Id
    @GeneratedValue
    @Column(name = "SID")
    private long sid;
    @Column(name = "NAME")
    private String name;
    @Column(name = "COMPANY")
    private String company;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "AC_NO")
    private String acno;


    public Supplier() {

    }

    public Supplier(int sid, String name, String company, String email, String contact, String acno) {
        this.setSid(sid);
        this.setName(name);
        this.setCompany(company);
        this.setEmail(email);
        this.setContact(contact);
        this.setAcno(acno);
    }

    public Supplier(String name, String company, String email, String contact, String acno) {
        this.setName(name);
        this.setCompany(company);
        this.setEmail(email);
        this.setContact(contact);
        this.setAcno(acno);
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAcno() {
        return acno;
    }

    public void setAcno(String acno) {
        this.acno = acno;
    }
}

