import java.util.Scanner;
public class Triangle {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the triangle's breath");
        Double b = s.nextDouble();
        System.out.println("Enter the triangle's height");
        Double h = s.nextDouble();
        Double area = (b*h)/2;
        System.out.println("The area of the triangle is :" + area);
    }
    
}
