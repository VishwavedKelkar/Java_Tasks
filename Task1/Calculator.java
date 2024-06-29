import java.util.*;

class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number : ");
        int a1=sc.nextInt();
        System.out.println("Enter the second number : ");
        int b1=sc.nextInt();
        System.out.println("Write the operation you want to perform (a for add,s for subtract,m for multiply,d for divide) :");
        char c=sc.next().charAt(0);
        switch(c){
            case 'a': System.out.println("The addition is : "+(a1+b1));
                break;
            case 's': System.out.println("The subtraction is : "+(a1-b1));
                break;
            case 'm': System.out.println("The multiplication is : "+(a1*b1));
                break;
            case 'd': System.out.println("The division is : "+(a1/b1));
                break;
            default : System.out.println("Invalid input");
        }
    }
}