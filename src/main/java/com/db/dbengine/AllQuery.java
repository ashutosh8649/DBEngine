package com.db.dbengine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllQuery {

		public String[] splqry(String qry)
		{
			String[] sepqry = qry.split(" ");
		      for (String eaqry : sepqry) {
		         System.out.println(eaqry);
		      } 
		      return sepqry;
		}

		public String extfname(String[] spqry) {
			String str="";
			System.out.println("file name");
		    	 for(int i=0;i<spqry.length;i++) {
		    		 if(spqry[i].endsWith(".csv")) {
		    			 str=spqry[i];
		    			 System.out.println(spqry[i]);
		    		 }
		    	 }
		    	 return str;
		}
		public String beforewhr(String qry)
		{		
			String beforewhere="";
			System.out.println("beforewhere");
			    if(qry.contains("where"))
			    { 
			     beforewhere=qry.substring(0, qry.indexOf("where"));
			     System.out.println(beforewhere);
			    }
		 	  return beforewhere;
		}
		
		public String afterwhr(String qry,String[] sepqry)
		{	
			String afterwhr="";
			System.out.println("afterwhere:");
			if(qry.contains("where")) {
				int i=0;
				while(!sepqry[i].equals("where")) {i++;}
				i++;
				afterwhr=sepqry[i++];
				while(i<sepqry.length)
				{afterwhr+=" "+sepqry[i++];}
			 System.out.println(afterwhr);
			}
			return afterwhr;
		}
			
		
		
		public String restrictions(String[] sepqry, String qry)
		{	
			int i=0;
			String str="";System.out.println("conditions:");
				while(i<sepqry.length && !(sepqry[i].equals("where"))){i++;}
				i++;
				str=sepqry[i++];
				while(i<sepqry.length && !sepqry[i].equals("groupby")&& !sepqry[i].equals("orderby")){
					str+=" "+sepqry[i];//
					i++;
				}
				System.out.println(str);
			return str;
		}
		
		public String grpfld (String[] sepqry,String qry)
		{		
				int j;String str= "";//
				System.out.println("GroupBy field:");
			    if(qry.contains("groupby"))
			    {
			    	
			    	for (j=0;j< sepqry.length;j++) {
			 		 if(sepqry[j].equals("groupby"))
			 		 {
			 			 str=sepqry[j+1];
			 			
			 			 System.out.println(sepqry[j+1]);
			 		 }
			 	  }
			    }
			    return str;
	}
		public String ordfld(String[] sepqry,String qry)
	{			
				int j; String str="";
				System.out.println("OrderBy field:");
			    if(qry.contains("orderby"))
			    {
			    	for (j=0;j< sepqry.length;j++) {
			 		 if (sepqry[j].equals("orderby"))
			 		 {
			 			 str=sepqry[j+1];
			 			 System.out.println(sepqry[j+1]);
			 		 }
			 	  }
			    }
			    return str;
	}	     
		public String aggselp(String[] sepqry)
	{
		      String str="";
		      System.out.println("Selected Parts/aggregate fileds:");
		      for(int i=0;i<sepqry.length;i++)
		      {
		    	  if(sepqry[i].equals("max")||sepqry[i].equals("min")||
		    			  sepqry[i].equals("count")||sepqry[i].equals("sum")||
		    			  sepqry[i].equals("avg")) {
		    		  System.out.println("agrregate fields:");
		    	  System.out.println(sepqry[i]);
		    	  str=sepqry[i];
		    	  }
		      }
		      return str;
		}
	}
	

