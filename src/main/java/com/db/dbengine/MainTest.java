package com.db.dbengine;
import java.io.*;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws Exception {
		String[] condone=new String[17];String[] condtwo=new String[17];String[] condthree=new String[17];
		System.out.println("enter query");
	   	Scanner scanner = new Scanner(System.in);
		String qry = scanner.nextLine();
		scanner.close();
	    AllQuery obj=new AllQuery();
	    String[] spqry= obj.splqry(qry);
		String fname=obj.extfname(spqry);
		String beforewhr=obj.beforewhr(qry);
		String afterwhr=obj.afterwhr(qry,spqry);
		String restrictions=obj.restrictions(spqry,qry);
		String[] condfld=restrictions.split(" ");
		//for(int i=0;i<condfld.length;i++) {System.out.println(condfld[i]);}
		//System.out.println(condfld.length);
		//int i=0,j=0,k=0,l=0;
		for(int i=0,j=0,k=0,l=0;i<condfld.length;i++)
		{	
			condone[j]=condfld[i++];//
			condtwo[k]=condfld[i++];
			condthree[l]=condfld[i++];
			while(i<condfld.length && !condfld[i].equals("or") && !condfld[i].equals("and")) {
				condthree[l]=condthree[l]+" "+condfld[i++];
			}
			System.out.println(condone[j]);
			System.out.println(condtwo[k]);
			System.out.println(condthree[l]);
			j++;k++;l++; 
		}
		String grpfld=obj.grpfld(spqry,qry);
		String ordfld=obj.ordfld(spqry,qry);
		String aggselp=obj.aggselp(spqry);
		CsvRead csv=new CsvRead();
		csv.read();
		String[] header= {""};
	    String csvFile = "/home/sapient/Documents/stsworkspace/DBEngine/ipl.csv";
	    BufferedReader br = null;
	    String line = "";
	    String cvsSplitBy = ",";
	    try {

	        br = new BufferedReader(new FileReader(csvFile));
	        line = br.readLine();
	        header= line.split(cvsSplitBy);
	        	
	    }
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    
	    QueryExec qe=new QueryExec();
	    System.out.println("below queryExec call");
	    qe.execute(header,condfld,spqry[1],csv,condone,condtwo,condthree);
		
		/*for(int i=0;i<577;i++)
		{
			if(csv.ipl[i].toss_winner.equals("Royal Challengers Bangalore") && csv.ipl[i].result.equals("normal")) {
				System.out.println(csv.ipl[i]);
			}
		}
		*/
	    
	

}

}














