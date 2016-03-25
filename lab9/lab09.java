import java.util.*;

public class lab09{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		world theworld=new world();
		int[] loc = new int[5];
		while (true){
			System.out.print("Enter dimension to travel (1,2,3,4,5) (negative to quit) > ");
			int dim =sc.nextInt();
			if (dim<0) {
				System.out.println("The scientist gives up on the quest for understanding.");
				System.exit(0);
			}
			System.out.print("Enter units to travel (negative for backwards) > ");
			int units=sc.nextInt();
			
			scientist sci=new scientist(loc);
			loc=sci.move(dim, units);
			int color=0;
			
			for (int i=0; i<5;i++){
				loc[i]%=10;
			}

			System.out.print("Location: [");
			for (int a:loc){
				System.out.print(a+" ");
				color+=a;
				color%=10;
			}
		if (theworld.location[loc[0]][loc[1]][loc[2]][loc[3]][loc[4]]==10){
			System.out.println("] = White");}
		else{
			theworld.location[loc[0]][loc[1]][loc[2]][loc[3]][loc[4]]=10;

		//	for(int a:loc)System.out.print(a);
			
			//System.out.println(theworld.location);
  
				switch (color){
					case 1: System.out.println("] = Lime");break;
					case 2: System.out.println("] = Cerulean");break;
					case 3: System.out.println("] = Goldenrod");break;
					default: System.out.println("] = Black");break;
				}	
			}
		
		}
	}	
}