/*p. 196~204

##1.6 배열의 활용
	: 다양한 예제를 이용하여 배열을 어떻게 활용하는 지 알아보자
	[예제 5-5]	총합과 평균				배열의 모든 요소를 더해서 총합과 평균을 구한다
	[예제 5-6]	최대값과 최소값			배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.
	[예제 5-7,8]	섞기(shuffle)			배열의 요소의 순서를 반복해서 바꾼다 (카드섞기, 로또 번호 생성)
	[예제 5-9]	임의의 값으로 배열 채우기	연속 또는 불연속적인 값들로 배열을 초기화 한다.
	[예제 5-10]	정렬하기(sort)			오름 차순, 내림차순으로 배열을 정렬
	[예제 5-11]	빈도수 구하기			배열에 어떤 값이 몇개 저장되어 있는지 세어서 보여준다.

 */



package org.JavaStandards_Ch5_Array;


public class Ch5_Array1_Array5_총합최대소값섞기배열임의의값정렬빈도수 {

	public static void main(String[] args) {
//[예제 5-5] 총합과 평균
//		int sum = 0;			//총점을 저장하기 위한 변수
//		float average = 0f;		//평균을 저장하기 위한 변수
//		
//		int[] score = {100,88,100,100,90};
//		
//		for(int i=0; i<score.length; i++) {
//			sum +=score[i];		//반복문을 이용하여 배열에 저장되어 있는 값들을 모두 더한다.
//		}
//		average = sum / (float)score.length;	//계산결과를 float로 얻기 위함
//		
//		System.out.println("총점 : "+ sum);
//		System.out.println("평균 : "+ average);
//		결과값:
//			총점 : 478
//			평균 : 95.6
/*
	: for문을 이용, 배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나누어서 평균을 구하는 예제.
	: 평균을 구하기 위해 전체 합을 배열의 길이인 score.length로 나눔.
	: 이때, Int와 int간의 연산은 int를 결과로 얻기 때문에 정확한 평균값을 얻지 못함.
	: score.length를 float값으로 변환하여 나눗셈을 하였다.
			478 / 5 -> 95
			478 / (float)5 -> 478 / 5.0f -> 95.6f		
 */
//[예제 5-6] 최대값과 최소값
//		int[] score = {79, 88, 91, 33, 100, 55, 95}; //7개, 0부터 6
//		
//		int max = score[0];	//배열의 첫번째 값으로 최대값 초기화 한다.
//		int min = score[0];	//배열의 첫번째 값으로 최소값 초기화 한다.	
//		
//		for(int i=1; i<score.length; i++) {
//			if(score[i] > max) {
//				max = score[i];
//			}else if(score[i] < min) {
//				min = score[i];
//			}
//		}//end for
//		System.out.println("최대값 :"+ max);
//		System.out.println("최소값 :"+ min);
//		결과값 : 
//			최대값 :100
//			최소값 :33
/*
		: 배열에 저장된 값 중에서 최대값과 최소값을 구하는 예제
		: 배열의 첫번째 요소 score[0]의 값으로 최대값을 의미하는 변수 max와
		  최소값을 의미하는 변수 min을 초기화 하였다.
		: 그 다음 반복문을 통해서 두번째 요소 score[1]부터 max와 비교하기 시작한다.
		: 만일 배열에 담긴 값이 max에 저장된 값보다 크다면, 이값을 max에 저장한다.
		: 이런식으로 배열의 마지막 요소까지 비교하고 나면 max에는 배열에 담긴 값 중에서
		  최대값이 저장
		: 최소값 min도 같은 방식으로 얻음.	
 */
//[예제 5-7] 섞기 (shuffle)
//		int[] numArr = new int[10];
//		
//		for (int i=0; i< numArr.length; i++) {
//			numArr[i] = i;	//배열을 0~9의 숫자로 초기화한다.
//			System.out.print(numArr[i]);
//		}
//		System.out.println();
//		
//		for(int i=0; i < 100; i++) {
//			int n = (int)(Math.random()*10);	//0~9중의 한 값을 임의로 얻는다.
//			int tmp = numArr[0];	//numArr[0]의 값을 변수 tmp에 저장
//			numArr[0] = numArr[n];	//numArr[3]의 값을 numArr[0]에 저장
//			numArr[n] = tmp;		//tmp값을 numArr[3]에 저장
//			//numArr[0]과 numArr[n]의 값을 서로 바꾼다.위에 세개의 식int tmp = numArr[0];~numArr[n] = tmp;
//		}
//		
//		
//		for (int i=0; i<numArr.length; i++)
//			System.out.print(numArr[i]);
/*		결과값 :
			0123456789
			5897034621 [참고. Math.random때문에 값이 달라짐]
		:길이가 10인 배열 numArr을 생성. 0~9의 숫자로 차례대로 초기화하여 출력
		: random()을 이용해서 배열의 임의의 위치에 있는 값과 배열의 첫번째 요소인
		  numArr[0]의 값을 교환하는 일을 100번 반복.
		: 만일 random()을 통해 얻은 값n이 3이라면, 외쪽의 코드는 오른쪽 처럼 된다.
		
		int tmp = numArr[0];		int tmp = numArr[0];
		numArr[0] = numArr[n];	->	numArr[0] = numArr[3];
		numArr[n] = tmp;			numArr[3] = tmp;
		
		:오른쪽 코드는 numArr[0]과 numArr[3]에 저장된 값을 서로 바꾸는 일을 한다.
		: 두 컵에 담긴 내용물을 서로 바꾸려면, 하나의 빈 컵이 더 필요한것처럼
		  별도 공간이 하나더 필요.
		: 여기서 변수 tmp가 빈 컵의 역할을 한다.
		
	[위의 코드를 단계별로 그림을 그린 것은 p.198 참고]		
*/
//예제[5-8]섞기 (로또번호 생성기)
//		//45개의 정수값을 저장하기 위한 배열 생성
//		int[] ball = new int[45];
//		
//		//배열의 각 요소에 1~45의 값을 저장
//		for (int i=0; i<ball.length; i++)
//			ball[i] = i+1;	//ball[0]에 1이 저장됨.
//			
//		int temp = 0;		//두 값을 바꾸는데 사용할 임시 변수
//		int j = 0;			//임의의 값을 얻어서 저장할 변수
//		
//		//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
//		//0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
//		for(int i=0; i<6; i++) {
//			j=(int)(Math.random()*45); //0~44범위의 임의의 값을 얻는다.
//			temp 	= ball[i];
//			ball[i] = ball[j];
//			ball[j] = temp;
//		}
//		
//		//배열 ball의 앞에서부터 6개의 요소를 출력한다.
//		for(int i=0; i<6; i++)
//			System.out.printf("ball[%d]=%d%n", i, ball[i]);
//		결과값: (랜덤)
//		ball[0]=35
//		ball[1]=32
//		ball[2]=33
//		ball[3]=3
//		ball[4]=28
//		ball[5]=41
/*
		: 로또번호를 생성하는 예제.
		: 길이가 45인 배열에 1부터 45까지의 값을 담은 다음 
		  반복문을 이용해서 배열의 첫번째 값과 random()에 의해서 
		  결정된 임의의 위치에 있는 값과 자리를 바꾸는 것을 6번 반복
		: 이것은 마치, 1~45까지의 번호가 쓰인 카드를 잘 섞은 다음 맨위의 6장을
		  꺼내는 것과 같다.
		: 45개의 요소 중, 앞에 6개의 요소만 임의의 위치에 있는 요소와 자리를 바꾸면 된다.
 */
/*
  ###임의의 값으로 배열 채우기
  		: 배열을 연속적인 범위의 임의의 값으로 채우는 것은 다음과 같이 random()만 사용하면
  		  쉽게 할 수 있을 것이다.
  			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*5); //0~4범위의 임의의 값을 얻는다.
  		: 불연속적인 범위의 값들로 배열을 채우는 것은 어떻게 해야할까?
  		: 배열을 하나 더 사용하면 된다.
  		: 먼저 배열 code에 불연속적인 값들을 담고, 임의로 선택된 index에 저장된 값으로
  		  배열 arr의 요소들을 하나씩 채우면 된다.
  		: 저장된 값에 상관없이 배열의 index는 항상 연속적이기 때문이다.
 */
//[예제 5-9]
//		int[] code = {-4, -1, 3, 6, 11}; //불연속적인 값들로 구성된 배열
//		int[] arr = new int[10];
//		
//		for(int i=0; i< arr.length; i++) {
//			int tmp = (int)(Math.random()*code.length);
//			arr[i] = code[tmp];			
//		}
//		
//		System.out.println(Arrays.toString(arr));

//		결과값 : [6, 11, 6, 3, 6, -1, 11, 3, -1, -1] 실행할때마다 달라짐
/*
		: 배열 code의 길이가 5, code.length의 값은 5
		: 변수 tmp에는 0~4범위에 속한 임의의 정수가 저장
		: 이 범위는 배열 code의 index의 범위와 일치
		
			int tmp = (int)(Math.random()*code.length);
			//tmp에 0,1,2,3,4 중의 하나가 저장
		
		:만일 i의 값이 0이고, tmp의 값이 4라면, 다음과 같이 계산됨.
		 arr[0]에는 code[4]의 값인 11이 저장
		:이와 같은 과정이 반복, 배열 arr에는 배열 code에 저장된 값들 중의 하나가
		 임의로 선택되어 저장.
 */
//[예제 5-11]	정렬하기(sort)		
//		int[] numArr = new int[10];
//		
//		for(int i=0; i<numArr.length; i++) {
//			
//			System.out.print(numArr[i] = (int)(Math.random() *10));
//		}
//		System.out.println();
//		
//		for(int i=0; i<numArr.length-1; i++) {
//			boolean changed = false;		//자리바꿈이 발생했는지를 체크
//			
//			for(int j=0; j<numArr.length-1-i; j++) {
//				if(numArr[j] > numArr[j+1]) {	//옆의 값이 작으면 서로 바꾼다.
//					int temp = numArr[j];
//					numArr[j] = numArr[j+1];
//					numArr[j+1] = temp;
//					changed = true; //자리 바꿈이 발생했으니 changed를 true로
//				}//end if
//			}//end for j
//			
//			if(!changed) break; //자리 바꿈이 없으면 반복문을 벗어난다.
//			
//			for(int k=0; k<numArr.length; k++)
//				System.out.print(numArr[k]);	//정렬된 결과를 출력한다.
//			System.out.println();
		}//end for i		
/*
		결과값 : 
		2532907625
		2325076259
		2230562579
		2203525679
		2023255679
		0222355679
		
		:길이가 10인 배열에 0과 9사이의 임의의 값으로 채운다음,
		: 버블정렬 알고리즘을 통해서 크기순으로 정렬하는 예제.
		: 이 알고리즘의 정렬 방법은 아주 간단...
		: 배열의 길이가 n일때, 배열의 첫 번째 부터 n-1까지의 요소에 대해, 
		  근접한 값과 크기를 비교하여 자리 바꿈을 반복
		  
		  for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {	//옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
		: 예를 들어 다음과 같이 길이가 5인 int배열이 있을 때, 첫번째와 두번쨰 요소의 값을 비교
		  해서 왼쪽 요소의 값이 크면 두 값의 위치를 바꿈. 그렇지 않을 경우 안바꿈
			  (1)
			[3][1][4][2][0] -> 왼쪽이 큼 -> 1 3 4 2 0
		: 이런식으로 반복
		  배열의 끝에 도달할때 까지 반복, 배열에서 제일 큰 값이 배열의 마지막 값이 됨.
		
			  (1)  (2) (3) (4)
	    	[3] [1] [4] [2] [0]  -> 1 3 2 0 4 ->4가 최대값
	   	: 비교회수는 모두 4번
	   	: 이 값은 배열의 길이보다 1이 작은 값(numArr.length -1)이다.
	   	: 즉 배열의 길이가 5라면, 4번을 비교하면 됨.
	   	: 나머지 값들이 아직 정렬이 되지 않음. 비교작업을 배열의 첫번쨰 요소부터 다시 해
	   	: 그러나 처음과 달리 이번엔 세번만 비교. 배열의 마지막 요소는 최대값이므로 비교할 필요가 없음.
	   	: 이처럼 비교작업을 반복할수록 비교해야하는 범위는 하나씩 줄어듬.
	   	: 그래서 원래는 배열의 길이에서 1이 작은 numArr.length -1번을 비교해야하지만
	   	: 매 반복마다 비교횟수가 1씩 줄어들기 떄문에 바깥쪽 for문의 제어변수 i를 빼주는 것.
		[참고] 왜 i를 빼주었는지에 대해서는 예제 4-14의 설명을 참고.			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {	//옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
		: 위의 작업이 한번 수행되는 것만으로는 정렬이 되지 않음.
		: 비교작업을 모두 4번 즉, 배열의 길이 -1번 반복 비교	
		
		: 그래서 바깥쪽 for문의 조건식이 numArr.length-1이어야 한는 것.
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false;		//자리바꿈이 발생했는지를 체크
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {	//옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; //자리 바꿈이 발생했으니 changed를 true로
				}//end if
			}//end for j
			
			if(!changed) break; //자리 바꿈이 없으면 반복문을 벗어난다.
			
			for(int k=0; k<numArr.length; k++)
				System.out.print(numArr[k]);	//정렬된 결과를 출력한다.
			System.out.println();
		}//end for i		
		
		:보다 효율적인 작업을 위해 changed라는 boolean형 변수를 두어서 자리바꿈이 없으면
		 break문을 수행하여 정렬을 마치도록 했다.
		 자리바꿈이 없다는 것은 정렬이 완료되었음을 뜻하기 때문
		: 이 정렬 방법을'버블 정렬'이라고 함(bubble sort)
		  비 효율적이긴 하지만, 가장 간단.
		System.out.print(numArr[i] = (int)(Math.random() *10));
		
		그리고 위의 문장은 아래의 두 문장을 하나로 합친것.
		1) numArr[i] = (int)(Math.random()*10);
		2) System.out.print(numArr[i]);
 */
//[예제5-11]
//		int[] numArr = new int[10];
//		int[] counter = new int[10];
//		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i] = (int)(Math.random()*10); //0~9의 임의의 수를 배열에 저장
//			System.out.print(numArr[i]);
//		}
//		System.out.println();
//		
//		for(int i=0; i<numArr.length; i++) {
//			counter[numArr[i]]++;
//		}
//		
//		for(int i=0; i<numArr.length; i++) {
//			System.out.println(i + "의 개수 :" + counter[i]);
//		}
/*
	결과값 : 
	8588798913
	0의 개수 :0
	1의 개수 :1
	2의 개수 :0
	3의 개수 :1
	4의 개수 :0
	5의 개수 :1
	6의 개수 :0
	7의 개수 :1
	8의 개수 :4
	9의 개수 :2
	
	: 길이가 10인 배열을 만들고 0과 9사이의 임의의 값으로 초기화 한다.
	: 그리고 이 배열에 저장된 각 숫자가 몇 번 반복해서 나타나는지를 세어서 배열 counter에 담은 다음
	  화면에 출력
	: 아래 코드만 이해하면 별 어려움 없을 듯
	  	for(int i=0; i<numArr.length; i++) {
				counter[numArr[i]]++;
	[책 참고로 보세요]
	: random()을사용했기 때문에 실행할 때마다 결과가 달라지겠지만, 실행 결과를 토대로
	  계산과정을 단계별로 살펴보면 다음과 같다.
	  		counter[numArr[i]]++;	//i의 값이 0인 경우를 가정하면,
	  ->	counter[numArr[0]]++;	//numArr[0] 의 값은 4이다
	  ->	counter[4]++; 			//counter[4]의 값을 1증가 시간다.
	: 배열 counter에서, 배열 numArr에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1증가
	: 그림에서는 numArr[0]에 4가 저장되어있으므로 배열 counter의 인덱스가 4인 요소에
	저장된 값이 0에서 1로 증가
	:과정 반복.
	: 배열 counter의 각 요소에는 해당 인덱스의 값이 몇번 나타났는지 알 수있는 값이 저장.
	
 */
		
		
	
	}//end main

}//end class
