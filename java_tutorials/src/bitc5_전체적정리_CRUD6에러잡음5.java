package org_bitcamp5;

//scanner ���̺귯�� ��������
import java.util.Scanner;  //��κ��� Ŭ�������� import�� �ٿ����� (ù���� �빮���ΰ͵�)


public class bitc5_��ü������_CRUD6��������5 {

    //��Ŭ���� �ȿ� ������ �Լ����� ��� ���� Ű���带 �����Ѵ�.
    private static Scanner kb; 
    private static int[][] SCORE; //������ (�������� ����) 
    // ������ �ƹ��͵� �ƴ�. �ؿ��� �Ἥ �̰� ���� ��ų �ڵ尡 �ʿ�
    
    public static void main(String args[]) {
        //������ (������� ����Ǵ� �Լ�)
        kb = new Scanner(System.in); //Ű����� �����ϱ�
        SCORE = new int [5][3];  //1�� �迭 5���� ���� 2�� �迭
                                 //���̰� 3���� 2���迭 5���� ������
        ///////��ɵ� �����Ų��
        String cmd;  //�̰� �� ����,������������ While���� ���� {}�̰� ��
        do {  //do while �ݺ���: �ϴ� ���� ��Ű�� while���� �׸� �Ұ��� �Ǵ�
            System.out.print("cmd > ");
            cmd = kb.nextLine();
            if ("list".equals(cmd)){ //����ǥ ����ϱ�
                                    // String cmd = kb.nextLine();  //while���� ����
                viewScoreTable();
            }
            if ("over".equals(cmd)){
                System.out.print ("over > ");
                int num = kb.nextLine();
                kb.nextLine(); //���ڰ� �ƴ� ���Ͱ��� ������...
                viewOverScore(num);
            }
            
        }while( !( "exit" .equals(cmd) ) ); //while������ �����̸� ����
                                            //�ٸ��� ��� ������
        //����ڰ� "exit" �Է��ϸ� �����.
        System.out.println("terminated");  //���α׷� ����
      
    }//end main
    
    /////////////�Լ��� ������
    public static void viewOverScore(int key){
         for(int row=0; row<SCORE.length; row+=1){
             if(�л��� ���� �� �ϳ��� key�̻��� ������ ������) {
                viewStudent(row); //row�� �л��� �������� ���
             }
        }       
    }
    public static void viewStudent(int row){ //row : �л� ��ȣ
        for(int col=0; col<SCORE[0].length; col+=1){
                System.out.print( SCORE[row][col] + "\t");
            }
            System.out.println();
    }
    public static void viewScoreTable(){
        for(int row=0; row<SCORE.length/*5*/; row+=1){
            viewStudent(row);
            }
            System.out.println();
        }
    }
     
    ///////////////////////
}//end Class
