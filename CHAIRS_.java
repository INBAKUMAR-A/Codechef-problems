

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x,y;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++){
		    x=sc.nextInt();
		    y=sc.nextInt();
		    if(x>y)
		    {
		        System.out.println(x-y);
		    }
		    else{
		        System.out.println("0");
		        
		    }
		}
	}
}
