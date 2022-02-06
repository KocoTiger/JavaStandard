/*p. 187~192
###배열의 길이
	: 앞서 배운것과 같이 배열을 생성 할때, 괄호 안에 []배열의 길이를 적어줘야함
	  (배열의 길이는 배열의 요소의 개수, 즉 값을 저장할 수 있는 공간의 개수)
	: 배열의 길이는 양의 정수이어야 함.
	: 최대값은 int타입의 최대값 (약 20억)
	  (실제로 이렇게 큰 배열을 생성하는 경우는 꽤 드뭄. 배열의 길이는 거의 제약이 없다고 할 수 있다.)
	
			타입[] 배열이름 = new 타입[길이];
			int[] arr	= new int[5];	//길이가 5인 배열
	
	: 길이가 0인 배열도 생성이 가능. (값을 저장할 수 있는 공간이 하나도 없다는 뜻인데 무슨 의미?)
			int[] arr = new int[0]; //길이가 0인 배열도 생성 가능
	
	: 프로그래밍을 하다보면 길이가 0인 배열이 필요한 상황이 있고 나름 유용
			배열의 길이는 int범위의 양의 정수 (0도 포함)이어야 한다.

### 배열 이름.length
	: 자바에서는 JVM이 모든 배열의 길이를 별도로 관리 (배열이름.length)를 통해서 배열의 길이에 대한 정보를 얻을 수 있다)
		int[] arr = new int[5];
		int tmp = arr.length;	//arr.length의 값은 5 tmp에 5가 저장
	
	: 배열은 한번 생성하면 길이를 변경할 수 없다. (이미 생성된 배열의 길이는 변하지 않음)
	: 따라서, 배열이름.length는 상수!!!!!
	  즉, 값을 읽을 수만 있을 뿐 변경할 수 없다.
		int[] arr = new int [5];
		arr.length = 10;		//에러 배열의 길이는 변경 불가
	: for문을 이용해서 출력, 배열score의 길이 6, 인덱스의 범위 0~5
		int[] score = new int [6];
		
		for (int i=0; i<6;, i++){
				System.out.println(score[i]);
  		}
  	: 만약, 배열의 길이를 줄인다면, for문에서 사용되는 조건의 범위도 변경해줘야함.
  		int[] score = new int [5];
		
		for (int i=0; i<6;, i++){
				System.out.println(score[i]);
  		}
  	: 그래서!!!!!!!!! for문의 조건식에 배열의 길이를 직접 적어주는것 보다!
  	  배열이름.length를 사용!하는 것이 좋다.
  		int[] score = new int [5];
		
		for (int i=0; i<score.length;, i++){ //조건식을 변경하지 않아도 됨.
				System.out.println(score[i]);
  		}  
  
  	: 여기서 for문을 예로 들었지만, 모든 경우에 배열의 길이를 직접 적어주는 것보다
  	  배열이름.length를 사용하는 것이 코드의 관리가 쉽고 에러가 적다.
 
 ### 배열의 길이 변경하기.
 	: 배열은 한번 선언되고 나면 길이를 변경 할 수 없다고 배웠지만!
 	: 배열에 저장 공간이 부족한 경우?
 	: 이때는 더큰 길이의 새로운 배열을 생성한다음, 기존의 배열에 저장된 값들을 새로운 배열에 복사하면 된다!
 	
 			배열의 길이를 변경하는 방법:
 			1) 더 큰 배열을 새로 생성
 			2) 기존 배열의 내용을 새로운 배열에 복사
 	: 이러한 작업들은 꽤나 비용이 많이 듬.
 	: 처음부터 배열의 길이를 넉넉하게 잡아줘서 새로 배열을 생성해야하는 상황이 가능한 적게 발생하도록 해야함
 	: 너무 크게 잡으면 메모리 낭비, 기존의 2배정도의 길이로 생성하는 것이 좋다.
 	[참고 1.5 배열의 복사]

## 1.4 배열의 초기화
	: 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값을 초기화
	: 배열을 사용하기 전에 따로 초기화를 해주지 않아도 됨.
	: 원하는 값을 저장하려면 아래와 같이 각 요소마다 값을 지정해 줘야 한다.
	
			int[] score = new int [5];		//길이가 5인 int형 배열을 생성한다
			score[0] = 50;					//각 요소에 직접 값을 저장
  			score[1] = 60;
  			score[2] = 70;
  			score[3] = 80;
  			score[4] = 90;

  	: 배열의 길이가 큰 경우에는 이렇게 요소 하나하나에 값을 지정하기 보단 for문을 사용
  			int[] score = new int [5];
  			
  			for(i=0; i<score.length; i++){
  				score[i] = i * 10 +50;
  			}
  	: 그러나 for문으로 배열을 초기화 하려면, 저장하려는 값에 일정한 규칙이 있어야만 가능
  	: 그래서 자바에서는 다음과 같이 배열을 간단히 초기화 할 수 있는 방법을 제공!!!!!!!!
  			int[] score = new int []{50, 60, 70, 80, 90};//배열의 생성과 초기화를 동시에
  	: 괄호안에 저장할 값들을 쉼표로 구분, 나열하면 됨
  	: []괄호안에 배열의 길이는 적지 않는다.
  	: {}괄호 안에 적힌 값의 개수에 의해 배열의 길이가 자동적으로 결정되기 때문임.
  			int[] score = new int []{50, 60, 70, 80, 90};
  			int[] score = {50, 60, 70, 80, 90}; // new int []생략 가능
  	:심지어, new int[]를 생략 가능
  	: 중요!다만! 배열의 선언과 생성을 따로 하는 경우에는 생략할 수 없다!!!
  		<new int[] 생략 불가능한 상황!>
  			
  			int[] score;
  			score = new int[]{50,60,70,80,90};	//ok
  			score = {50,60,70,80,90};			//에러 new int를 생략할수 없다.
  	
  	: 또 다른 예! 메서드!에서
  	: 아래와 같이 매개변수로 int배열을 받는 add 메서드가 정의 되어 있고
  	  이 메서드를 호출해야할 경우 역시 new 타입[]을 생략할 수 없다.
  	
  			int add(int[] arr) {내용 생략} //add 매서드
  			
  			int result = add(new int[]{100,90,80,70,60}); //ok
  			int result = add({100,90,80,70,60});		  //에러.new int[]를 생략할 수 없음.
 
  	: 그리고 {}안에 아무것도 넣지않으면, 길이가 0인 배열이 생성
  	: 참조변수의 기본 값은 null임
  	: 배열을 가리키는 참조변수는, null	대신 길이가 0인 배열로 초기화 하기도 함.
  	: 아래의 3문장은 모두 길이가 0인 배열을 생성
  			int[] score = new int [0];		//길이가 0인 배열
  			int[] score = new int []{};		//길이가 0인 배열
  			int[] score = {};				//길이가 0인 배열
  	
  	###배열의 출력
  	: 배열을 초기화 할때 for문을 사용 하듯, 
  	: 배열에 저장된 값을 학인 할때도 다음과 같이 for문을 사용
  	
  			int[] iArr = {100,95,80,70,60};
  	
  			//배열의 요소를 순서대로 하나씩 출력
  			for(int i =0; i <iArr.length; i++){
  				System.out.println(iArr[i]);
  			}
  	: println메서드는 출력 후에 줄 바꿈을 하므로, 여러 줄에 걸쳐 출력되어 보기 불편할 때가 있다.
  	: 그럴때는 출력 후에  줄 바꿈을 하지 않는 print메서드를 사용하는 것이 좋다.
			int[] iArr = {100,95,80,70,60};
  	
  			//배열의 요소를 순서대로 하나씩 출력
  			for(int i =0; i <iArr.length; i++){
  				System.out.print(iArr[i]+",");
  			}  	
  			System.out.println();	//다음 출력이 바로 이오지지 않도록 줄 바꿈을 한다.
  	
  	: 더 간단한 방법은 "Arrays.toString(배열이름)메서드를 사용
  	: 이 메서드는 배열의 모든 요소를 [첫번째 요소, 두번째 요소,...] 와 같은 형식의 문자열로 만들어 반환.
  	[참고] Arrays.toString()을 사용하려면, import java.util.*;를 추가 해줘야 한다.
  	
  			int[] iArr = {100,95,80,70,60};
  			//배열 iArr의 모든 요소를 출력한다. [100,95,80,70,60]이 출력된다.
  			System.out.println(Arrays.toString(iArr)); 
  	
  	: 만일 iArr의 값을 바로 출력하면 어떻게 될까?
  	: iArr은 참조 변수니까 변수에 저장된 값, 즉 배열의 주소가 출력 될 것(잘 생각 하는 것)
  	: 하지만! 이런 예상과는 다르게 타입@주소의 형식으로 출력
  			[I는 1차워 int배열이 라는 의미, @뒤에나오는 16진수는 배열의 주소.실제 주소가 아닌
  			내부 주소. (배열을 가리키는 참조변수를 출력해봐야 별로 얻을 정보가 없다)]
  			
  			//배열을 가리키는 참조변수 iArr의 값을 출력한다.
  		 	System.out.println(iArr);	//[I@14318bb와 같은 형식의 문자열이 출력

	: 예외적으로 char배열은 println메서드로 출력하면 각 요소가 구분자 없이 그대로 출력
	: 이것은 println메서드가 char배열일 때만 이렇게 동작하도록 작성이 되었기 때문
	
			char[] chArr = {'a','b','c','d'};
  			System.out.println(chArr);	//abcd가 출력됨
 [예제 5-2]
  	
  	
  	
  	
  		
  
  
 */





//[예제 5-2]
package org.JavaStandards_Ch5_Array;

import java.util.*;	//Arrays.toString()을 사용하기 위해
public class Ch5_Array1_Array2 {

	public static void main(String[] args) {
	  	int[] iArr1 = new int[10];
	  	int[] iArr2 = new int[10];
//	  	int[] iArr3 = new int[] {100,95,80,70,60};
	  	int[] iArr3 = {100,95,80,70,60};
	  	char[] chArr= {'a','b','c','d'};
	  	
	  	for (int i=0; i<iArr1.length; i++) {
	  		iArr1[i] = i + 1;	//1~10의 숫자를 순서대로 배열에 넣는다(0~9번까지)
	  	}
	  	for (int i=0; i<iArr2.length; i++) {
	  		iArr2[i] = (int)(Math.random()*10) +1;	//1~10에서 10의 값을 배열에 저장
	  	}	
		//배열에 저장된 값들을 출력한다.
	  	for (int i=0; i<iArr1.length; i++) {
	  		System.out.print(iArr1[i]+",");
	  	}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr1);
		System.out.println(iArr2);
		System.out.println(iArr3);
		System.out.println(chArr);

	}

}
