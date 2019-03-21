package Pattern;
/*
1 
0 0 
1 1 1 
0 0 0 0 
1 1 1 1 1 

 */
public class p_5 {

	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==1) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}

	}

}
