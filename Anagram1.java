package lambda;

import java.util.*;

public class Anagram1 {

	 static boolean isAnagram(String a, String b) {
        
    if(a.length()!=b.length())
    return false;

    
            for(int i=0;i<a.length();i++)
            {
              
            }
            
           
        	return false;
}				

public static void main(String[] args) {
 
	
	long a1[]= {10,20,30};
	//LongStream.of(ar).sum();
     Scanner scan = new Scanner(System.in);
     String a = scan.next();
     String b = scan.next();
     scan.close();
     boolean ret = isAnagram(a, b);
     System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
 }
}



