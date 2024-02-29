package t1_while;

//무한 루프
public class Test3_4 {
	public static void main(String[] args) {
		int i = 0;
		boolean run = true; //값을 true false만 가질 수 있음
		
		while(run) {
			i++;
			System.out.println(i+".안녕");
			
			//if(i == 10) break;
			if(i == 10) run = false; //논리값이 거짓이 되는 순간 탈출
		}
		
	}
}
