
/*
<<<<<<<<<<<<<<<<배열 실습>>>>>>>>>>>>>
FileName : Example5.java
# 문자열을 관리하는 String Array(String[][]text = new String[9][9])를 만들고,
# 구구단 문자열을 text Array에 저장하여 출력하는 예제

실행예> java Example5
	==>실행결과(출력결과...)
	1단을 출력합니다.
	text[0][0]: 1*1=1
	text[0][1]:	1*2=2
	....
	text[8][8]: 9*9=81

	==>아래의 내용을 참조하여 만들어 보자...
	int l = 9;
	int j = 9;

	text[8][8] = l + "*" +j+ "=" + l*j

*/




class Example5 {
	public static void main(String[] args){


//[1차 관문-구구단 만들기]
//		for(int a=1; a<10; a++){
//			System.out.println(a +"단을 출력합니다.");
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
//			System.out.println(a +"단을 출력합니다.");
//				for(int j=1; j<value[j].length; j++){
//			System.out.println("text["+l+"]["+j+"] = "+l+"*"+j+"="+l*j);
//				}//end of for l
//		}//end of for j		



	}//end of main
}//end of class
