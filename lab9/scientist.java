public class scientist{
//	int[] test= new int[5];
	private int[] pos;
	public scientist (int[] w){
		pos=w;
	} 
	public  int[] move(int dim, int units){
		int[] local;
		local=pos;
		int index=(pos[dim-1]+units)%10;
		if (index<0){index=10+index;}
		//System.out.println(index);
		local[dim-1]=index;
//		world.location[local[0]][local[1]][local[2]][local[3]][local[4]]=10;
		//System.out.println(local);
		return local;
	}
}