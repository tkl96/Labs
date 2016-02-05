import java.util.Scanner;
public class lab4a{
	final static int buy = 3;
	final static int steal = -5;
	final static int dream = 0;
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String s=null;
		int happy=0;
		int cause,people;

		System.out.printf("Enter name > ");
		s = input.nextLine();
		
		do{
			System.out.println("(1) - Buy people ice cream");
			System.out.println("(2) - Steal ice cream from people");
			System.out.println("(3) - Dream about people eating ice cream");
			System.out.println("(4) - Die");
			System.out.printf("Enter next action of " +s+ " >");
			int command =Integer.valueOf(input.nextLine());
			
			switch (command){
				case 1: System.out.printf("How many people? > "); 
						people =Integer.valueOf(input.nextLine());
						cause=people*buy;
						happy+=cause;
						System.out.println("This action caused "+cause+" utils of happiness.");
						break;
				case 2: System.out.printf("How many people? > "); 
						people =Integer.valueOf(input.nextLine());
						cause=people*steal;
						happy+=cause;
						System.out.println("This action caused "+cause+" utils of happiness.");
						break;
				case 3: System.out.printf("How many people? > "); 
						people =Integer.valueOf(input.nextLine());
						cause=people*dream;
						happy+=cause;
						System.out.println("This action caused "+cause+" utils of happiness.");
						break;
				case 4: System.out.println(s+"caused "+happy+" utils of happiness.");
						if (happy>0){System.out.println("This was a morally good life.");}
						else if (happy<0){System.out.println("This was a morally evil life.");}
						else {System.out.println("This was a morally neutral life."); }
						System.exit(0);
						break;
			}
		}while(true);	
	}	
}