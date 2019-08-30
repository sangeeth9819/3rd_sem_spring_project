package lk.ijse.absd.dto;

public class CustomerDTO {

    private long cid;
    private String name;
    private String email;
    private String address;
    private int mobile;

    public CustomerDTO() {
    }

    public CustomerDTO(long cid, String name, String email, String address, int mobile) {
        this.cid = cid;
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
