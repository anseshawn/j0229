package t4_exam;
/*
	1 4 7
	2 5 8
	3 6 9 출력하기
*/
public class Star3 {
	public static void main(String[] args) {
		int su = -2;
		
		for(int i=1; i<=3; i++) { //항상 바깥쪽이 행, 안쪽이 열 (아직 배열 전이므로 라인 하나씩 봐야 함)
			for(int j=1; j<=3; j++) {
				su += 3;
				System.out.print(su+" ");
			}
			su -= 8; //7에서 3을 더한 10으로 출력되기 떄문에 8을 빼야함
			System.out.println();
		}
	}
}
