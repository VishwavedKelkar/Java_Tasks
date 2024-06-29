import java.util.*;
class numberGuess{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //For generating a random number 
        int n=random.nextInt(100);
        //System.out.println(n);

        //For taking the input from the user
        System.out.println("Enter any number from 1 to 100  : ");
        int num = sc.nextInt();

        if(num==n){
            System.out.println("Whoaa!!");
            System.out.print("You won the game ");
        }
        else if((num+5)>=n && (num-5)<=n){
                System.out.println("Ohhhhhhhhh!!!");
                System.out.println("You were so close");
                System.out.println("Th number was "+n);
            }
        else{
            System.out.println("Better luck next time");
            System.out.println("The number was : "+n);
        }
    }
}