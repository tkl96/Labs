import java.util.Scanner;
public class lab4b{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		System.out.printf("Level > ");
		int level =Integer.valueOf(input.nextLine());
		switch(level){
			case 5: System.out.println("Self-actualization");
			case 4: System.out.println("Esteem");
			case 3: System.out.println("Love and Belonging");
			case 2: System.out.println("Safety");
			case 1: System.out.println("Physiological");
		}

	}
}