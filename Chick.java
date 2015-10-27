class Chick implements Animal 
{     
     //your code here
	 private String myType;     
     private String mySound;
     private int random;      
     public Chick(String type, String sound, String sound2)     {         
         myType = type;        
         random = ((int)(Math.random()*2)); 
         if(random == 0){
    		mySound = sound;} 
    		else
    	mySound = sound2;   
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}