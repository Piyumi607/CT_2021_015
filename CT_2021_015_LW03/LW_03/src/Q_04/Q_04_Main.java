package Q_04;

public class Q_04_Main {
    public static void main(String[] args) {
        Owner Piyumi=new Owner("Piyumi","077-1234567");
        BicycleNew tomahawk=new BicycleNew(Piyumi);
        System.out.println("Owner Name:"+tomahawk.getBicycleOwner().getOwnerName());
        System.out.println("Owner Tel-Num:"+tomahawk.getBicycleOwner().getPhoneNo());
    }
}
