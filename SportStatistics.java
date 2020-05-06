
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
             
        
        
        System.out.println("File: "); // prompt user for file's name
        String file = scan.nextLine();
        
        ArrayList<SportRecords> statistics = readRecord(file); //create list "statistics", value is returned by readRecord()
        
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        ArrayList<SportRecords> gamesOfTeam = new ArrayList<>(); // List for a particular team
        
        for (SportRecords game : statistics){
            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())){
                gamesOfTeam.add(game); 
                
            }
           
            
        }
        
        ArrayList<SportRecords> winGames = new ArrayList<>();
        
        for(SportRecords wins : winGames){
            if (wins.htPoints() > wins.vsPoints()){
                winGames.add(wins);
            }
        }
        System.out.println("Games: " + gamesOfTeam.size());
        System.out.println("Wins: " + winGames.size());
        System.out.println("Losses: " + (gamesOfTeam.size() - winGames.size()));
        
        
        
        
    }
    
    public static ArrayList<SportRecords> readRecord(String file){ // implement the readRecord method
            ArrayList<SportRecords> records = new ArrayList<>(); // create a list "records"
            
            
    try(Scanner reader = new Scanner(Paths.get(file))){ // user reader to read the file
            while(reader.hasNextLine()){
                String row = reader.nextLine();
                String[] parts = row.split(","); // split row into parts
                
                String hTeam = parts[0];
                String vsTeam = parts[1];
                        
                
                int htPoints = Integer.valueOf(parts[2]);
                int vsPoints = Integer.valueOf(parts[3]);
               
                
                records.add(new SportRecords(hTeam, vsTeam, htPoints, vsPoints));// add object to list "records"
                  
            }         
            
                    
            
        } catch (Exception e){
            System.out.println("Error");
        }
        return records; 
    }

}
