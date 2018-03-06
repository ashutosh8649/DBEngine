package com.db.dbengine;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead {
	IplRow[] ipl=new IplRow[1000];
	String arr[][]=new String[580][20];

public void read() throws Exception{
	
    String csvFile = "/home/sapient/Documents/stsworkspace/DBEngine/ipl.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    
  
    try {

        br = new BufferedReader(new FileReader(csvFile));
        int i=0;int k=0;
        while (i<578 && (line = br.readLine()) != null) {/////////////577
        	IplRow row=new IplRow();
        	if(i==0)
        	{
        		i++;
        		continue;
        	}
        	
            String[] str= line.split(cvsSplitBy);
            
            for(int l=0;l<17;l++) {
            	arr[k][l]=str[l];
            }
            k++;
            
			row.setId(str[0]);
			row.setSeason(str[1]);
			row.setCity(str[2]);
			row.setDate(str[3]);
			row.setTeam1(str[4]);
			row.setTeam2(str[5]);
			row.setToss_winner(str[6]);
			row.setToss_decision(str[7]);
			row.setResult(str[8]);
			row.setDl_applied(str[9]);
			row.setWinner(str[10]);
			row.setWin_by_runs(str[11]);
			row.setWin_by_wickets(str[12]);
			row.setPlayer_of_match(str[13]);
			if(str[14].startsWith("\"")) {
				str[14]=str[14]+","+str[15];
				row.setVenue(str[14]);
				row.setUmpire1(str[16]);
				row.setUmpire2(str[17]);
				//row.setUmpire3("");
			}
			else {
				row.setVenue(str[14]);
				row.setUmpire1(str[15]);
				row.setUmpire2(str[16]);
				//row.setUmpire3("");
			}
			ipl[i-1]=row;
			i++; 
        }
        
    } catch (FileNotFoundException e) {
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
    }
	public void print() {
		for(int i=0;i<577;i++) {
			System.out.print(ipl[i].getId());System.out.print(" ");
			System.out.print(ipl[i].getSeason());System.out.print(" ");
			System.out.print(ipl[i].getCity());System.out.print(" ");
			System.out.print(ipl[i].getDate());System.out.print(" ");
			System.out.print(ipl[i].getTeam1());System.out.print(" ");
			System.out.print(ipl[i].getTeam2());System.out.print(" ");
			System.out.print(ipl[i].getToss_winner());System.out.print(" ");
			System.out.print(ipl[i].getToss_decision());System.out.print(" ");
			System.out.print(ipl[i].getResult());System.out.print(" ");
			System.out.print(ipl[i].getDl_applied());System.out.print(" ");
			System.out.print(ipl[i].getWinner());System.out.print(" ");
			System.out.print(ipl[i].getWin_by_runs());System.out.print(" ");
			System.out.print(ipl[i].getWin_by_wickets());System.out.print(" ");
			System.out.print(ipl[i].getPlayer_of_match());System.out.print(" ");
			System.out.print(ipl[i].getVenue());System.out.print(" ");
			System.out.print(ipl[i].getUmpire1());System.out.print(" ");
			System.out.print(ipl[i].getUmpire2());System.out.print("\n");
			
		}
	}
}

