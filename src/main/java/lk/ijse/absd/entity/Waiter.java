package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name = "WAITER")
public class Waiter {

    @Id
    @GeneratedValue
    @Column(name = "WID")
    private long wid;
    @Column(name = "WAITER_NAME")
    private String wname;
    @Column(name = "NIC")
    private String nic;
    @Column(name = "CONTACT")
    private String contact;


    public Waiter(){

    }

    public Waiter(String wname, String nic, String contact) {
        this.wname = wname;
        this.nic = nic;
        this.contact = contact;
    }

    public long getWid() {
        return wid;
    }

    public void setWid(long wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

