package lk.ijse.absd.dto;

public class CustomDTO {

    private String iid;
    private String cat_name;
    private String name;
    private double price;
    private int qty;

    public CustomDTO(String iid, String cat_name, String name, double price, int qty) {
        this.iid = iid;
        this.cat_name = cat_name;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public CustomDTO() {
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
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

    @Override
    public String toString() {
        return "CustomDTO{" +
                "iid='" + iid + '\'' +
                ", cat_name='" + cat_name + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
