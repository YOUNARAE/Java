package chapter04_2_Confirm;

public class Chapter04206 {

	public static void main(String[] args) {
		/*
		 * for문을 이용해 다음과 같이 *를 출력하는 코드를 작성하세요
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		//줄이 1개씩 늘어나서 4개까지 생긴다.
		//1줄이 도는 동안 1개씩만 증가한다.
		for(int i=1;i<5;i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
