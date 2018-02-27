package com.db.dbengine;
import java.io.*;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws Exception {
		String condone="";String condtwo="";String condthree="";
		System.out.println("enter query");
	   	Scanner scanner = new Scanner(System.in);
		String qry = scanner.nextLine();
		scanner.close();
	    AllQuery obj=new AllQuery();
	    String[] spqry= obj.splqry(qry);
		String fname=obj.extfname(spqry);
		String beforewhr=obj.beforewhr(qry);
		String afterwhr=obj.afterwhr(qry);
		String restrictions=obj.restrictions(spqry,qry);
		String[] condfld=restrictions.split(" ");
		for(int i=0;i<condfld.length;i++) {System.out.println(condfld[i]);}
		System.out.println(condfld.length);
		int i=0,j=0,k=0,l=0;
			condone=condfld[i];i++;//
			while(!(condfld[i].equals("="))&&!(condfld[i].equals("!="))&&!(condfld[i].equals(">"))&&!(condfld[i].equals("<"))) {
				condone=condone+" "+condfld[i++];
			}System.out.println(condone);
			condtwo=condfld[i];
			System.out.println(condtwo);
			i++;condthree=condfld[i++];
			while(i<condfld.length&&!condfld[i].equals("or")&&!condfld[i].equals("and")) {
				condthree=condthree+" "+condfld[i++];
			}
			System.out.println(condthree);
		String grpfld=obj.grpfld(spqry,qry);
		String ordfld=obj.ordfld(spqry,qry);
		String aggselp=obj.aggselp(spqry);
		CsvRead csv=new CsvRead();
		csv.read();
		//csv.print();
		//String s=spqry[1];
		//System.out.println(csv.arr[5][7]);
		String[] header= {""};
	    String csvFile = "ipl.csv";
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













