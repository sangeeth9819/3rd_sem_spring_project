package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private int userid;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;
    private Boolean enabled = true;


    public User(){

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
