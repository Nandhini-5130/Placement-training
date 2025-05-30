import java.util.Scanner;

public class arrayfor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ECE_F = new int [10];
        for (int i = 0; i<10; i++){
            ECE_F[i] = sc.nextInt();
        }
        for(int i = 0; i<10; i++){
            System.out.println("Roll no:"+ECE_F[i]);
        }
    }

}
