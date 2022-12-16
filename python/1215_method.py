import random

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


'''
def score_input(s): # 리스트에 입력값을 넣고 해당 리스트를 반환하는 함수
    scr = []        # 함수 내부에서 입력한 점수를 리스트에 저장해야 하므로 리스트를 함수 내부에 만들어줌.
    for sub in range(len(s)):
        scr.append( int(input(s[sub] + ": ")) )
    return scr      # for문으로 입력한 점수가 저장된 리스트 scr을 리턴해 사용하고자 하는 곳으로 값을 반환한다.

def total(scr):        # 총합 계산 함수
    sum = 0
    for i in scr:
        sum += i    # 입력한 점수의 총합
    return sum

def avg(sum, scr):          # 평균 계산 합수
    return sum / len(scr)

score = []
subj = ("국어점수", "영어점수", "물리치료")
score = score_input(subj)   # 튜플로 만든 subj를 함수에 보냄 (정확히는 subj의 주소를 보내는 것이다.)
dicScore = dict( zip(subj, score) )
print(dicScore)
print("총합: {0}, 평균: {1}".format( total(score), avg(total(score), score) ))
'''

'''
# 내가 한 거 구현 못 한 거 
def h_avg(h):
    sum = 0
    for i in range(len(h)):
        sum += h[i]
    avg = sum / len(h)
    print("평균 키: {0}".format(avg))
    return avg

def h_input(n):
    h = []
    for i in range(len(n)):
        h.append( int(input(n[i] + "의 키 입력: ")) )
    h_avg(h)

def h_short(h, n):
    short = h_avg(h)
    for i in range(len(h)):
        if short < h[i]:
            short = h[i]
    
    dic_h = dict( zip(h, n) )
    if dic_h[h] == short:
        print( "가장 작은 사람은 {0}({1}cm)".format(dic_h[h], h) )

height = []
name = ("장영순", "김지언", "이지형")
height = h_input(name)
h_short(height, name)
'''

'''
cutegirls =("장영순","김지언","이지형")

def small(avg, tall):
    global cutegirls
    for i in range(len(tall)):
        if avg > tall[i]:
            print("평균 보다 작은 사람 : {0}".format(cutegirls[i]))

def tall_avg(tall):
    sum=0
    for 소녀키 in tall: sum += 소녀키 
    avg = sum/len(tall)
    print("평균 키는 : "+str(avg))
    small(avg, tall)

def tall_input():
    global cutegirls
    tall=[]
    for 소녀 in cutegirls: 
        tall.append( int(input(소녀)))
    tall_avg(tall)


tall_input()
'''

def find5mul(li):
    print("5의 배수 찾기")
    for i in range(len(li)):
        if li[i] % 5 == 0:
            print (li[i], end=" ")

numList = [i for i in range(1, 51)]
find5mul(numList)
print("\n")
# =======================================

def func1(a, b, c):
    print(a)
func1(a = "a", b = "b", c = "c")
# 위의 방식으로 값을 할당할 때, 매개변수가 여러개라면 매개변수 갯수만큼 값을 할당해줘야 한다

def func2( national = "씁쓸함" ):
    print(national)
func2("인생시벌")
func2()
# =======================================

def func3( **info ):
    print(info["name"]) # name: key, value: "idden"(**info를 딕셔너리처럼 사용. info["키 이름"] >> 밸류 값 받아오기)
    print(info["status"])

func3(name = "idden", status = "낡음")
print("\n")
# =======================================

n_tuple = ("이순신", "장영실", "정몽주", "정도전", "이성계", "이방지")
def findT( tall ):
    global n_tuple
    short = tall[0]
    for i in range(len(tall)):
        if short > tall[i]:
            short = tall[i]
    print("가장 짧은 사람: {0}({1}cm)".format(n_tuple[tall.index(short)], short))

def findW( weight ):
    global n_tuple
    heavy = weight[0]
    for i in range(len(weight)):
        if heavy < weight[i]:
            heavy = weight[i]
    print("가장 무거운 사람: {0}({1}kg)".format(n_tuple[weight.index(heavy)], heavy))

t_list = []
w_list = []
for i in range(len(n_tuple)):
    t_list.append( random.randint(150, 200) )
    w_list.append( random.randint(40, 100) )

findT(t_list)
findW(w_list)

print("\n")
