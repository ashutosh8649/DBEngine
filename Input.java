package com.ashutosh.dbengine;

import java.util.Scanner;

public class Input {

	static public final String WITH_DELIMITER = "((?<=%1$s)|(?=%1$s))";

		public void splitStr()
		{
			
		System.out.println("enter query");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(String.format(WITH_DELIMITER, "[' ';,<=>=]"));
		sc.close();
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(arr[i].equals(" "))
			{
				for(int j=i+1;j<len;j++)
				{
					arr[j-1]=arr[j];	
				}
				len--;
			}
		}
		for(int i=0;i<len;i++)
		{
		 System.out.println(arr[i]);
		}
}
}
