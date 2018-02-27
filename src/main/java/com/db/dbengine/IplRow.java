package com.db.dbengine;  
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;


public class IplRow {

		int id=0;
		int season=0;
		String city="";
		Date date;
		String team1="";
		String team2="";
		String toss_winner="";
		String toss_decision="";
		String result="";
		int dl_applied=0;
		String winner="";
		int win_by_runs=0;
		int win_by_wickets=0;
		String player_of_match="";
		String venue="";
		String umpire1="";
		String umpire2="";
		String umpire3="";
		public int getId() {
			return id;
		}
		public void setId(String id) {
			this.id = Integer.parseInt(id);
		}
		public int getSeason() {
			return season;
		}
		public void setSeason(String season) {
			this.season =Integer.parseInt(season);
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(String date) throws Exception{
			this.date = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		}
		public String getTeam1() {
			return team1;
		}
		public void setTeam1(String team1) {
			this.team1 = team1;
		}
		public String getTeam2() {
			return team2;
		}
		public void setTeam2(String team2) {
			this.team2 = team2;
		}
		public String getToss_winner() {
			return toss_winner;
		}
		public void setToss_winner(String toss_winner) {
			this.toss_winner = toss_winner;
		}
		public String getToss_decision() {
			return toss_decision;
		}
		public void setToss_decision(String toss_decision) {
			this.toss_decision = toss_decision;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public int getDl_applied() {
			return dl_applied;
		}
		public void setDl_applied(String  dl_applied) {
			this.dl_applied = Integer.parseInt(dl_applied);
		}
		public String getWinner() {
			return winner;
		}
		public void setWinner(String winner) {
			this.winner = winner;
		}
		public int getWin_by_runs() {
			return win_by_runs;
		}
		public void setWin_by_runs(String win_by_runs) {
			this.win_by_runs =Integer.parseInt(win_by_runs) ;
		}
		public int getWin_by_wickets() {
			return win_by_wickets;
		}
		public void setWin_by_wickets(String win_by_wickets) {
			this.win_by_wickets =Integer.parseInt(win_by_wickets) ;
		}
		public String getPlayer_of_match() {
			return player_of_match;
		}
		public void setPlayer_of_match(String player_of_match) {
			this.player_of_match = player_of_match;
		}
		public String getVenue() {
			return venue;
		}
		public void setVenue(String venue) {
			this.venue = venue;
		}
		public String getUmpire1() {
			return umpire1;
		}
		public void setUmpire1(String umpire1) {
			this.umpire1 = umpire1;
		}
		public String getUmpire2() {
			return umpire2;
		}
		public void setUmpire2(String umpire2) {
			this.umpire2 = umpire2;
		}
		/*public String getUmpire3() {
			return umpire3;
		}
		public void setUmpire3(String umpire3) {
			this.umpire3 = umpire3;
		}*/

}