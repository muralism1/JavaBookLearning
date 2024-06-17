package Excersice;

public class PrintFormat {
    public static void main(String[] args) {
        int a = 1000000;
        System.out.printf("%,d%n", a);


        double d = 3.4245799554;
        System.out.printf("%f\n",d);
        System.out.printf("%5.3f\n",d);

        System.out.printf("%.4f\n",d);

        
        String str = "geeksforgeeks"; 
  
        // Formatting from lowercase to 
        // Uppercase 
        System.out.printf("%s \n", str); 
        System.out.printf("%S \n", str); 
  
        str = "GFG"; 
        // Vice-versa not possible 
        System.out.printf("%S \n", str); 
        System.out.printf("%s \n", str); 


    }
}
