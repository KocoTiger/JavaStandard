/*
package jb02.part04;

	FileName : ArrayTest02.java
	1,2 차원 Array(?: 배열의 배열)	==> 1차원(?), 2차원(?)배열의 사용.

 */



package java_tutorials_bitCamp1;

	public class ArrayTest02 {

//main method		
		public static void main(String[] args) {
			
			//int Data Type의 배열의 배열(2차원 배열)을 생성
			int[][] value = new int[9][9];
			
			//index를 이용 value의 값 젒근 및 대입
			for(int i=0; i<9;i++) {
				value[0][i] = 1*(i+1);
			}
			
			//입력된 값을 출력
			//==> value.length / value[i].length의 의미를 이해
			//==> value[0][0] ~ value[0][9]까지의 츨력값을 확인
			//==> 그 이외의 값들은? (<==배열은 생성시 자동 초기화됨을 확인)
			for(int j=0; j<value.length; j++) {
				
				System.out.println("==========================");
				
				for(int k=0; k<value[j].length; k++) {
					System.out.println("value["+j+"]="+value[j][k]);
				}//end of inner
			}//end of outer				
		}//end of main	
	}//end of class
