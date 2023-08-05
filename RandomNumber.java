
import java.util.*;

class RandomNumber{
      
     public static void main(String args[])
    {

         int p = 0;
       while(p ==0){
         Random random = new Random();
         int a =  random.nextInt(1,100);
         Scanner sc = new Scanner(System.in);
         System.out.println("Guess a number :  "); // System.out.println("Guess a number :  "+a); them gus no. show by system
         
         int attempt = 5;
     
        
        for(int i =0;i<5; i++){
            
            int x = sc.nextInt();
            if(x==a){
                 System.out.println("Your guess is correct!!,wohhh. Your score is : "+(5-i));
                 System.out.println("Do you want to play this game agian. Please enter '0' for Yes , '1' for No");
                 p= sc.nextInt();
                 break;   
           }else if(x<a){
                 System.out.println("Your guess is less than the number  !.");
                 attempt -=1;
              }else{
                 System.out.println("Your guess is greater than number");
                 attempt -= 1;
              }
  
 
       }
 
      if(attempt == 0)
     { 
           System.out.println("Game is over ! .Your are out of attempts.");
           System.out.println("Do you want to play this game agian. Please enter '0' for Yes , '1' for No");
           p= sc.nextInt();
   
       }
    
         
     }    

    }
   

}