import java.util.Scanner;
public class Circle {
    public static void main(String[]args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        Double s = r.nextDouble();
        Double radius = (22*s*s)/7;
        System.out.println("The radius of the circle is :" + radius);

    }
    
}
