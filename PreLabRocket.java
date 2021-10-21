//Travis Hammonds
//PreLab4
//Sep 29, 2021
//Dr. Nazli Hardy

public class PreLabRocket {
	public static final int x = 6;
	public static void main(String[] args) {
		drawCone();
		drawLine();
		drawHalf1();
		drawHalf(); 
		drawLine();
		drawHalf();
		drawHalf1();
		drawLine();
		drawCone();
	}
	public static void drawCone() {
		for (int i=1; i<=(x); i++) {
			for(int j=1; j<=(x-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("/");
			}
			System.out.print("**");
			for(int j=1; j<=i; j++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
	public static void drawLine() {
		for(int i=1; i<=1;i++) {
			System.out.print("+");
			for(int j=1; j<=x+1; j++) {
				System.out.print("=*");
			}
			System.out.println("+");
		}
	}
	public static void drawHalf1() {
		for(int i=1; i<=(x+1)*2; i++) {
			System.out.print("|");
			for(int j=1; j<=(3-i); j++) {
				System.out.print(".");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("/\\");
			}
			for(int j=1; j<=6-(2*i); j++) {
				System.out.print(".");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("/\\");
			}
			for(int j=1; j<=3-i; j++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}	
	public static void drawHalf() {
		for(int i=x-2; i>=1; i--) {
			System.out.print("|");
			for(int j=1; j<=(3-i); j++) {
				System.out.print(".");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("\\/");
			}
			for(int j=1; j<=6-(2*i); j++) {
				System.out.print(".");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("\\/");
			}
			for(int j=1; j<=3-i; j++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
}
