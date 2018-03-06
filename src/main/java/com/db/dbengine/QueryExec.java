package com.db.dbengine;

public class QueryExec {
	int field_index=0;int condone_index=0;String str="Deccan Chargers";
	
	void execute(String[] header,String[] condfld,String field,CsvRead csv,String[] condone,String[] condtwo,String[] condthree) {
		System.out.println("inside execute");
		for(int i=0;i<17;i++)
		{
			if(header[i].equals(field))
			{
				field_index=i;
			}
			
			if(header[i].equals(condone))
			{
				condone_index=i;
			}
			
		}
		
		
	    for(int i=0;i<570;i++)
	    {
	    	
	    	if(condtwo[0].equals("=")) {
	    		if(csv.arr[i][condone_index].equals(condthree[0]))
	    		{
	    			System.out.println(csv.arr[i][field_index]);
	    		}
	    	}
	    	if(condtwo[0].equals("!=")) {
	    		if(!(csv.arr[i][condone_index].equals(condthree[0])))
	    		{
	    			System.out.println(csv.arr[i][field_index]);
	    		}
	    	}
	    	if(condtwo[0].equals(">")) {
	    		System.out.println();
	    		if(Integer.parseInt(csv.arr[i][condone_index])>(Integer.parseInt(condthree[0])))
	    		{
	    			System.out.println(csv.arr[i][field_index]);
	    		}
	    	}
	    	if(condtwo[0].equals("<")) {
	    		if(Integer.parseInt(csv.arr[i][condone_index])>(Integer.parseInt(condthree[0])))
	    		{
	    			System.out.println(csv.arr[i][field_index]);
	    		}
	    	}
	    }
	    
	}
}
