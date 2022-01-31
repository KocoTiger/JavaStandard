package org_bitcamp3_b;

import java.util.Scanner; //��ĳ�� �̿� ��ɾ�

public class bitc3_Array_CRUD9a_KeyInput_Final {

//	* �̰ɷ� ������!�� interactive �Ѱ�
//	���� ȭ�鿡 ��.
//	�׸��� �׸��� �׷���
//	��ĭ�� �и��� �߰��Ǵ� �͵��� ������

	
    public static void main(String args[]) {  //���� �Լ� ����!

    //Ű���� �Է� ó��
    Scanner kb = new Scanner( System.in ); //��ĳ�� �̿� ��ɾ�
    //-----------------------------------------
    //�迭 ���� : ����, �����
        int[] ar = new int [10]; //�ִ� 10¥�� �迭�� ����Ŵ�

        // Create Read Update Delete (SW���� ���� �⺻���� ��/CRUD)
        int loop = 5;
        int idx = 0;        // �Ź� ���� ������ ����?
        //������ : ������ ���� ����? �Ź� ���� ����?
        
        while( loop > 0 ){ //start while, true���� ���� ����
            loop -= 1;
            System.out.println("1.�߰�, 2.����, 3.����, 4.����, 5.�˻�");
            String menu = kb.nextLine();
            
        if(menu.equals("1")){ //�޴� �Է°��� 1���̸�
        {
            //�߰��ϱ� (�迭����) : ��ȣ?, ������ �� -> �ߺ� ����?
            if (idx < ar.length ) {
                System.out.println("�����Ұ�?");
                String t = kb.nextLine();
                int value = Integer.parseInt(t); //���ڿ� -> ����
                ar[ idx ] = value;
                idx += 1;
            }else{
                System.out.println ("array full");
            }
        }
        }
        
        if(menu.equals("2")){
        
            //�����ϱ� : ��ȣ?, V�� ��� ó��? ���� ���� (���� ���¸� �Ҳ���)
                System.out.println("�����Ұ�?");
                String t = kb.nextLine();
                int delete = Integer.parseInt(t); //���ڿ� -> ����

            for (int i = delete; i < ar.length-1; i += 1) { //i ������ 8���� ���� ��������
                ar[i] = ar[i+1]; // i + 1�� 10�̻��� �Ǹ� �ȵ�. �ִ밪�� 8 �ִ� 9�� �ʰ��ϸ� �ȵ�
            }
            //������ �پ��� - ������ ��ĭ�� ���.
            idx -= 1;        
        }
        
        
        if(menu.equals("3")){
        
            //�����ϱ� : ��ȣ?, ���� �б�...
            if( idx < ar.length ){  //�ּ��� ��ĭ�� �þ�� ������ �־�� ���԰���
                System.out.println("������ ����� ��ȣ?");
                String t = kb.nextLine();
                int insert = Integer.parseInt(t); //���ڿ� -> ����

                System.out.println("������ ��?");
                String t1 = kb.nextLine();
                int value = Integer.parseInt(t1); //���ڿ� -> ����                
                
                for(int i=idx; i > insert; i-=1){ //���ܼ� �ø��ٴ� ǥ��
                    ar[i] = ar[i-1];
                    //[9] ----> <insert>
                }
                ar[ insert ] = value;
                idx += 1;
            }
        
        }
        
        if(menu.equals("4")){
        
            //�����ϱ� : ��ȣ?, ������ ��(��� ��) -> ���� �����Ͱ� �־�� �Ѵ�
                System.out.println("������ ����� ��ȣ?");
                String t = kb.nextLine();
                int edit = Integer.parseInt(t); //���ڿ� -> ����

                System.out.println("������ ��?");
                t = kb.nextLine();
                int value = Integer.parseInt(t); //���ڿ� -> ����                
            
                if (edit < idx ){
                    //�ٲ۴�. ����� //Ȯ�� �ϰ� �����Ѵ�
                    ar [edit] = value;
            }
        }
        
        if (menu.equals("5")){
            //�˻��ϱ� -1 : ���� �ְ� ��ҹ�ȣ�� ã�´�.
            //���� Ž��,�˻�  & ?
                System.out.println("ã����?");
                String t = kb.nextLine();
                int key = Integer.parseInt(t); //���ڿ� -> ����

            for (int i=0; i < idx; i+=1){  
                if( key == ar[i] ){
                    System.out.print(i + "�� ���");
                // �ߺ����ο� ���� ó���� �ٸ���. (�ߺ����� : 1���� ã���� �ȴ� -> �˻��� ����)
                // �迭�ȿ� �ߺ����� �ϳ����� ������ �ȴ� ������, �˻� �ʿ� ����
                    break ;
                }
            }    
            System.out.print("\n");
        }
        
        // {
        //     //�˻��ϱ� -2 : ��� ��ȣ �ְ� ���� ������.
        // int no = 2; 
        // int result = ar[no];
        //     System.out.print(result + "\n");
               
        // }
        
        {
            //��� ���� : ����� ���� ���
            for (int i=0; i < ar.length; i+=1){
                System.out.print(ar[i]+" ");
                }
                System.out.print("\n");
        }
        
        
    } //end while   
            
    } //main �Լ� �߰�ȣ
    
}   //class �߰�ȣ
