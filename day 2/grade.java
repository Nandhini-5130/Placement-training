public class grade {
    public static void main(String[] args) {
        int mark1 = 90, mark2 = 85, mark3 = 95;
        int total = mark1+mark2+mark3;
        int avg = total/3;
        int pass = 35;
        if(mark1>=pass&& mark2>=pass&& mark3>=pass) { 
            System.out.println("pass");
        }
        else 
            System.out.println("fail");
        }

        System.out.println(avg);
        if(avg>=90){ 
            System.out.println("S grade");
        }
        else if(avg>=80) {
            System.out.println("A grade");
        }
        else if(avg>=70) {
            System.out.println("B grade");
        }
        else if(avg>=60) { 
            System.out.println("C grade");
        }
        else { 
            System.out.println("poor");
        }

        
    
        
    }
    

