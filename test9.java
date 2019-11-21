

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test9 {
	private int b;

	private int h;
	
	private boolean flag=true;


public test9(int b, int h, boolean flag) {
		super();
		this.b = b;
		this.h = h;
		this.flag = flag;
		
	}

/*public test9() 
{
	
	this.b = 0;
	this.h = 0;
	this.flag =true;
	//this.sc = sc;
}*/





public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	test9 t=new test9();
	t.b=sc.nextInt();
	t.h=sc.nextInt();
	if(t.b >= 0 && t.h >=0)
	{
	    t.flag=true;
	}
	else
	{
		t.flag=false;
	}
	
		if(t.flag){
			int area=t.b *t.h;
			System.out.print(area);
		}
		
	}//end of main



public test9() {
	super();
}

}//end of class
