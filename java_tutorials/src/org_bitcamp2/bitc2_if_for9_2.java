package org_bitcamp2;

public class bitc2_if_for9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 3�ڸ� ���� (���Ƿ� ����) : �� �ڸ��� ���� ¦���� �͵��� ����ϼ���
	    //2. 100�̻� 999����
	    //3. 100�� �ڸ� 10�� �ڸ� 1�� �ڸ��� ���� ���� ��� ���� ��, ¦���� ��� Ȧ���� ����
	    //4. if ¦���� �ƴϳ� ����, ������ �� �ڸ� 
	    for(int i=0; i<10; i+=1){
	    int num = 3458; // 3 + 4 + 5
	    //��� Ȯ�� �ϱ�
	        int temp = num;
	        int sum = 0;
	    for (;temp > 0; temp/=10){
	        // �� �ڸ��� �����´�... ���� �ڸ����� �̴´�.
	       int d3 = num % 10; //1 �� �ڸ� �̱�
	       sum += d3;
	    }
	         if(sum % 2 == 0){
	            System.out.println(num + "->" + sum); //�ݺ��� �Ȱ��� ��, ��Ȳ�� �̾ƾ��ϴ� ���� �ݺ�
	                                                  //
	         }else {
	            System.out.println(num + "??");
	         }
	            }
	        }
	    }
