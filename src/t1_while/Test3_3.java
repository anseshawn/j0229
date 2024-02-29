package t1_while;

//무한 루프
public class Test3_3 {
	public static void main(String[] args) {
		int i = 0;	//int 표현 범위까지 출력 됨(최댓값까지 출력되면 다시 -값으로 돌아감)
		
		while(true) {
			i++;
			System.out.println(i+".안녕");
			
			if(i == 10) break; //무한 루프 탈출
		}
		
	}
}
