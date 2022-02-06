/*p.225 ~226
#[예제 5-22]행렬의 곱셈





 */







package org.JavaStandards_Ch5_Array;

public class Ch5_Array1_Array6_String7_행렬의곱셈 {

	public static void main(String[] args) {
//[예제 5-22]행렬의 곱셈
		int [][] m1 = {
						{1,2,3},
						{4,5,6}
		};
		
		int[][] m2 = {
						{1,2},
						{3,4},
						{5,6}
		};
		
		final int ROW = m1.length;		//m1의 행 길이 = 2
		final int COL = m2[0].length;	//m2의 열 길이 = 2
		final int M2_ROW = m2.length;	//m2의 행 길이 = 3
		
		int[][] m3 = new int[ROW][COL];
		
		//행렬곱 m1 x m2의 결과를 m3에 저장
			for(int i=0; i<ROW; i++)
				for(int j=0; j<COL; j++)
					for(int k=0; k<M2_ROW; k++)
						m3[i][j] += m1[i][k] * m2[k][j];
		
		//행렬 m3를 출력
			for(int i=0; i<ROW; i++) {
				for(int j=0; j<COL; j++) {
					System.out.printf("%3d ", m3[i][j]);
				}
				System.out.println();
			}
/*
		결과값 : 
		 	22  28 
 			49  64 
		
		: 수학에서 두개의 행렬(matrix) m1과 m2가 있을 때,
		  이 두행렬을 곱한 결과인 행렬 m3 는 아래와 같이 정의된다.
		
		m1				m2						m3
	(A0 A1 A2)	X	(a0 a1)	=	(A0xa0 + A1xb0 + A2xc0  A0xa1 + A1xb1 + A2xc1)
	(B0 B1 B2)		(b0 b1)		(B0xa0 + B1xb0 + B2xc0  B0xa1 + b1xb1 + B2xc1)
					(c0 c1)

		: 두 행렬의 곱셈이 가능하려면, m1의 열의 길이와 m2의 행의 길이가 같아야 한다는 조건이 있다.
		: 위의 경우, m1이 2행3열
		: m2가 3행 2열 이므로 곱셈이 가능
		: 그리고 곱셈 연산의 결과인 행렬 m3의 행의 길이는 m1의 행의 길이와 같고, 열의 길이는 m2의 열의 길이와 같다.
		: 2행 3열인 행렬과 3행2열인 행렬을 곱하면
		  결과는 2행 2열의 행렬이 되는 것이다.
		
		: 지금까지의 내용은 수학에서 정의된 행렬의 곱셈에 대한 정의와 규칙일 뿐
		: 왜 그렇게되는지 따질 필요는 없다.
		: 이 내용에 맞게 코드를 작성하는 것에 중점을 두자.
		: 위의 행렬의 곱셈공식을 2차원 배열로 표현하면 아래와 같다.
		[p.226 그림 참고] 
		
		: 문장들을 자세히 보면, 행렬 ,m3의 행 index가 행렬 m1의 행index와 일치한다
		: m3의 열index가 m2의 열index와 일치한다는 것을 알 수 있다.
		: 그래서 위의 문장들은 다음과 같이 2중 for문으로 대체 가능
				for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {		//i= 0,1
							for(int k=0; k<3; k++){		//j= 0,1
									m3[i][j] = m1[i][0] * m2[0][j]
											 + m1[i][1] * m2[1][j]
											 + m1[i][2] * m2[2][j];
							}
					}
			}
		: 위의 문장을 잘 보면 여전히 반복되는 부분들이 있음.
		: m1의 열 index와 m2의 행 index가 동일하게 0~2까지 1씩 증가
		: 이부분을 for문으로 바꾸면 다음과 같이 된다.
				for(int i=0; i<2; i++) {
						for(int j=0; j<2; j++) {	
							for(int k=0; k<3; k++){		//k=0,1,2
									m3[i][j] += m1[i][k] * m2[k][j];
							}
					}
			}	
		: 행렬 m1과 m2의 길이가 달라져도 행렬 m3가 계산될 수 있도록, 
		  배열 m3의 크기와 for문의 조건식이 동적으로 계산되게 함
		final int ROW = m1.length;		//m1의 행 길이 (m3의 행 길이)
		final int COL = m2[0].length;	//m2의 열 길이 (m3의 열 길이)
		final int M2_ROW = m2.length;	//m2의 행 길이
		
		int[][] m3 = new int[ROW][COL];
	
	
	
	
 */
			
			
			
			
	}

}
