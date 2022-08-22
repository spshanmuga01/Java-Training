public class StudentDetail {
    public String name;
    private int mobileNumber;
    private String address;

    public StudentDetail(String name,int mobileNumber,String address){
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public StudentDetail(String name,int mobileNumber){
        this(name,mobileNumber,"");
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
