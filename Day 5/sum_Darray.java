import java.util.Scanner;
public class sum_Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int sum = 0 ;
        int[][] arr = new int[3][3];
        for(int i = 0 ; i < 3; i++) {
            for(int j = 0; j < 3 ; j++) {
                arr[i][j] = sc.nextInt();
                
            }
        }
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {
                sum = sum+arr[j][index];
                
            }
            System.out.println(sum);
            sum=0;
        }
        
        
        
        
    }
    
}