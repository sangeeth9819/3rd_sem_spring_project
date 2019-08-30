package lk.ijse.absd.dto;

public class SupplierDTO {

    private long sid;
    private String name;
    private String company;
    private String email;
    private String contact;
    private String acno;

    public SupplierDTO(long sid, String name, String company, String email, String contact, String acno) {
        this.sid = sid;
        this.name = name;
        this.company = company;
        this.email = email;
        this.contact = contact;
        this.acno = acno;
    }



    public SupplierDTO() {
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

    @Override
    public String toString() {
        return "SupplierDTO{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", acno='" + acno + '\'' +
                '}';
    }
}
