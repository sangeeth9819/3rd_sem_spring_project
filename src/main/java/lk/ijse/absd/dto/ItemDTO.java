package lk.ijse.absd.dto;

public class ItemDTO {

    private int id;
    private String name;
    private CategoryDTO category;
    private long cat_id;
    private double price;
    private int qty;

    public ItemDTO() {
    }

    public ItemDTO(int id, String name, long cat_id, double price, int qty) {
        this.id = id;
        this.name = name;
        this.cat_id = cat_id;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public long getCat_id() {
        return cat_id;
    }

    public void setCat_id(long cat_id) {
        this.cat_id = cat_id;
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
        return "ItemDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + getCategory() +
                ", cat_id=" + cat_id +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }
}
