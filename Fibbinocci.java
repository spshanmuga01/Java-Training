import java.util.Scanner;
public class Fibbinocci {
    public static void main(String[]args){
        System.out.println("Enter the no of elements");
        Scanner start = new Scanner(System.in);
        int noOfElement = start.nextInt();
        int i=1 ,j = 1, n = 2;
        System.out.println(i);
        System.out.println(j);
        while(n<noOfElement){
            int first = i+j;
            i = j;
            j = first;
            n++;
            System.out.println(first);
        }
        


        
    }

    
}
