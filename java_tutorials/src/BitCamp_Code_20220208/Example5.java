
/*
<<<<<<<<<<<<<<<<�迭 �ǽ�>>>>>>>>>>>>>
FileName : Example5.java
# ���ڿ��� �����ϴ� String Array(String[][]text = new String[9][9])�� �����,
# ������ ���ڿ��� text Array�� �����Ͽ� ����ϴ� ����

���࿹> java Example5
	==>������(��°��...)
	1���� ����մϴ�.
	text[0][0]: 1*1=1
	text[0][1]:	1*2=2
	....
	text[8][8]: 9*9=81

	==>�Ʒ��� ������ �����Ͽ� ����� ����...
	int l = 9;
	int j = 9;

	text[8][8] = l + "*" +j+ "=" + l*j

*/




class Example5 {
	public static void main(String[] args){


//[1�� ����-������ �����]
//		for(int a=1; a<10; a++){
//			System.out.println(a +"���� ����մϴ�.");
//				for(int b=1; b<10; b++){
//			System.out.println("text["+a+"]["+b+"]: "+a+"*"+b+"="+a*b);		
//				}//end of for b
//		}//end of for a
//[pass]


//		int[] i = new int[9];
//		int[] j = new int[9];

//		int l = 9;
//		int j = 9;

		int[][] value = new int[9][9];

			for(int j=0; j<value.length;j++){
				System.out.println("===========================");
				for (int k=0; k<value[j].length;k++){
						System.out.println("value["+j+"]"+"["+k+"]"+"="+value[j][k]);
				}//end of inner
			}//end of outer		

//			
//			for(int i=1; i<value.length; i++){
//				value[0][i] = 1*(i+1);
//				System.out.println(i);
//			}





//		for(int l=1; l < value[l].length; l++){
//			System.out.println(a +"���� ����մϴ�.");
//				for(int j=1; j<value[j].length; j++){
//			System.out.println("text["+l+"]["+j+"] = "+l+"*"+j+"="+l*j);
//				}//end of for l
//		}//end of for j		



	}//end of main
}//end of class
