import java.util.*;

class rockPaperScissor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        List<String> game = new ArrayList<>(Arrays.asList("Rock","Paper","Scissor"));
        
        //Users move
        System.out.println("Enter your move from \n1.Rock\n2.Paper\n3.Scissor\n");
        String userMove = sc.nextLine();
        System.out.println();
        
        //The computers move
        int randomGame = ran.nextInt(game.size());
        String randomMove = game.get(randomGame);
        System.out.println("The Computers move is : "+randomMove+"\n");

        if(userMove.equals(randomMove)){
            System.out.println("Match Tied");
        }
        else{
            if(userMove.equals("Rock") && randomMove.equals("Scissor")){
                System.out.println("You Won");
            }
            if(userMove.equals("Rock") && randomMove.equals("Paper")){
                System.out.println("You Lost");
            }
            if(userMove.equals("Scissor") && randomMove.equals("Rock")){
                System.out.println("You Lost");
            }
            if(userMove.equals("Scissor") && randomMove.equals("Paper")){
                System.out.println("You Won");
            }
            if(userMove.equals("Paper") && randomMove.equals("Rock")){
                System.out.println("You Won");
            }
            if(userMove.equals("Paper") && randomMove.equals("Scissor")){
                System.out.println("You Lost");
            }
        }

        
    }
}