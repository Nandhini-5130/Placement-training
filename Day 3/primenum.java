import java.util.Scanner;;
public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        for(int i=2; i<a; i++){
            if(a%i==0){
                temp = 1;
               
            }
        }
        if (temp == 1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("prime number");
        }
    }

    
}
