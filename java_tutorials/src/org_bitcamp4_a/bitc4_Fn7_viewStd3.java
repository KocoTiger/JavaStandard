package org_bitcamp4_a;
public class MyClass {
        //[0~3][4~7][8~11][12~15][16~19] 4�� ���̶��� ���� ���۹�ȣ 0,4,8,12,16
     public static void main(String args[]) { 
         //�Լ� scope, ������
        int[] score = new int[  ]{
            10, 20, 40, 50,
            100, 30, 40, 60,
            30, 20, 80, 50,
            11, 12, 40, 50,
            70, 20, 40, 80
        };
        //�迭�� �����ؼ� ����ϰ� ���� ? �迭�� �� ���� �ؾ� ����?
        //�������� �־ �Լ��� �Լ����� ���� �־ �˷�����ϱ� ������ �˷��ִ� ������ �ʿ��ϴ�.
        for (int i=0; i < 5; i+=1){
            //��� �л����� ������ �����ϰ� �ֳ�?
            //1�� �ش�
            int[] std = new int[4];
            System.arraycopy(score, i*4, std, 0, 4);             //System.out.print(����, �纻);
            viewStudent(/*�л���ȣ*/ i, std);
        }

    } //end main
    
    public static void viewStudent ( int stdNo, int[] score ){
        System.out.print ("["+stdNo +"]\t");
        for (int i=0; i < 4; i+=1){
            //1���迭�� 2�� �迭�� �����Ѵ�....[stdNo][i]
             System.out.print(score[ i ] + "\t"); //���⼭ i�� ������ ��ȣ�� �ȴ�. main������ i�� �л��̴�.
        }        
        System.out.println(); 
    }

}
