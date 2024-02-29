package t4_exam;

import java.util.Scanner;

//1~6사이의 숫자 입력후 난수를 발생하여 맞추기
public class Test4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice = (int)(Math.random()*6 + 1);
		int num;
		
		System.out.print("주사위의 숫자를 입력하세요: ");
		num = sc.nextInt();
		
		if(num == dice) System.out.println("정답입니다.");
		else System.out.println("답이 아닙니다. 출력된 주사위 수는 "+dice+" 입니다.");
		
		sc.close();
	}
}
