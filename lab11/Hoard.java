import java.util.*;

public class Hoard{
	public static int treasure=0;
	public int monster(){
		Random ran = new Random();
		int gold=ran.nextInt(99)+1;
		treasure+=gold;
		return gold;
    }

    
}