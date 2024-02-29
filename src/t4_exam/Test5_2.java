package t4_exam;

import java.util.Scanner;

//최댓값 구하기(초기값 지정방식)
public class Test5_2 {
	public static void main(String[] args) {
		//단, 2자리 이하의 정수만을 입력받는다.
		Scanner sc = new Scanner(System.in);
		int max=-99, min=99, su;
		
		while(true) {
			System.out.print("수를 입력하세요(종료시 999입력): "); 
			su = sc.nextInt();
			
			if(su == 999) break;
			
			if(su > max) max = su;
			if(su < min) min = su; //switch없이 반복(틀린 건 아니지만 비효율적이다)
		}
		
		System.out.println("최댓값 : "+max+", 최솟값 : "+min);
		
		sc.close();
	}
}
