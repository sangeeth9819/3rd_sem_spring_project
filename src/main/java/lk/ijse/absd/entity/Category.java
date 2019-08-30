package lk.ijse.absd.entity;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @Column(name = "cat_id")
    @GeneratedValue
    private long id;
    private String name;

    public Category(){

    }


    public Category(String name) {
        this.name = name;
    }

    public Category(int i, String cat_name) {
        this.id=i;
        this.name = cat_name;
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
}
