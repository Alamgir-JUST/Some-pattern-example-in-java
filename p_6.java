package Pattern;
/*
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 
*/
public class p_6 {
	public static void main(String[] args) {
		int row=5;
		int c = 65;
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(c+i));
				System.out.print(" ");
			}
			//c = (char) (c+i);
			System.out.println();
		}

	}
}
