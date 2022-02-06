package org_bitcamp5;


//Scanner ���̺귯�� ��������
import java.util.Scanner;


public class bitc5_��ü������_CRUD6��������7_ListEditInput1����� {

    // �� Ŭ���� �ȿ� ������ �Լ����� ��� ���� Ű���带 �����Ѵ�.
    private static Scanner kb;
    private static int[][] SCORE;
    
    public static void main(String args[]) {
        // ������. ���� ó�� ����Ǵ� �Լ�
        kb = new Scanner(System.in);// Ű����� �����ϱ�
        SCORE = new int[5][3];// 1���迭 5���� ���� 2���迭
        ////////// ��ɵ��� �����Ų��.
        String cmd;
        do{
            System.out.print("cmd > ");
            cmd = kb.nextLine();
            // ����ǥ ����ϱ� 
            if("list".equals(cmd)){
                viewScoreTable();
            }
            // ~ �̻� ������ ����ϱ�
            if("over".equals(cmd)){
                System.out.print("over > ");
                int num = kb.nextInt();// ������ �Է¹޴´�.
                kb.nextLine();// ���ڰ� �ƴ� ���Ͱ��� ������..
                viewOverScore(num);
            }
            // ���� ���� : ���� - �л�, ���� �� �Է�
            if("edit".equals(cmd)){
                System.out.println("�л���ȣ �����ȣ ������ > ");
                String s = kb.nextLine();
                // ������ �������� 3���� ������. -> ������ȯ
                editScore(s);
            }
            // ���� �Է� : ���� - �л�, ���� �� �Է�
            if("input".equals(cmd)){
                System.out.println("�л���ȣ ������(3) > ");
                String s = kb.nextLine();
                // ������ �������� 3���� ������. -> ������ȯ
                inputScore(s.split(" "));
            }
            // �л��� ���� ����, ��� �� ���
            if("total".equals(cmd)){
                totalScore();
            }
            
            
        } while( !( "exit".equals( cmd ) ) );
        // ����ڰ� "exit" �Է��ϸ� �����.
        System.out.println("terminated ");

    }// end main
    
    ///// �Լ����� ������
    public static void totalScore(){
        
    }
    public static void inputScore(String[] sa){
        if( sa.length == 4 ){
            int row = Integer.parseInt(sa[0]);
            for(int i=0; i<3; i+=1){
                // sa[1]:����, sa[2]:����, sa[3]:����
                SCORE[row][i] = Integer.parseInt(sa[i+1]);
            }
        }else{
            System.out.println("4���� �Է��ؾ� �մϴ�.");
        }
    }
    public static void editScore(String s){
        // Ư�� ���ڸ� �������� ���ڿ� �ɰ���
        String[] splited = s.split(" ");
        // "1 2 30" -> ["1"]["2"]["30"]
        if( splited.length == 3 ){
            int row = Integer.parseInt(splited[0]);// �л���ȣ
            int col = Integer.parseInt(splited[1]);// �����ȣ
            int jumsu = Integer.parseInt(splited[2]);// ����
            // ������ �ϴ°Ŵϱ� ......
            SCORE[row][col] = jumsu;
        }else{
            System.out.println("3���� �Է��ؾ� �մϴ�.");
        }
    }
    public static boolean hasOverScore(int row, int key){
        boolean has = false;
        for(int i=0; i<3; i+=1){
            if( SCORE[row][i] >= key ){
                has = true;
                break;// OR
            }
        }
        return has;
        // SCORE[row][0] >= key || 
        // SCORE[row][1] >= key || 
        // SCORE[row][2] >= key;
    }
    public static void viewOverScore(int key){
        for(int row=0; row<SCORE.length; row+=1){
            if( hasOverScore(row, key) ){
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
        for(int row=0; row<SCORE.length /*5*/; row+=1){
            viewStudent(row);
        }
    }
    ////////////////////
 
    
}// end class

