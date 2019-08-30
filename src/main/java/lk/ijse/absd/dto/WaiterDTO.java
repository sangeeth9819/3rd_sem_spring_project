package lk.ijse.absd.dto;

public class WaiterDTO {

    private long wid;
    private String wname;
    private String nic;
    private String contact;

    public WaiterDTO(long wid, String wname, String nic, String contact) {
        this.wid = wid;
        this.wname = wname;
        this.nic = nic;
        this.contact = contact;
    }

    public WaiterDTO() {
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

    @Override
    public String toString() {
        return "WaiterDTO{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", nic='" + nic + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
