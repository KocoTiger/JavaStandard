package org_bitcamp2;

public class bitc2_if_for6 {

	public static void main(String[] args) {
        //���ڸ� ���س��� ���� ����
        int count = 0; //���࿡�� ����� ����
       for(int n=12; n<63; n+=1){ 
           System.out.print(n + " ");
           
           count += 1;
           if(count == 5) { //5����...
                System.out.println();
                count = 0; //�迭�� ������ 25���� ���߱� ����?  count������ ������ �־����!!!����!
           }
       }
           System.out.println();
       
       // 5 �� 5���� ����Ұ��̴ٶ�� �̸� ���س��� ����.
       // ������ ����� ���� �ű⿡ ����
       int num = 1;
       for(int i=0; i<5; i+=1){ //��
           for(int k=0; k<5; k+=1){ //��
               //25�� �ݺ�
               // System.out.print((i*5 + k) + " "); //�ִ� �� 24 : i �ִ� 4���� ���� 20+ k�ִ밪 4���� = 24
               System.out.print(num + " ");
               num +=1;
           }    
           System.out.println();
       }
       
}
}
