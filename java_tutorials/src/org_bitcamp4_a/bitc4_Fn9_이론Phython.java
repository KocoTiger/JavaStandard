package org_bitcamp4_a;
★파이썬

#파이선 함수 만들기
def fn() : #파이썬은 중괄호 사용 안함 {}
    pass #더이상 없다란 뜻.

fn()#함수 호출




#파이선 함수 만들기
def fn(param) : #파이썬은 중괄호 사용 안함 {}
    param += 10
    return 10+param #반환할게 있을 때 쓴다. 반환할게 없다면 pass라고 써.

n = fn(90)#함수 호출
print( n )




★파이썬
# 슬라이싱 : 잘라내기
li = [ 10, 20, 30, 40]
print( li[0] )
print( li[0:2] )
print( li[1:2] ) # []하고 한것이 개수는 아니다라는것을 알수있다. 마지막 번호인가 보다라고 판다
print( li[1:4] )
print( li[1:5] ) #자바같은 경우는 에러가 뜸. 요소 번호 추가시, 파이썬은 에러는 안나지만 이 식은 에러라는 것을 알아야한다




★파이썬
# 리스트의 요소 번호
# 길이 :5
# [0][1][2][3][4]
# [-5][-4][-3][-2][-1]  <--- 번호- 길이  # -0이란 표현이 없기때문에 음수로 표현시-1~부터 할수 있다.
# 음수로 표현하는 방법은 많지는 않다. 가능 하다는 것만 알고 있자. 음수로 표현시 컴퓨터에서 오류가 많다.

# 슬라이싱 : 잘라내기
li = [ 10, 20, 30, 40 ]
print( li[0] )
print( li[0:2] )
print( li[1:15] )



★파이썬

x=10;

def fn():
    y=25

x = x + y






★파이썬
#모두 객체 - 힙에 생성된다 이다 ...
x=10;
print(x)

x=20;
print(x)
#지금 변수는 하나라고 보고 있는것





★파이썬
#모두 객체 - 힙에 생성된다 이다 ...
x=10;
print(x)
print( id(x) ) #식별 - 위치값

x=20;
print(x)
print( id(x) )
#id 값을 찍어보면 다른 값이 나옴
# 새로 만든다는 개념이 됨





★파이썬
#모두 객체 - 힙에 생성된다 이다 ...
#참조의 개념을 설명 중


x=10;
print(x)
print( id(x) ) #식별 - 위치값

#아래 x변수를 다시 생성 했기 때문에 위에x는 없어짐(찾으려면 id값(주소)로 찾아야함) 
x=20;
print(x)
print( id(x) )
#id 값을 찍어보면 다른 값이 나옴
# 새로 만든다는 개념이 됨
#자바는 new로 명시적으로 써서 알 수 있지만, 파이썬은 id를 모르느 상화이면 다르다는 것을 모른다.

y = x #바로 위 x의 참조값이 들어감 
      #20? 2016? 이 들어가는 걸까
      # 값을 복사 (저장한다)
print(y)
print( id(y) )
#y는 x랑 같은 값이 나온다(2번재 x)
#id를 주소라고 생각해라.






*파이썬
#모두 객체 - 힙에 생성된다 이다 ...
#참조의 개념을 설명 중

x=10;   #주소를 나타냄 10 숫자가 아님
print(x)
print( id(x) ) #식별 - 위치값

#아래 x변수를 다시 생성 했기 때문에 위에x는 없어짐(찾으려면 id값(주소)로 찾아야함) 
x=20;
print(x)
print( id(x) )
#id 값을 찍어보면 다른 값이 나옴
# 새로 만든다는 개념이 됨
#자바는 new로 명시적으로 써서 알 수 있지만, 파이썬은 id를 모르느 상화이면 다르다는 것을 모른다.

y = x #바로 위 x의 참조값이 들어감 
      #20? 2016? 이 들어가는 걸까
      # 값을 복사 (저장한다)
print(y)
print( id(y) )
#y는 x랑 같은 값이 나온다(2번재 x)
#id를 주소라고 생각해라.
