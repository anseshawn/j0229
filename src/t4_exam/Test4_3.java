package t4_exam;

import java.util.Scanner;

//1~6사이의 숫자 입력후 난수를 발생하여 맞추기
public class Test4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int num, dice, ans;
		
		while(true) { //다회성을 위한 while 중첩
			while(true) {
				System.out.print("주사위의 숫자를 입력하세요: ");
				num = sc.nextInt();
				
				if(num >= 1 && num <= 6) break;
				System.out.println("1~6까지의 수를 입력하세요");
			}
			
			dice = (int)(Math.random()*6 + 1);
			//while문 안에 들어와있기 때문에 반복될 때마다 새로운 수가 만들어짐(고정시키고 싶은 경우엔 밖으로 뺀다)
			
			if(num == dice) System.out.println("정답입니다.");
			else System.out.println("답이 아닙니다. 출력된 주사위 수는 "+dice+" 입니다.");
			
			System.out.print("계속할까요?(1: 계속/0: 그만) ");
			ans = sc.nextInt();
			
			if(ans == 0) break;
			System.out.println();
		}
		System.out.println("작업끝......");
		
		sc.close();
	}
}
