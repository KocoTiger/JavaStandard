/*p.25~26
#1.3 변수의 명명 규칙
변수의 이름 처럼 프로그래밍에서 사용하는 모든 이름 => 식별자 (Idemtifier)
식별자는 같은 영역 내에서 서로 구분(식별)될 수 있어야 한다.

<식별자 만들 떄 규칙>
1. 대소문자 구분, 길이에 제한 없다
ex> True와 true는 서로 다름

2. 예약어를 사용해서는 안됨.
ex> true는 예약어라서 사용 불가, True는 가능 (대문자 가능, 소문자 불가)

3. 숫자로 시작해서는 안됨.
ex> top10가능, 7up불가

4. 특수문자 2개만을 허용 (_ 와 $)
ex> $harp 허용, S#arp는 불가

#예약어 : keyword, reserved word
	  : 프로그래밍 언어의 구문에 사용되는 단어
	  : 예약어는 class, 변수, 메서드의 이름(identifier)으로 사용할 수 없다.

<java에서 사용되는 예약어>
abstract	default		if			package		this
assert		do			goto		private		throw
boolean		double		implements  protected	throws
break		else		import		public		transient
byte		enum		instanceof	return		true
case		extends		int			short		try
catch		false		interface	static		void
char		final		long		strictfp	volatile
class		finally		native		super		whille
const		float		new			switch
continue	for			null		synchronized
[참고] (사용하지 않음)goto, const는 사용되지 않는다.
	  (추가 사항)assert는 JDK1.4부터 
	  (추가 사항)enum은 JDK1.5부터 새로 추가 됨.

# 그외 자바 프로그래머들에게 권장하는 규칙
  (필수 아닌 필수, 개발자들의 암묵적이 룰)
  
1. 클래스 이름의 첫 글자는 항상 대문자
: 변수, 메서드 이름 첫 글자 항상 소문자.

2. 여러 단어로 이루어진 이름, 단어의 첫 글자를 대문자로 한다.
: lastIndexOf, StringBuffer

3. 상수의 이름은 모두 대문자.
   여러 단어로 이루어진 경우_로 구분
: PI, MAX_NUMBER

//만일 특별한 방식으로 식별자를 작성 해야한다면,
  미리 규칙(coding convention)을 정해 놓고 프로그램전체에 일관되게 적용 필요
[참고] 자바에서 모든 이름에 유니코드에 포함된 문자들을 사용할수 있지만,
	  클래스 이름은 ASCII코드(영문자)로 하는 것이 좋음
	  유니코드를 인식하지 못하는 운영체제(OS)도 있음.
	  
# 변수의 이름은 의미있는 이름으로 해라.
ex>
	int curPos = 0; //현재 위치 (current position)
	int lastPos = -1; //마지막 위치 (last position)
 */


package org.javastandard.javaexercise.ch1variable;

public class ch2_variableEx1_3_VariableIdentifier {

	public static void main(String[] args) {

		
		

	}

}
