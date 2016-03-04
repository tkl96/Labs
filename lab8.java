import java.util.*;
public class lab8{
	

	static String[] init(int a){
		String[] s=new String[a];
		for (int i=0; i<s.length-1;i++){
			s[i]="***,";
		}
		s[s.length-1]="***";
		return s;
	}

	static String[] len(String[] s,int size){
		String[] str=new String[size];
		System.arraycopy(s, 0, str, 0,s.length);
		
		for (int i=s.length; i<size;i++){
			str[i]="***,";
		}
		//System.out.println(str.length);
		return str;
	}


	public static void main(String[] args) {
		String [] m;
		String [] p;
		int season=0;
		int size0=5;
		int sizem=5;
		int sizep=5;
		int num=0;
		int rsp=0;
		int rsm=0;
		Random ran=new Random(); 
		p= init(size0);
		m= init(size0);
		while (season<40){
			int r=ran.nextInt(4);
			season++;
			System.out.println("Season: "+season+", "+r+" rutabaga(s)");
			while(m.length<num+r) {
				m=len(m,sizem+2);
				System.out.println("Resized Martin's Garden to "+m.length+"!");
				rsm++;
				sizem+=2;
			}
			while(p.length<num+r) {
				p=len(p,2*sizep);
				System.out.println("Resized Pangloss's Garden to "+p.length+"!");
				rsp++;
				sizep*=2;
			}
			size0+=r;
			for (int i=0;i<r;i++){
				p[num]=r+",";
				m[num]=p[num];
				num++;
			}
		}
		p[p.length-1]="***";
		m[m.length-1]="***";
		System.out.print("[ ");
		for (String str:p) System.out.print(str);
		System.out.println(" ]");
		System.out.println("Pangloss Garden Size: "+p.length+", Resized "+rsp+" times.");

		System.out.print("[ ");
		for (String str:m) System.out.print(str);
		System.out.println(" ]");
		System.out.println("Pangloss Garden Size: "+m.length+", Resized "+rsm+" times.");
		
	}
}