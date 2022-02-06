/*p.223 ~224
[예제 5-21] 빙고			빙고판을 만들고 입력받은 숫자를 빙고판에서 지운다




 */






package org.JavaStandards_Ch5_Array;

import java.util.*;

	public class Ch5_Array1_Array6_String6_빙고 {
	
		public static void main(String[] args) {
//[예제 5-21] 빙고
			final int SIZE = 5;
			int x = 0, y = 0;
			int num = 0;
			
			int [][] bingo = new int[SIZE][SIZE];
			Scanner scanner = new Scanner(System.in);
			
			//배열의 모든 요소를 1부터 SIZE*SIZE 까지의 숫자로 초기화
			for(int i =0; i< SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					bingo[i][j] = i*SIZE + j + 1;
				}
			}
		
			//배열에 저장된 값을 뒤섞는다. (shuffle)
			for (int i =0; i<SIZE; i++) {
				for(int j =0; j<SIZE; j++) {
					x = (int)(Math.random() * SIZE);
					y = (int)(Math.random() * SIZE);
					
					//bingo[i][j]와 임의로 선택된 값 (bingo[x][y])을 바꾼다.
					int tmp = bingo [i][j];
					bingo[i][j] = bingo[x][y];
					bingo[x][y] = tmp;
				}
			}
		
			do {
				for(int i=0; i<SIZE; i++) {
					for(int j=0; j<SIZE; j++)
							System.out.printf("%2d ", bingo[i][j]);
						System.out.println();
				}
				System.out.println();
				
				
				System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
				String tmp = scanner.nextLine();    //화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp);
				
				//입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
				outer:
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(bingo[i][j]==num) {
								bingo[i][j] =0;
								break outer;		//2중 반복문을 벗어난다.
							}
						}
					}
				
				
			}while(num != 0);
/*
		: 5X5크기의 빙고판에 1~25의 숫자를 차례로 저장할 다음에
		: Math.random()을 이용해서 저장된 닶의 위치를 섞는다.
		: 사용자로부터 숫자를 입력받아서 일치하는 숫자가 빙고판에 있으면 해당 숫자을 0으로 바꾼다.
			
			//입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
					outer:
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(bingo[i][j]==num) {
									bingo[i][j] =0;
									break outer;		//2중 반복문을 벗어난다.
								}
							}
						}
		: 입력받은 숫자와 일치하는 숫자를 빙고판에서 찾는 방법은 간단하다.
		: 배열의 첫번째 요소부터 순서대로 하나씩 비교하다가 일치하는 숫자를 찾으면
		  값을 0으로 바꾸고
		  break문으로 반복문을 빠져나오면 된다.
		: 2중 반복문이므로 이름 붙은 break문을 사용해야 한다.

 */
			
			
			
	}

}
