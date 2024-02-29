package t4_exam;
/*
	3 2 1
	6 5 4
	9 8 7 출력하기
*/
public class Star4 {
	public static void main(String[] args) {
		int su = 4;
		
		for(int i=1; i<=3; i++) { //항상 바깥쪽이 행, 안쪽이 열 (아직 배열 전이므로 라인 하나씩 봐야 함)
			for(int j=1; j<=3; j++) {
				su--;
				System.out.print(su+" ");
			}
			su += 6; //Star3 참조
			System.out.println();
		}
	}
}
