/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 35845
 */
public class UserInterface {
    private Scanner scan;
    private ArrayList<Bird> birds;
    public UserInterface(Scanner scan){
        this.scan = scan;
        this.birds = new ArrayList<>();
    }
    
    public void start(){
        
        while(true){
            
            System.out.print("?");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                break;
            }
            
            if(command.equals("Add")){
                System.out.print("Name:");
                String name = scan.nextLine();
                System.out.print("Name in Latin:");
                String latinName = scan.nextLine();
                Bird aBird = new Bird(name,latinName);
                this.birds.add(aBird); 
            }  
            if(command.equals("Observation")){
                System.out.print("Bird?");
                String input = scan.nextLine();
                for(Bird bird: this.birds){ //Outputs does not look ok with this
                    if(bird.getName().contains(input)){
                        bird.addObservation(bird);
                        
                    } else{
                        System.out.println("Not a bird!");
                    }
                }                
                
            }
            if(command.equals("All")){
               printBirds(); 
            }
            if(command.equals("One")){
                System.out.print("Bird?");
                String input = scan.nextLine();
                printOneBird(input); 
            }
        }
                
    }
    
    
    public void addBird(Bird bird){
        this.birds.add(bird); 
    }
    public void printOneBird(String name){
        
        for(Bird bird: this.birds){
            if(bird.getName().contains(name)){
               System.out.println(bird);
            }
            
            
        }
    }
    public void printBirds(){
        int index = 0;
        while(index < this.birds.size()){
            System.out.println(this.birds.get(index));
            index++; 
        }
    }
    
   
}
