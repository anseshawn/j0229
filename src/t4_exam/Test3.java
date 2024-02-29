package t4_exam;

import java.util.Scanner;

//숫자 맞추기 게임(1~100의 자연수)
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int rand = (int)(Math.random()*100) + 1;
		int cnt = 1, su;
		
		while(cnt <= 5) {
			System.out.print(cnt+". 수를 입력하세요(1~100): ");
			su = sc.nextInt();
			
			if(su == rand) {
				System.out.println("맞췄습니다...... 짝짝");
				break;
			}
			else if(su > rand) System.out.println("더 작은 수를 입력하세요.");
			else System.out.println("더 큰 수를 입력하세요.");
			cnt++;
		}
		if(cnt == 6) System.out.println("정답은 "+rand+" 였습니다. 다음 기회에...");
		
		sc.close();
	}
}
