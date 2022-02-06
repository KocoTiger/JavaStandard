/*p. 178
  # 이름 붙은 반복문
  	: break문은 근접한 단하나의 반복문만 벗어날 수 있다.
  	: 여러개의 반복문이 중첩된 경우, break문으로 중첩 반복문을 완전히 벗어날 수 없다.
  	: 이떄는 중첩 반복문 앞에 이름을 붙이고 break문과 continue문에 이름을 지정
  	  하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수있다.
  	 [예제 4-33]
  
  	: 구구단을 출력하는 예제
  	: 제일 바깥에 있는 for문에 Loop1이라는 이름을 붙임
  	: 그리고 j가 5일때 break문을 수행하도록 함.
  	: 반복분의 이름이 지정되지 않은 break문은 자신이 속한 하나의 반복문만 벗어날 수있음
  	  하지만, 지금처럼 반복만에 이름을 붙여주고 break문에 반복문 이름을 지정해 주면 하나 이상의 반복문도
  	  벗어날 수있음.
  	: j가 6일때 반복문 Loop1을 벗어낟록 했으므로 2단의 4번째 줄 까지 밖에 출력되지 않았다.
  	: 만일 반복문의 이름이 지정되지 않은 break문이었다면 2단 부터 9단까지 모두 네줄씩 출력되었을 것. 
  	
  	: 예제에서 break Loop1;아래의 세 문장을 주석 처리했음
  	: 이 네 문장(2개의 break문 2개의 continue문) 중의 하나를 선택하고 선택한 문장을 제외한
  	  나머지는 주석 처리한다음, 어떤 결과를 얻을지 예측하고 실행한 결과와 비교 해보자.
  	[continue Loop1;과 같은 문장을 쓸일은 거의 없다.]
 */



//[예제 4-33]
package org.JavaStandards_Ch4IfSwitchForWhile;
	


	public class Ch4_IfSwitch9c_Continue2_loop이름붙은반복문 {
	
		public static void main(String[] args) {
			//for문에 loop1이라는 이름을 붙임.
			Loop1 : for(int i=2; i <=9; i++) {
				for(int j=1; j <=9; j++) {
					if(j==5)
//						break Loop1;
//						break;
//						continue Loop1;
						continue;
					System.out.println(i + "*" + j + "=" + i*j);
				}//end for2 j
				System.out.println();
			}//end for1 Loop : i
	}

}
	
/*
 1) break Loop1; 만 살려놨을 때.
  	결과값:
  	2*1=2
	2*2=4
	2*3=6
	2*4=8
2) break;만 살려놨을때,
	2*1=2
	2*2=4
	2*3=6
	2*4=8
	
	3*1=3
	3*2=6
	3*3=9
	3*4=12
	
	4*1=4
	4*2=8
	4*3=12
	4*4=16
	
	5*1=5
	5*2=10
	5*3=15
	5*4=20
	
	6*1=6
	6*2=12
	6*3=18
	6*4=24
	
	7*1=7
	7*2=14
	7*3=21
	7*4=28
	
	8*1=8
	8*2=16
	8*3=24
	8*4=32
	
	9*1=9
	9*2=18
	9*3=27
	9*4=36

 	3) continue Loop1;만 살려놨을때,
	2*1=2
	2*2=4
	2*3=6
	2*4=8
	3*1=3
	3*2=6
	3*3=9
	3*4=12
	4*1=4
	4*2=8
	4*3=12
	4*4=16
	5*1=5
	5*2=10
	5*3=15
	5*4=20
	6*1=6
	6*2=12
	6*3=18
	6*4=24
	7*1=7
	7*2=14
	7*3=21
	7*4=28
	8*1=8
	8*2=16
	8*3=24
	8*4=32
	9*1=9
	9*2=18
	9*3=27
	9*4=36	
 	 4) continue; 만 살려놨을 때.
	2*1=2
	2*2=4
	2*3=6
	2*4=8
	2*6=12
	2*7=14
	2*8=16
	2*9=18
	
	3*1=3
	3*2=6
	3*3=9
	3*4=12
	3*6=18
	3*7=21
	3*8=24
	3*9=27
	
	4*1=4
	4*2=8
	4*3=12
	4*4=16
	4*6=24
	4*7=28
	4*8=32
	4*9=36
	
	5*1=5
	5*2=10
	5*3=15
	5*4=20
	5*6=30
	5*7=35
	5*8=40
	5*9=45
	
	6*1=6
	6*2=12
	6*3=18
	6*4=24
	6*6=36
	6*7=42
	6*8=48
	6*9=54
	
	7*1=7
	7*2=14
	7*3=21
	7*4=28
	7*6=42
	7*7=49
	7*8=56
	7*9=63
	
	8*1=8
	8*2=16
	8*3=24
	8*4=32
	8*6=48
	8*7=56
	8*8=64
	8*9=72
	
	9*1=9
	9*2=18
	9*3=27
	9*4=36
	9*6=54
	9*7=63
	9*8=72
	9*9=81 	
 */
	
	
