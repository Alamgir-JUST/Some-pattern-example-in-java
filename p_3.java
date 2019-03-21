package Pattern;

import java.util.Scanner;
/*
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 * */
public class p_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1;i<=row;i++) {
			char c = 'A';
			for(int j = 1;j<=i;j++) {
				System.out.print(c++);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
