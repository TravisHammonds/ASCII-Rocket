//Travis Hammonds
//Lab4
//Oct 1 2021
//Dr. Nazli Hardy

import java.util.Scanner;

public class Rocket {
	
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Scale: ");
		int scale = scan.nextInt();
		System.out.println("Scale is: "+ scale);
		System.out.println();
		scan.close();
		
		drawCone(scale);
		drawLine(scale);
		drawHalf1(scale);
		drawHalf(scale);
		drawLine(scale);
		drawHalf(scale);
		drawHalf1(scale);
		drawLine(scale);
		drawCone(scale);		
		
	}
	public static void drawCone(int scale) {
		for (int row =1; row<=((scale*2)-1); row++) {
			for (int space=1; space <= ((scale*2)-row); space++) {
				System.out.print(" ");
			}
			for (int j=1; j<=row; j++) {
				System.out.print("/");
			}
			System.out.print("**");
			for (int k=1; k<=row; k++) {
				System.out.print("\\");
			}
		System.out.println();
		}
	}
	public static void drawLine(int scale) {
		for (int row=1; row<=1; row++) {
			System.out.print("+");
			for (int j=1; j<=(scale*2); j++) {
				System.out.print("=*");
			}
			System.out.print("+");
		}System.out.println();
	}
	public static void drawHalf1(int scale) {
		for (int row=1; row<=scale; row++) {
			System.out.print("|");
			for (int dot1=1; dot1<=(scale-row); dot1++) {
				System.out.print(".");
			}
			for (int j=1; j<=row; j++) {
				System.out.print("/\\");
			}
			for (int dot2=1; dot2<=(scale*2-(row*2)); dot2++) {
				System.out.print(".");
			}
			for (int k=1; k<=row; k++) {
				System.out.print("/\\");
			}
			for (int dot3=1; dot3<=(scale-row); dot3++) {
				System.out.print(".");
			}
			System.out.print("|");
			System.out.println();
		}
	}
	public static void drawHalf(int scale) {
		for (int row=scale; row>=1; row--) {
			System.out.print("|");
			for (int dot1=1; dot1<=(scale-row); dot1++) {
				System.out.print(".");
			}
			for (int j=1; j<=row; j++) {
				System.out.print("\\/");
			}
			for (int dot2=1; dot2<=(scale*2-(row*2)); dot2++) {
				System.out.print(".");
			}
			for (int k=1; k<=row; k++) {
				System.out.print("\\/");
			}
			for (int dot3=1; dot3<=(scale-row); dot3++) {
				System.out.print(".");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}
