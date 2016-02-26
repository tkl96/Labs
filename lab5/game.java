import java.util.*;
import java.lang.Math;
//import Tape_Dispenser;
//import Stapler;

public class game{
//	Tape_Dispenser dispenser=new Tape_Dispenser();
	public static void main(String[] args) {
		System.out.println("OFFICE QUEST");
		Stapler stapler= new Stapler();
		Tape_Dispenser dispenser= new Tape_Dispenser();
		Scanner scan = new Scanner(System.in);
		int turn =0;
		int time=480;
		boolean fail=false;
		String s=null;
		Random random1= new Random();
		Random random2= new Random();
		
		while(!fail && turn<24){
			System.out.println("Turn number: "+turn);
			turn++;
			time -= 20; 
			int hour = time / 60;
			int min = time % 60;
			System.out.println("You still have "+hour+" hour(s) and "+min+" minutes to go...");
			stapler.weight();
			dispenser.amount();
			
			int ran1=random1.nextInt(100);
			if (ran1 < 5){
				System.out.println("The delivery person came by with more staples!");
				stapler.add();
			}else if (ran1<10){
				System.out.println("The delivery person came by with more tapes!");
				dispenser.reset();
			}else{
				int page=1+random2.nextInt(60);
				System.out.println("The delivery person dropped off "+ page +" pages to collate!");
				do{
					System.out.print("[T]ape or [S]taple >");
					s=scan.nextLine();
				}while(!s.equals("T") && !s.equals("S"));
				if (s.equals("T")){
					dispenser.tape(page);
				} else{
					stapler.staple(page);
				}
			}
		}
		System.out.println("Congratulations, the day is done.");
		System.out.println("You survived your OFFICE QUEST.");
	}


}