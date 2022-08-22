public class Scoped {
     int age = 20;

    public static void main(String[] args) {
        // int age = 20; //local scope can be printed within the function
        //System.out.println(age);
        //System.out.println(age);
        Scoped sample = new Scoped();
        sample.printAge();
    }

    public void printAge() {
        System.out.println(age);

    }
}
