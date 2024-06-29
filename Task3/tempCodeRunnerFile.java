import java.util.*;

class rockPaperScissor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        List<String> game = new ArrayList<>(Arrays.asList("Rock","Paper","Scissor"));
        
        //The computers move
        int randomGame = ran.nextInt(game.size());
        String randomMove = game.get(randomGame);
        System.out.println("The move is : "+randomMove);

        //Users move
        System.out.println("Enter your move from Rock , Paper , Scissor");
        String userMove = sc.nextLine();
        
        if(userMove==randomMove){
            System.out.println("Match Tied");
        }
        else{
            if(userMove=="Rock" && randomMove=="Scissor"){
                System.out.println("You Won");
            }
            //else
              //  System.out.println("You lost"); 

            if(userMove=="Rock" && randomMove=="Paper"){
                System.out.println("You Lost");
            }
            if(userMove=="Scissor" && randomMove=="Rock"){
                System.out.println("You Lost");
            }
            if(userMove=="Scissor" && randomMove=="Paper"){
                System.out.println("You Won");
            }
            if(userMove=="Paper" && randomMove=="Rock"){
                System.out.println("You Won");
            }
            if(userMove=="Paper" && randomMove=="Scissor"){
                System.out.println("You Lost");
            }
        }
    }
}