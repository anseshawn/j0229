package t1_while;

import java.util.Scanner;

// 반복문 탈출
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, su, breakSu;
		
		System.out.print("1부터 출력할 수를 입력하세요: ");
		su = sc.nextInt();
		System.out.print("탈출할 수를 입력하세요: ");
		breakSu = sc.nextInt();
		
		while(i < su) {
			i++;
			System.out.println(i);
			if(i == breakSu) break;
		}
		
		sc.close();
	}
}
