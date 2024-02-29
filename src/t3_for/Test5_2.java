package t3_for;

//중첩 for문: 바깥쪽 수행횟수 * 안쪽 수행횟수 = 전체 수행횟수
public class Test5_2 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+", j = "+j);
			}
			System.out.println();
		}
	}
}
