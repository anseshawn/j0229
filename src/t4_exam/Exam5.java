package t4_exam;

//4x + 5y = 60 를 만족하는 x와 y의 값을 구하시오. 단, x와 y는 10이하의 자연수입니다.
public class Exam5 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++)
				if((4*x + 5*y) == 60) {
					System.out.println("x = "+x+", y = "+y);
					cnt++;
				}
		}
		System.out.println("조건을 만족하는 개수는? "+cnt);
	}
}
