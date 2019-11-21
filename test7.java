/* program to find the string that start with a and having onlu=y 3 letters in it*/

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;
public class test7
{
   public static void main(String []args)
   { 
	   List<String> str1=Arrays.asList("abbb","aaa","bbb","acd");
	   
	   List<String> sr=str1.stream().filter(str ->str.startsWith("a")).filter(str ->str.length() ==3)
			   .collect(Collectors.toList());
	   System.out.println(sr);
   }
}
