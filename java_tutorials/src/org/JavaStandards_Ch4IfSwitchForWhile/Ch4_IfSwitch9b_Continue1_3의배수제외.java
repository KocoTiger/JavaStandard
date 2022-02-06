/*p. 176
#2.5 continue문
	: continue문은 반복문 내에서만 사용 가능
	: 반복문이 진행되는 도중, continue문을 만나면 반복문의 끝으로 이동, 다음 반복문으로 넘어감.
	: for 문의 경우 -> 증감식으로 이동
	: while문과 do-while문의 경우 -> 조건식으로 이동
 
 	: continue문은 반복문 전체를 벗어나지 않고 다음 반복을 계속 수행. <-> break와 다름.
 	: 주로 if문과 함께 사용하여
 	  특정 조건을 만족하는 경우, continue문 이후의 문장들을 수행하지 않고
 	  다음 반복으로 넘어가서 계속 진행하도록 함.
 	: 전체 반복 중, 특정 조건을 만족하는 경우를 제외하고자 할때 유용.
 [예제 4-31]
 
 	: 1과 10사이의 숫자를 출력하되,
 	  그중 3의 배수는 제외 if문(i%3==0)은 참이되어 continue문에 의해 반복문의 블럭끝으로 이동.
 중요!: 즉, continue는 continue문과 반복문 블럭의 끝} 사이의 문장들을 건너뛰고 반복을 이어감.
 	  
 
 
 
 */


// [예제 4-31]
package org.JavaStandards_Ch4IfSwitchForWhile;

public class Ch4_IfSwitch9b_Continue1_3의배수제외 {

	public static void main(String[] args) {
		for (int i=0; i <= 10; i++) {
			if (i%3==0)
				continue;
			System.out.println(i);
		} //블럭 끝, continue문이 포함된 if문이 참이면 일로 이동.(break문과 달리 반복문을 벗어나지 않음)
		

	}

}
