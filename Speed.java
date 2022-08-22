public class Speed {
    public void fullSpeed() {
        System.out.println("Bike is going in full speed");
    }

    public void km(int maxspeed) {
        System.out.println("bike is going in speed of  " + maxspeed);
    }

    public static void main(String[] args) {
        Speed myBike = new Speed();
        myBike.fullSpeed();
        myBike.km(120);
    }

}
