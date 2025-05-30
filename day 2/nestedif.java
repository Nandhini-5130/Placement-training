public class nestedif {
    public static void main(String[] args) {
        int pass = 35;
        int mymark = 100;
        if (mymark>=pass){ 
            System.out.println("pass");
            if (mymark>=50) {
                System.out.println("greaterthan 50");
            }
        }
        else{
            System.out.println("fail");
        }
    }
    
}
