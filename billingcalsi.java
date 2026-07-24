import java.util.Scanner;
public class billingcalsi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of students:");
        int a=sc.nextInt();
   
        System.out.println(" MODERN CANTEEN BILLING SYSTEM ");
        System.out.println("MENU");
        System.out.println("1.Samosa: 20 rs.");
        System.out.println("2. Tea: 10 rs.");
       
        System.out.println("1. Total cost:");
        int b=20;
        int c=10;
     
        System.out.print("Enter quantity of samosa: ");
        int d = sc.nextInt();
        System.out.print("Enter quantity of Tea: ");
        int e = sc.nextInt();
        int tbill = (b*d)+(c*e);
        System.out.println("Total bill:" + tbill);
       
        System.out.println("2. Discounted prices:");
        System.out.println("Enter Total bill:");
        int bill = sc.nextInt();
        System.out.println("Enter % discount offered : ");
        int n = sc.nextInt();
        System.out.print("Total cost with discount:"+(bill-((bill*n)/100)));
       
       
        System.out.println("3. Divide total cost:");
        int x= bill/a ;
        System.out.println("The amount per head is:" + x);
       
        sc.close();
    }
   
}
