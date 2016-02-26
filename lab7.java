import java.util.*;
import java.io.*;
public class lab7{
	public static char[] generateUniverse(int size){
		char[] a = new char[size];
		for (int i=0;i<size;i++){
			a[i]='.';
		}

		for (int i=0;i<size;i+=5) {
			a[i]='^';
		}
		for (int i=0;i<size;i+=7) {
			a[i]='0';
		}
		return a;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("How big of a world? > ");
		size= sc.nextInt();
		
		char[] ch= new char[size];
		ch=generateUniverse(size);
		System.out.println(ch);
		String s="";
		while (!s.equals("Q")){
			s=sc.nextLine();
			
			if (s.equals("A")){
				for (int i=0;i<size-1;i++){
					if (ch[i]=='0'){
						ch[i]='1';
					}else if(ch[i]=='1'){
						ch[i]='2';
					}else if (ch[i]=='2'){

						if (ch[i+1]=='.'){
							ch[i+1]='2';
							ch[i]='.';
							i++;
						}else if (ch[i+1]=='^') {
							ch[i+1]='0';
							ch[i]='.';
							i++;
						}
					}

				}
			System.out.println(ch);

			}else if(s.equals("S")){
				int a=0,b=0,c=0;
				for (int i=0;i<size;i++) {
					if (ch[i]=='0') {b++;}
					else if (ch[i]=='1'){c++;}
					else if (ch[i]=='2'){a++;}
				}
				try{
					FileWriter fwriter = new FileWriter("Saved Universe.txt");
					PrintWriter outputFile = new PrintWriter(fwriter);
					outputFile.println(ch);
					outputFile.println("Babies: "+b);
					outputFile.println("Children: "+c);
					outputFile.println("Adults: "+a);
					outputFile.close();
				}catch(Exception exc){}
				System.out.println(ch);
			}	
		
		}
	}
}

//		while()
		
		
	
