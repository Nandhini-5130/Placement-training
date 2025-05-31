
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to check: ");
        int num = sc.nextInt(); 
        
        int i = 0,a,b,c,d;
        
        System.out.println("Enter a index value: ");
        i = sc.nextInt();
        
        int arr[] = new int[i];

        System.out.println("Enter a array value: ");

        for (a = 0; a < i; a++){
            arr[a] = sc.nextInt();
        }

        for (c = 0; c < i; c++){
            if(arr[c] == num){
                System.out.println("The given number is present in "+c);
            }
        }
    }  
}