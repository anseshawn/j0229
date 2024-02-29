package t4_exam;
/*
	*****
	 ****
	  ***
	   **
	    *
*/
public class Star8 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) { //바깥쪽 for문 안에 공백 찍는 for문1, *찍는 for문2 두개
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
