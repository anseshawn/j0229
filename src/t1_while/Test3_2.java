package t1_while;

//무한 루프
public class Test3_2 {
	public static void main(String[] args) {
		byte i = 0;
		
		while(true) {
			i++;
			System.out.println(i+"안녕");
		}
		
		/*
		 무한 루프 시 뫼비우스의 띠로 묶여버림
		 127안녕
		 -128안녕
		 >> byte 출력 범위 때문
		 */
		
	}
}
