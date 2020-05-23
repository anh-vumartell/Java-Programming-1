/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author 35845
 */
public class Bird {
    private String name;
    private String latinName;
    private ArrayList<Bird> observations; 
    
    public Bird(String name, String latinName){ // Bird's object contructor
        this.name = name;
        this.latinName = latinName;
        this.observations = new ArrayList<>();
    }
    public void addObservation(Bird bird){        
        this.observations.add(bird);
        
    }
    public String getName(){
        return name;
    }
    public String getLatinName(){
        return latinName;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLatinName(String latinName){
        this.latinName = latinName; 
    }
    @Override
    public String toString(){
        if(this.observations.size() < 2){
          return this.name + "(" + this.latinName + "):" + this.observations.size() + " observation";  
        } 
       return this.name + "(" + this.latinName + "):" + this.observations.size() + " observations";
    }
}
