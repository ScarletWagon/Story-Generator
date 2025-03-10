import java.io.*;
import java.util.*;
	
public class Story_3 
{
   public static Scanner input = new Scanner(System.in);
   
   public static Scanner input2 = new Scanner(System.in);

      
   public static void Strings() throws IOException
   {
      int ready;
      System.out.println("Today you will be helping us complete this story,just follow the prompts on the screen");
      System.out.println("Ready?. just put in 0 to start or 1 to end the program");   
      ready = input2.nextInt();
     while (ready < 0 || ready > 1)
      {
      System.out.println("Please put in a 0 to start the program or a 1 to end it.");   
      ready = input2.nextInt();
      }
      
      while(ready == 0)
      {
        
           
         String name;
         System.out.println("Please enter a Name");
         name = input.nextLine(); 
                        
         String verb;
         System.out.println("Please enter a Verb ending with a 'ing'");
         verb = input.nextLine(); 
      
         String adjective;
         System.out.println("Please enter a Adjective");
         adjective = input.nextLine();
      
         String noun;
         System.out.println("Please enter a Noun");
         noun = input.nextLine(); 
         
         String expression;
         System.out.println("Please enter a face expression");
         expression = input.nextLine(); 
         
         String gender;
         String maingen = " ";
         String gender1 = "he";
         String gender2 = "she";
         String gender3 = "they";
            System.out.println("please enter the gender of the person in your story.(male,female,others).");
            gender = input.nextLine();
              if(gender.equals("male"))
                  {maingen = gender1;} 
                  else
                  if(gender.equals("female"))
                   {maingen = gender2;}
                   else 
                   if(gender.equals("others") || gender.equals("other"))
                   {maingen = gender3;}
                   
                   System.out.println(" " +maingen+ " ");
                  
           System.out.println("The story of " +name+" goes as follows. One day " +maingen+" was " +verb+ " when " +maingen+ " ");
           System.out.println("saw a " +noun+ " and thier face was super " +expression+ " and " +maingen+ " also stopped " +verb+ " " +adjective+ ".");   
           
           System.out.println("              ");   //makeshift line break
            System.out.println("Hope you liked that, if you would like to take another try at it. enter 0 or enter 1 to end the program");
            ready = input.nextInt();
             while (ready < 0 || ready > 1)
      {
      System.out.println("Please put in a 0 to start the program or a 1 to end it.");   
      ready = input.nextInt();
      }
                                                                    
      
      }
   }
   public static void main(String argv[]) throws IOException  
   {        Strings();
   }                                                                                                        
}