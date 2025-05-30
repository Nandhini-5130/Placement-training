import java.util.Scanner;
public class oddevenelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        System.out.println("Entered number"+a);
        if (a%2==0){
            System.out.println("Even number");
        }
        else if(a%2!=0){ 
            System.out.println("Odd number");
        }
        else{ 
            System.out.println("invalid number");
    }
    
}
}
