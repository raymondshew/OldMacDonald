class NamedCow extends Cow
{
     //your code here
	    
     private String myName;   
     public NamedCow(String type, String sound, String name)     {         
         myType = type;         
         myName = name;   
         mySound= sound;
     }     
     public NamedCow()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getType(){return myType;}
     public String getName(){return myName;}
     public String getSound(){return mySound;}
}