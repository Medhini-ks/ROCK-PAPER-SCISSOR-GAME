import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissor_game 
{
 public static void main(String[] args) 
 {

   Scanner sc=new Scanner(System.in);
   System.out.println("Are you ready!");
   String ready=sc.nextLine();
   System.out.println();


   if(ready.equals("yes" ))
   {
            System.out.println("Great.");
            System.out.println("Rock--Paper--Scissor--Shoot!");
            System.out.println("Your choice");
            String choice=sc.nextLine();
            sc.close();
            System.out.println();
            String computerchoice=compuchoice();  
            System.out.println("your choice is "+choice);
            System.out.println();
            System.out.println("computer choice is "+computerchoice);
            System.out.println();
            System.out.println(  analysis(choice,computerchoice));
            System.out.println();
   }

   else
   {
    System.out.println("Darn!! Some other time");
   }

 }   


 public static String compuchoice()
 {
        Random rand=new Random();
        int number=rand.nextInt(0,3);
        switch(number)
        {
            case 0:     return "rock";
            case 1:     return "paper";
            case 2:     return "scissor";
            default:    return "";

        }
 }
 public static String analysis(String choice,String computerchoice)
 {
            String result=" ";
        
        
            if(choice.equals("rock")  && computerchoice.equals("paper"))
            {
            result="computer wins";
            }

            else if(choice.equals("rock") && computerchoice.equals("scissor"))
            {
            result="you wins";
            }

            else if(choice.equals("paper")  && computerchoice.equals("rock"))
            {
                result="you wins";
            }

            else if(choice.equals("paper")  && computerchoice.equals("scissor"))
            {
            result="computer wins";
            }

            else if(choice.equals("scissor") && computerchoice.equals("paper"))
            {
            result="you wins";
            }

            else if(choice.equals("scissor" )&& computerchoice.equals("rock"))
            {
            result="computer wins";
            }

            else if(choice.equals(computerchoice))
            {
            result="It's a tie";
            }

            else
            {
            result="invalid choice";
            System.exit(0);
            }
            
            return result;
    
     }

}
