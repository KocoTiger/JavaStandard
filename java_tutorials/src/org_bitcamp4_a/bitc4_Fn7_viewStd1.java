package org_bitcamp4_a;
//<�߰��� ���� ��ȭ�� 30�� �� �ͼ� �� 2��° �ڵ�>

//�� �� �ڵ� ���� ����

public class MyClass {
 
     public static void main(String args[]) { 
        int[] score = new int[ 5 * 4 ];
        //�迭�� �����ؼ� ����ϰ� ���� ? �迭�� �� ���� �ؾ� ����?
        //�������� �־ �Լ��� �Լ����� ���� �־ �˷�����ϱ� ������ �˷��ִ� ������ �ʿ��ϴ�.
        for (int i=0; i < 5; i+=1){
            //��� �л����� ������ �����ϰ� �ֳ�?
            //1�� �ش�
            viewStudent(/*�л���ȣ*/ i, score);
        }

    } //end main
    
    public static void viewStudent ( int stdNo, int[] score ){
        System.out.print ("["+stdNo +"]\t");
        for (int i=0; i < 4; i+=1){
            //1���迭�� 2�� �迭�� �����Ѵ�....[stdNo][i]
             System.out.print(score[i] + "\t"); //����, ��� ����, 2�� ���� 
        }        
        System.out.println(); 
    }

}
