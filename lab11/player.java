import java.util.*;

public class player{
	
	static Scanner sc=new Scanner(System.in);
	static Random _rng = new Random();
	static int hp=100;
	static int mp=3;
	static boolean dragon=false;
	public static void dead(Monster m){
		if (hp<=0){
			System.out.println("You have been vanquished by the "+m.getName()+".");
			System.exit(0);
		}
	}

	public static void run(Monster m){
		int damage=m.attack(0);
		hp-=damage;
		System.out.println("You received "+damage+" points and run away");
	}

	public static void attack(Monster m){
		int hit= _rng.nextInt(15) + 1;
		int damage=m.attack(hit);
		hp-=damage;
		System.out.println("You dished out "+hit+" points, and you received "+damage+ " points.");
	}

	public static void berserk(Monster m){
		int hit= _rng.nextInt(15) + 1;
		int damage=m.berserk(hit);
		hp-=damage;
		System.out.println("You dished out "+hit*3+" points, and you received "+damage+ " points.");
	}

	public static void magic(Monster m){
		hp=100;
		mp--;
		System.out.println("You feel revitalized!");
		int damage=m.attack(0);
		hp-= damage;
		System.out.println("You are healed! But the monster attacks for "+damage+" points.");
	}

	public static Monster generate(int ran){
		if (ran<5){
			return new Goblin();
		} else if (ran<9) {
			return new Troll();
		} else {
			dragon=true;
			return new Dragon(); 
		}
	}

	public static void fight(Monster m){
		boolean flee=false;
		System.out.println("You encounter a "+m.getName()+"!");
		System.out.println("HP: "+hp+" MP: "+mp);
		System.out.println("Monster HP: "+ m._hp);
		while (m._hp>0 && !flee){
			System.out.println("(A)ttack");
			System.out.println("(B)erserk");
			System.out.println("(M)agic");
			System.out.println("(R)un away");
			System.out.print("Your choice > ");
			String s=sc.next();
			switch (s) {
				case "A":
					attack(m);
					break;

				case "B":
					berserk(m);
					break;

				case "M":
					if (mp>0){
						magic(m);
					} else{
						System.out.println("You have run out of MP!");
					}
					break;

				case "R":
					run(m);
					flee=true;
					break;
			}
			dead(m);
		}
		if (!flee){
			System.out.println("You have defeated the "+m.getName()+"!");
			System.out.println("You have gained "+m._hoard.monster()+" gold pieces!");
		}
	}

	public static void main(String[] args) {
		
		
		boolean won = false;
		while ( (!dragon) && (hp>0) ){
			Monster m=generate(_rng.nextInt(10));
			fight(m);
		}
		
			System.out.println("Number goblins defeated: "+Goblin._defeats);

			System.out.println("Number trolls defeated: "+Troll._defeats);
			System.out.println("Number dragons defeated: "+Dragon._defeats);
			System.out.println("Gold pieces acquired: "+Hoard.treasure);
				
	}
}