/*p. 192~194
##배열의 복사
	: 배열은 한번 생성하면 그 길이를 변경 할 수 없다. 더 많은 저장동간이 필요하면
	  보다 큰 배열을 새로 만들고 이전 배열로 부터 내용을 복사해야한다.
	:배열을 복사 하는 방법 두가지!
	1) for문을 이용해서 배열을 복사하는 방법
	
		int[] arr = new int[5];
		
		int[] tmp = new int[arr.length*2];	//기존 배열보다 길이가 2배인 배열 생성
		
		for(int i=0; i < arr.length; i++)
			tmp[i] = arr[i];		//arr[i]의 값을 tmp[i]에 저장
		arr = tmp;					//참조변수 arr이 새로운 배열을 가리키게 한다.
	
	: 이러한 작업들은 꽤나 비용이 듬. (처음부터 배열의 길이를 넉넉히 잡자)
		<단계별>
		1-1) 배열arr의 길이 arr.length의 값이 5이므로 길이가 10인 int배열 tmp가 생성
			 배열 tmp의 각 요소는 int의 기본값은 0으로 초기화
			 
			 int[] tmp = new int[arr.length*2];
		->	 int[] tmp = new int[5*2];
		->	 int[] tmp = new int[10];
		
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x100]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
		
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]	  [0]
 					0x200
		
		1-2)for문을 이용해서 배열 arr의 모든 요소에 저장된 값을 하나씩 배열 tmp에 복사
		for(int i=0; i < arr.length; i++)
			tmp[i] = arr[i];		//arr[i]의 값을 tmp[i]에 저장

			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x100]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]  arr[6]  arr[7]  arr[8]  arr[9]
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]	  [0]	  [0]	  [0]	  [0]	  [0]

		1-3) 참조변수 arr에 참조변수 tmp의 값을 저장
			 arr의 값은 0x100에서 0x200으로 바뀌고, arr은 배열 tmp를 가리키게 된다.
			 
			 arr = tmp; 	//변수 tmp에 저장된 값을 변수 arr에 저장
			 
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x100]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
	tmp-> arr로 복사
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]  arr[6]  arr[7]  arr[8]  arr[9]
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]	  [0]	  [0]	  [0]	  [0]	  [0]	

	: 결국 참조변수 arr과 tmp는 같은 배열을 가리키게 됨.
	: 배열 arr과 tmp는 이름만 다를 뿐, 동일한 배열.
	: 그전에 arr이 가리키던 배열은 더 이상 사용 불가.
	[참고] 배열은 참조변수를 통해서만 접근 가능, 자신을 가리키는 참조변수가 없는 배열은 사용할 수 없다.
		  이렇게 쓸모없게 된 배열은 JVM의 가비지 컬렉터에 의해서 자동적으로 메모리에서 제거됨.
	
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
	arr		  score[0]score[1]score[2]score[3]score[4]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]
 					0x100
	tmp-> arr로 복사 후, 주소값이 tmp와 같아짐.
			  arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]  arr[6]  arr[7]  arr[8]  arr[9]
	tmp		  score[0]score[1]score[2]score[3]score[4]score[5]score[6]score[7]score[8]score[9]
 	[0x200]	->[1]	  [2]	  [3]	  [4]	  [5]	  [0]	  [0]	  [0]	  [0]	  [0]		


	: 참조 변수에 대해서 자세히 배우지 않았음, 이해하기 어려움.
	: 지금은 배열의 길이를 변경해야할 때 이런식으로 처리한다는 정도만 이해 하자.
[예제 5-3]



 */







//[예제 5-3]
package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array3_배열늘리고복사 {

	public static void main(String[] args) {
		int[] arr = new int [5];
		
		//배열 arr에 1~5를 저장
		for(int i=0; i<arr.length; i++)
			arr[i] = i + 1;
		
		System.out.println("변경전 - arr.length:"+arr.length); 
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int [arr.length*2];

		//배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp;	//tmp에 저장된 값을 arr에 저장
		
		System.out.println("변경후-arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
	}

}
