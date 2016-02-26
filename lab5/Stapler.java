import java.lang.Math;

public class Stapler{
	private int num=10;
	

	public void staple(int page) {
		if (page<=50){
			num--;
		}else{
			System.out.println("Stapler jammed!");
			num-=3;
		}
		if (num<0){
			System.out.println("You have run out of stapler!");
     	    System.out.println("You could not survive the ordeal of the OFFICE QUEST.");
        	System.exit(0);           
    	}
	}

	public void add(){
		num+=10;
	}

	public void weight(){
		if (num>10){
			System.out.println("the stapler feels really heavy.");
		}else if (num >=5) {
				System.out.println("the stapler feels heavy.");		
		}else if (num>0) {
			System.out.println("the stapler feels light.");
		}else if (num==0) {
			System.out.println("the stapler feels really light.");
		}
	}

	public void check(){
    	if (num <= 0){
        	System.out.println("You have run out of stapler!");
     	    System.out.println("You could not survive the ordeal of the OFFICE QUEST.");
        	System.exit(0);           
    	}
    }

}