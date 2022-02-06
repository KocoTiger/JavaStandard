/*
*��������
�����̰� ������ �ڵ�



 */


package org_bitcamp5;

//Scanner ���̺귯�� ��������
import java.util.Scanner; 


public class bitc5_��ü������_CRUD6��������6 {

    // �� Ŭ���� �ȿ� ������ �Լ����� ��� ���� Ű���带 �����Ѵ�.
    private static Scanner kb; //static�̺پ������� �ٺٿ����Ѵ�.
    private static int[][] SCORE; //������ �������� //������ (�������� ����)
    public static void main(String args[]) {
        // ������. ���� ó�� ����Ǵ� �Լ�
        kb = new Scanner(System.in);// Ű����� �����ϱ�
        //new �ּҸ� ���ؼ� �����Ѵ�.
        SCORE = new int [5][3];// 1���迭 5���� ���� 2���迭
        //1���迭�� ��Ҵ� ���� 2���迭�� ��Ҵ� 1���迭 3���迭�� ��Ҵ� 2���迭�̴�.
        ////////// ��ɵ��� �����Ų��.
        String cmd; // do {}�ۿ� �ֱ⋚���� �ۿ������� �ʴ´ٸ� while���� cmd�� ã�����Ѵ�.
        do{
            System.out.print("cmd > ");
            cmd = kb.nextLine();
            if("list".equals(cmd)){ // ����ǥ ����ϱ�
                viewScoreTable();
            }
            //over�������� ���� ������ �ѹ����Է��������
            if("over".equals(cmd)){
                System.out.print("over > ");
                int num = kb.nextInt(); // ������ �Է¹޴´�.
                kb.nextLine();// ���ڰ� �ƴ� ���Ͱ��� ������.
                viewOverScore(num);
            }
            
        }while( !("exit".equals( cmd ) ) );//cmd�� exit�� �����ε� !not���궧���� cmd�� exit�� �ٸ����̴� 
        // ����ڰ� "exit" �Է��ϸ� �����.
        System.out.println("terminated ");
        
    }// end main
    
    ///// �Լ����� ������
    public static boolean hasOverScore(int row,int key){
        boolean has = false;//or���� "����ϳ���"
        for(int i =0; i<3; i+=1){
            if( SCORE[row][i] >= key){ //or����
                has = true;
                break;
            }
        }
        return has;
    }    
    public static void viewOverScore(int key){
        for(int row =0; row<SCORE.length;row+=1){
            //if(�л��� ���� �� �ϳ��� key �̻��� ������ ������)if�ȿ� �����ϱ� ��ȯ�Ұ�����
            //hasOverScore�� �л���ȣ�� ���Ұ��� ���޹޾Ƽ� ��� �ؼ� ��,������ ������.
            if( hasOverScore(row,key) ){
                viewStudent(row);// row�� �л��� �������� ���
            }    
        }
    }
    public static void viewStudent(int row){
        for(int col=0; col<SCORE[0].length; col+=1){
                System.out.print( SCORE[row][col] + "\t" );
            }
            System.out.println();
    }
        
    public static void viewScoreTable(){
        for(int row =0; row<SCORE.length/*5*/;row+=1){ //2���迭
            viewStudent(row);
            // for(int col=0; col<SCORE[0].length /*3*/; col+=1){ // [0]�����⶧���� 1���迭,����� 1���迭�� ���̰� ����.
            //     System.out.print( SCORE[row][col] + "\t" ); // ���ȣ�� �ΰ��ϱ� �ݺ��� �ΰ��ȴ�.
            // }
            // System.out.println(); // �л��Ѹ���̱⶧���� �Ѹ��̳����� �ѹ����� ������ �����۾�����
            // //print�� println���ٸ��� print�� ������ println�� �Ʒ��� �������� �����ٷ� ������.
        }    
    }
     
    /////////////
    
}// end class
