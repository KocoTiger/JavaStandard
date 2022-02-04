/*p. 163 ~166
[예제 4-18] 구구단
[예제 4-19] 3개의 반복문이 중첩되어있는 경우
[예제 4-20] 2중 반복문을 이용, i와j를 1부터 5까지 1씩 증가시키면서 i와j의 값을
		   쌍으로 출력. 
[예제 4-21] for와 if를 이용하여 조건에 맞는 쌍만 출력하게 하기.
  		   (2중 for문 안에 if문을 넣어서 조건에 맞는 쌍만 
		   출력함으로써 다양한 모양을 만들어 낼수 있다.)
	##향상된 for문(enhanced for statement)
		:JDK1.5부터 배열과 컬렉션에 저장된 요소에 접근할 때 기존보다 편리한 방법으로
		 처리할 수 있도록 for문의 새로운 문법이 추가되었다.
		 
		 for(타입 변수명 : 배열 또는 컬렉션){
		 		//반복할 문장
		 }

		: 위의 문장에서 타입은 = 배열 또는 컬렉션의 요소의 타입
		: 배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장.
		: 반복문의 괄호{}내에서는 이변수를 사용해서 코드를 작성
		  예를 들어 배열arr이 선언 되었을때...
		  
		  int[] arr = {10, 20, 30, 40, 50};
		:이 배열의 모든 요소를 출력하는 for문은....
			
			for(int i=0; i<arr.length; i++){
					System.out.println(arr[i]);
			}
		  
		  ->
		  
		  for(int tmp : arr){
		  		System.out.println(tmp);
		  }
[참고] 배열과 컬렉션은 모두 여러 값을 저장할 수있는 저장공간, 각각 5장, 11장에서 배우게 된다.

[예제 4-22]
  
  
 */




package org.JavaStandards_Ch4IfSwitchForWhile;

public class Ch4_IfSwitch7_For_구구단_배열총합 {

	public static void main(String[] args) {
//[예제 4-18] 구구단
//		for(int i = 2; i<=9; i++) 	//안쪽 for문을 8번 반복해서 출력
//			for(int j=1; j<=9; j++)	//하나의 단을 출력
//				System.out.printf("%d x %d = %d%n", i, j, i*j);
//			//두개의 for문 {}를 생략가능 (이유: for문안에 하나의 문장만 있기때문)
//
//[예제 4-19] 3개의 반복문이 중첩되어있는 경우
//		for (int i=1; i<=3; i++) {
//			for(int j=1; j<=3; j++) {
//				for(int k=1; k<=3; k++) {
//					System.out.println("" + i + j + k);
//				}
//			}
//		}
//		//총 27번 각 반복문이 3번씩 반복. 3의 3승 = 27
//		//i,j,k가 각각 1, 2, 3일때 식 
//		//"" + i + j + k -> "" + 1 + 2 + 3-> "1"+2+3 ->"12"+3->"123"
//		//[참고]위 과정이 이해가 안된다면, p35참고
//[예제 4-20] 
//		for (int i =1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.printf("[%d,%d]",i,j); //행으로 쭉 출력
//			}
//				System.out.println(); //5씩 끊어서 다른 줄로 옮김.
//									  //총 개수 25개 5*5
//		}
////[예제 4-21] for와 if를 이용하여 조건에 맞는 쌍만 출력하게 하기.
//		for (int i =1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(i==j) {
//					System.out.printf("[%d,%d]",i,j);
//				}else {
//					System.out.printf("%5c", ' ');
//				}//end else		
//		}//end for2
//					System.out.println();
//	}//end for1
//
//p.166 향상된 for문		
//		int[] arr = {10, 20, 30, 40, 50};
//		
//		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i]);
//	}
//			
//		
//		  for(int tmp : arr){
//		  		System.out.println(tmp);
//		  }
//[예제 4-21]
		int[]arr = {10,20,30,40,50};
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);	
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
	
	}

}
