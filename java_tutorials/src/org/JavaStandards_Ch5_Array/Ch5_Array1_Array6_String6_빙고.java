/*p.223 ~224
[���� 5-21] ����			�������� ����� �Է¹��� ���ڸ� �����ǿ��� �����




 */






package org.JavaStandards_Ch5_Array;

import java.util.*;

	public class Ch5_Array1_Array6_String6_���� {
	
		public static void main(String[] args) {
//[���� 5-21] ����
			final int SIZE = 5;
			int x = 0, y = 0;
			int num = 0;
			
			int [][] bingo = new int[SIZE][SIZE];
			Scanner scanner = new Scanner(System.in);
			
			//�迭�� ��� ��Ҹ� 1���� SIZE*SIZE ������ ���ڷ� �ʱ�ȭ
			for(int i =0; i< SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					bingo[i][j] = i*SIZE + j + 1;
				}
			}
		
			//�迭�� ����� ���� �ڼ��´�. (shuffle)
			for (int i =0; i<SIZE; i++) {
				for(int j =0; j<SIZE; j++) {
					x = (int)(Math.random() * SIZE);
					y = (int)(Math.random() * SIZE);
					
					//bingo[i][j]�� ���Ƿ� ���õ� �� (bingo[x][y])�� �ٲ۴�.
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
				
				
				System.out.printf("1~%d�� ���ڸ� �Է��ϼ���. (����:0)>", SIZE*SIZE);
				String tmp = scanner.nextLine();    //ȭ�鿡�� �Է¹��� ������ tmp�� ����
				num = Integer.parseInt(tmp);
				
				//�Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0�� ����
				outer:
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(bingo[i][j]==num) {
								bingo[i][j] =0;
								break outer;		//2�� �ݺ����� �����.
							}
						}
					}
				
				
			}while(num != 0);
/*
		: 5X5ũ���� �����ǿ� 1~25�� ���ڸ� ���ʷ� ������ ������
		: Math.random()�� �̿��ؼ� ����� ���� ��ġ�� ���´�.
		: ����ڷκ��� ���ڸ� �Է¹޾Ƽ� ��ġ�ϴ� ���ڰ� �����ǿ� ������ �ش� ������ 0���� �ٲ۴�.
			
			//�Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0�� ����
					outer:
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(bingo[i][j]==num) {
									bingo[i][j] =0;
									break outer;		//2�� �ݺ����� �����.
								}
							}
						}
		: �Է¹��� ���ڿ� ��ġ�ϴ� ���ڸ� �����ǿ��� ã�� ����� �����ϴ�.
		: �迭�� ù��° ��Һ��� ������� �ϳ��� ���ϴٰ� ��ġ�ϴ� ���ڸ� ã����
		  ���� 0���� �ٲٰ�
		  break������ �ݺ����� ���������� �ȴ�.
		: 2�� �ݺ����̹Ƿ� �̸� ���� break���� ����ؾ� �Ѵ�.

 */
			
			
			
	}

}
