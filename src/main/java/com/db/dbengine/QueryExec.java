package com.db.dbengine;

public class QueryExec {
	int f=0;int cwf=0;String str="Deccan Chargers";
	
	void execute(String[] header,String[] condfld,String field,CsvRead csv,String condone,String condtwo,String condthree) {
		
		for(int i=0;i<17;i++)
		{
			if(header[i].equals(field))
			{
				f=i;
			}
			
			if(header[i].equals(condone))
			{
				cwf=i;
			}
			
		}
		
		
	    for(int i=0;i<570;i++)
	    {
	    	if(condtwo.equals("=")) {
	    		if(csv.arr[i][cwf].equals(condthree))
	    		{
	    			System.out.println(csv.arr[i][f]);
	    		}
	    	}
	    	if(condtwo.equals("!=")) {
	    		if(!(csv.arr[i][cwf].equals(condthree)))
	    		{
	    			System.out.println(csv.arr[i][f]);
	    		}
	    	}
	    	if(condtwo.equals(">")) {
	    		if(Integer.parseInt(csv.arr[i][cwf])>(Integer.parseInt(condthree)))
	    		{
	    			System.out.println(csv.arr[i][f]);
	    		}
	    	}
	    	if(condtwo.equals("<")) {
	    		if(Integer.parseInt(csv.arr[i][cwf])>(Integer.parseInt(condthree)))
	    		{
	    			System.out.println(csv.arr[i][f]);
	    		}
	    	}
	    }
	    
	}
}