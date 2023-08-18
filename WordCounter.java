import java.util.*;

class WordCounter{
    
     public static void main(String args[]){
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a text ..!");
            String input = sc.nextLine().trim();
            String[] words = input.split("\\s+");
            int counter=0;
           for(String w :words){
               counter+=1;

           }
          System.out.println("Number of words :" +counter);
            
            
                
  
     }
   

}