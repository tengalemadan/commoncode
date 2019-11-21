package lambda;

import java.util.Scanner;

public class Anagram {

	 static boolean isAnagram(String a, String b) {
         int size[]=new int[26];
         int sum=0;	
         	
         	if(a.length()!=b.length())
        	 return false;

    
            for(int i=0;i<a.length();i++)
            {
               int j=a.toLowerCase().charAt(i)-97;
               size[j]++;

            }
            
           System.out.println("1st");
           for (int i : size) {
			System.out.print(" "+i);
		}
       
            for(int j=0;j<b.length();j++)
            {
            	int k=b.toLowerCase().charAt(j)-97;
            	if(size[k]==0)
            		return false;
            	size[k]--;
            }
 
            System.out.println();
            System.out.println("2nd");
            for (int i : size) {
 			System.out.print(" "+i);
 		}

            for(int m=0;m<26;m++)
            {
            	sum=sum+size[m];
            	if(sum==0)
            		return true;
            	
            }

    
            return false;
 }

public static void main(String[] args) {
 
     Scanner scan = new Scanner(System.in);
     String a = scan.next();
     String b = scan.next();
     scan.close();
     boolean ret = isAnagram(a, b);
     System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
 }
}


