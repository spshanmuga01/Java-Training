import java.util.Scanner;

public class sumOfSeries {
    
    public static void main(String []args){
    System.out.println("Enter the end number for the sum of element");
    Scanner a = new Scanner(System.in);
    int noOfElement = a.nextInt();
    int i = 1, sum=0;
    while(i<noOfElement){
        sum = sum + i;
        i++;
    System.out.println(sum);
    }
}
}
