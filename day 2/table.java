import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tables No");

        int tables= sc.nextInt();

        for (int i = 1; i<=10 ; i++){   
            System.out.println(i+"X"+tables+"="+tables*i);
        }
    }
    
}
