package t1_while;

public class Test4 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			i++;
			//i 값이 짝수인 경우만 출력하시오.
			if(i % 2 == 0) System.out.println(i);
		}
	}
}
