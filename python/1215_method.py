# 함수

# 자바의 메소드
# 반환타입 메소드 이름(매개변수){메소드 내용; 반환타입 존재 시 return;}

# 자바스크립트의 함수
# function 함수명(매개변수){메소드 내용; 반환값 존재 시 return;}

# 파이썬의 함수
# def 함수이름(매개변수): 
# 정의된 함수 샐행방법: 함수이름()
'''
def sum(a, b):
    return a + b
res = sum(10, 20)
print(res)

def func():
    print("아임 펑션")
func()

def func1(word):
    print(word+" 좋다.")
func1("고양이")

def minus(num1, num2):
    print(num1 - num2)
minus(sum(20,30), 40)

def whoami(name, what):
    if what=="바보":
        print(name+"은 "+what+"이다.")
    else:
        print(name+"은 "+what+"이/가 아니다.")
whoami("idden", "고양이")
whoami("idden", "바보")

def count(i):
    return i + 1
cnt = 0
while cnt < 10:
    cnt = count(cnt)
print(cnt)

cnt1 = 0            # 전역변수. count1()보다 먼저 생성한다.
def count1(): 
    global cnt1     # 파이썬 전역변수: count1()에서 cnt1을 사용하려면 global을 붙여 전역변수임을 명시하고 사용한다.
    cnt1 += 1       # 전역변수는 최소한으로만 사용하기로 한다. 남발하면 코드의 유지보수가 어려워진다. 오류의 원인을 파악하기 힘들어진다.
while cnt1 < 10:
    count1()
print(cnt1)
'''

'''
def plus100(num):
    num = num + 100
    return num
num = int(input("정수를 입력: "))
print("{0} + 100 = {1}".format(num, plus100(num)))


def mul(num1, num2):
    print("{0} x {1} = {2}".format(num1, num2, num1*num2))
n1 = int(input("첫번째 정수 입력: "))
n2 = int(input("두번째 정수 입력: "))
mul(n1, n2)
'''

'''
def makeOdd(num):
    num += 1
    print(num)

even50 = []
for i in range(50):
    if i % 2 == 0 and i > 0:
        even50.append(i)

for i in range(len(even50)):
    makeOdd(even50[i])
'''

'''
def add1(n):
    print(n+1)
li = [i for i in range(1,50) if i%2 == 0]
for i in li:
    add1(i)
'''