import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp = 0;

        System.out.println("Enter the values: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        System.out.println("output: ");
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    temp = arr[j];
                    System.out.println(temp);
                    break;
                }
            }
        }
    }    
}
