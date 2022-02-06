/*p. 194~195
###System.arraycopy()를 이용한 배열의 복사
	: for문대신 System클랙스의 arraycopy()를 사용하면 보다 간단하고 빠르게 배열을 복사 가능
	: for문은 배열의 요소 하나하나에 접근해서 복사
	: arraycopy()는 지정된 범위의 값들을 한번에 통째로 복사
	: 각 요소들이 연속적으로 저장되어 있다는 배열의 특성 때문에 이렇게 처리하는 것이 가능.

		배열의 복사는 for문보다 System.arraycopy()를 사용하는 것이 효율적.
	
	: 이전 예제에서 배열의 복사에 사용된 for문을 arraycopy()로 바꾸면,
		
			for(int i=0; i<num.length; i++) { newNum[i] = num[i]; }
 					위를 아래로 바꾸면
 			System.arraycopy(num, 0, newNum, 0, num.length);
 
 		System.arraycopy(num, 0, newNum, 0, num.length);
 	
 		num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
 			
 	: 이때 복사하려는 배열의 위치가 적절하지 못하여 복사하려는 내용보다 여유공간이 적으면
 	  에러가 발생.
 	  
 	[예제 5-4]
 	
 	: 다른 배열과 달리 char배열은 for문을 사용하지 않고도 print()나 println()으로
 	  배열에 저장된 모든 문자를 출력 가능.
 	
 	
 	
 	
 	
  
 */




//[예제 5-4]
package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array4_arraycopy {

	public static void main(String[] args) {
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc을 배열 num의 첫번째 위치로 부터 배열abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number의 인덱스 6위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);

	}

}
