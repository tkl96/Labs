import java.lang.Math;

public class Tape_Dispenser{
	private double num=50;
	
	public void tape(int page){
		num-=page*0.25;
		if (num<0){
			System.out.println("You have run out of tape!");
     	    System.out.println("You could not survive the ordeal of the OFFICE QUEST.");
        	System.exit(0);        
		}
	}
	public void amount(){
		if (num>45){
			System.out.println("the Tape Dispenser looks full.");
		}else if (num >=35) {
			System.out.println("the Tape Dispenser is almost full.");
		}else if (num>=15) {
			System.out.println("the Tape Dispenser is about halfway full.");			
		}else if (num>0) {
			System.out.println("the Tape Dispenser is almost empty.");
		}else if (num==0) {
			System.out.println("the Tape Dispenser is empty.");
		}
	}
	
	public void reset(){
		num=50;
	}
	

}