package Q_04;

public class Owner {
    // Data Member
    private String ownerName;
    private String phoneNo;


    public Owner(String name,String num) {
     this.ownerName = name;
     this.phoneNo = num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        phoneNo = num;
    }
    }
