package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name = "DINE")
public class Dine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "DINE_NAME")
    private String name;
    @Column(name = "TYPE")
    private String type;

    public Dine() {
    }

    public Dine(String name, String type) {
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}