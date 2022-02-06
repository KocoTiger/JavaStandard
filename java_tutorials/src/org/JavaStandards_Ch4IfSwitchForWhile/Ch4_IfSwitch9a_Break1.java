/*p. 175~176
#break문
	: switch문, 반복문에서도 break사용 가능
	: break문은 자신이 포함된 가장 가까운 반복문을 벗어남.
	: 주로if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 한다.
 [예제 4-30]
 
 	: 숫자를 1부터 계속 대해 나가서 몇까지 가면 합이 100을 넘는지 알아내는 예제.
 	: i 의 값을 1부터 1씩 계속 증가시켜가며, 더해서 sum에 저장
 	: sum의 값이 100을 넘으면 if문의 조건식이 참이므로break가 실행 (자신이 속한 반복문을 즉시 벗어남)
 	[참고] sum+=i와 ++i; 
 		두문 장을 sum += ++i;로 한문장으로  쓸수 있다.
 
 
 */







 //[예제 4-30]

package org.JavaStandards_Ch4IfSwitchForWhile;

	public class Ch4_IfSwitch9a_Break1 {
	
		public static void main(String[] args) {
			int sum = 0;
			int i = 0;
			
			while(true) {
				if(sum>100)
					break;
				
				++i;
				sum +=i;
			}//end while

			System.out.println("i=" + i);
			System.out.println("sum=" + sum);
	}

}
