public class Scoped {
    static int age = 20;
    public static void main(String []args) {
        //int age = 20; //local scope can be printed within the function
        System.out.println(age);
        
    }
        static void method() {
            System.out.println(age);

        }
    
}
