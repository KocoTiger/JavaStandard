package org_bitcamp2;

public class bitc2_if_for2 {

	public static void main(String[] args) {
		//1�������� 25���� �����ϴ� �������� ����ϼ���.
	    //���ϴ±��� ����, ����ϴ±��� ����ϴ� ��, �����ϴ� ����
	    // \n : ����
	    
	        for(int n=1; n<26; n+=1){
	            System.out.print(n + " ");
	        }
	        System.out.println();
	        //1 ~ 25 ���� ���� ��� - 1��� 5���� ����ϱ�
	        //5�� ��� X, 5�� �϶� ���� ������
	        int count = 0; //���࿡�� ����� ����
	        for(int n=1; n<26; n+=1){ 
	            System.out.print(n + " ");
	            count += 1;
	            if(count == 5) { //5����...
	                 System.out.println();
	                 count = 0; //�迭�� ������ 25���� ���߱� ����?  count������ ������ �־����!!!����!
	            }
	        }
	            System.out.println();
		}
	}
