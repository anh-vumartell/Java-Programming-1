/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 35845
 */
public class SportRecords {
    private String hTeam;
    private String vsTeam;
    private int htPoints;
    private int vsPoints;
    private int gameCount; 
public SportRecords(String team1, String team2, int htPoints, int vsPoints){
    this.hTeam = team1;
    this.vsTeam = team2; 
    this.htPoints = htPoints;
    this.vsPoints = vsPoints;
}
public String result(String team){
    return team;   
    
}
public String getHomeTeam(){
    gameCount = gameCount + 1;
    return hTeam; 
    
}
public String getVisitingTeam(){
    gameCount = gameCount + 1;
    return vsTeam;
}
public int htPoints(){
    return this.htPoints;
}
public int vsPoints(){
    return this.vsPoints;
}
}
