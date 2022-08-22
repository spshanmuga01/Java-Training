
class Vehicle {
    
    protected String modelName = "None";

    public String brand = "No Brand";

    public String getBrand() {
        return brand;
    }

    public void fuelType() {
        System.out.println("Kerosene");
    }
}

class Car extends Vehicle {

    public String brand = "Benz";

    public String getBrand() {
        return brand;
    }

    public void fuelType() {
        System.out.println("Petrol");
    }

    
}

public class VehicleTest{

    public static void main(String[] args) {

        Vehicle myVeh = new Vehicle();
        myVeh.fuelType();
        System.out.println(myVeh.getBrand() + " " + myVeh.modelName);

        Vehicle myCar = new Car();
        myCar.fuelType();
        System.out.println(myCar.getBrand() + " " + myCar.modelName);
    }

}