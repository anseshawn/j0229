package t4_exam;

public class Test2 {
	public static void main(String[] args) {
		int lotto;
		String str = "";
		
		for(int i=1; i<=6; i++) {
			lotto = (int)(Math.random()*45 + 1); //1의 위치: 처음값 45의 위치: 마지막값 1~45
			str += lotto + " / "; //문자의 누적은 붙이기 str = str + lotto
		}
		System.out.println("금주의 로또 번호는? "+str); //중복 숫자 걸러내는 메소드는 아직
	}
}
