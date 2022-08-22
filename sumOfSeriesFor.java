import java.util.Scanner;

public class sumOfSeriesFor {

    public static void main(String []args){
    System.out.println("Enter the end number for the sum of element");
    Scanner a = new Scanner(System.in);
    int noOfElement = a.nextInt();
    int  sum = 0;
    for(int n = 1; n <= noOfElement; n++){
    //System.out.println(n);
        sum = sum + n;
        System.out.println("the numbers are: "+ sum);
    }
    }
    }


