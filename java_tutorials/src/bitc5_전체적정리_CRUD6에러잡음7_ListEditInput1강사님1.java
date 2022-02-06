/*
������ ���Ƕ�
�⺻�� ���� : ���̴�. ���̴�....
int n; n�� ������ ������ ������...
������ ������ : ���~ ����~
String name; name�� ������... -> String�� �ּҸ� �����Ѵ�
String[] args; args ������... -> String�� ��ҷ� �ϴ� �迭�� ���� �ּҸ� �����Ѵ�.
-> String�� ��ҷ� �ϴ� �迭�� ���� �ּҸ� �����Ѵ�.
args = dfsdfsfs;





 */



package org_bitcamp5;

//Scanner ���̺귯�� ��������
import java.util.Scanner;


public class bitc5_��ü������_CRUD6��������7_ListEditInput1�����1 {

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
            //�л��� ���� ����, ��� �� ���
            if("total".equals(cmd)){
                System.out.println("�л��� ����");
                totalScore();
            }
            //�л� �ڸ� �ٲٱ� - 1 3 - 1<--->3
            if("total".equals(cmd)){
                System.out.println("��ȯ�� �л� ��ȣ 2�� > ");
                int a = kb.nextInt(); //���ڸ� �Է� '0'~ '9'
                int b = kb.nextInt();
                kb.nextLine();
                System.out.println(SCORE[a]);
                System.out.println(SCORE[b]);
                //�� ������ ���� ��ȯ�Ѵ�....: ����
                int[] c = SCORE[a]; //1���迭
                //SCORE[][], SCORE[] []
                SCORE[a] = SCORE[b]; 
                SCORE[b] = c;
                System.out.println(SCORE[a]);
                System.out.println(SCORE[b]);                
            }
            
            
        }while( !("exit".equals( cmd ) ) );//cmd�� exit�� �����ε� !not���궧���� cmd�� exit�� �ٸ����̴� 
        // ����ڰ� "exit" �Է��ϸ� �����.
        System.out.println("terminated ");
        
    }// end main
    
    //////////////////////////////// �Լ����� ������
    public static void totalScore(){  //���� ����
        for(int row=0; row<SCORE.length; row+=1){
            int sum = SCORE[row][0] + SCORE[row][1] + SCORE[row][2];
            int avg = sum /3; //SCORE[row].length ��հ�, ������ 3���̱⶧���� 3���� ����
            System.out.println(row + "\t" + sum + "\t" + avg);
        }
    }
    
    public static void inputScore(String[] sa){ //���� ����
        if( sa.length == 4){
            int row = Integer.parseInt(sa[0]);
            for(int i=0; i<3/*4���ε� �ϳ��� ���� �P���� 3��*/; i+=1){
                // sa[1]:����, sa[2]:����, sa[3];����
                SCORE[row][i] = Integer.parseInt(sa[i+1]);// i+1 �ϴ����� 0���� �л��� ��ȣ�ϱ�
                // 1��2��3���� �ϱ����ؼ� +1�� ������ �����.
            }
        }else{
            System.out.println("4���� �Է��ؾ� �մϴ�.");
        }
    }
    public static void editScore(String s){
        // Ư�� ���ڸ� �������� ���ڿ� �ɰ���
        String[] splited = s.split(" ");// splited �Լ��� ���ڸ� �ɰ��� �������Ҷ� ���
        // "1 2 30" -> ["1"]["2"]["30"]
        if( splited.length == 3){
            int row = Integer.parseInt(splited[0]);// �л���ȣ
            int col = Integer.parseInt(splited[1]);// �����ȣ
            int jumsu = Integer.parseInt(splited[2]);// ����
            // ������ �ϴ°Ŵϱ� ...... (����)
            SCORE[row][col] = jumsu;
        }else{
            System.out.println("3���� �Է��ؾ� �մϴ�.");
        }
    }
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
