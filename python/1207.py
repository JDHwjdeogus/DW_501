'''
# 문제 1
PI = 3.14
r = float(input("반지름을 입력(km): "))
v = float(input("속도를 입력(km/h): "))
h = PI * (r * 2)/v
print("트랙 한 바퀴 거리(km): {0:.1f}".format(PI * (r * 2)))
print("트랙 한 바퀴 완주 시 걸리는 시간(h): {0:.2f}".format(h))
'''

'''
# 문제 2
alcohol = int(input("하루에 마시는 소주(잔 단위): "))
damage = 2
life = alcohol * damage * 365 * 20
hours = life / 60
days = hours / 24
print("단축된 수명(분 단위): " + str(life))
print("단축된 수명(시간 단위): " + str(hours))
print("단축된 수명(일 단위): " + str(days))
'''

'''
x, y, z = "idden", "osman", "lad"
a = b = c = "유사가족"
favorite = ["프리랜서", "교사", "의사"]   #list
a, b, c = favorite
print (a)
print (b)
print (c)
'''

'''
# 비교연산자: ==, !=, >, <, <=, >=
num1 = 18
num2 = 27

# 조건문: if문에선 조건 뒤에 : 을 붙여야만 한다.
if num1 < num2 : 
    print("부끄럼 많은 삶을 살았습니다.")
else: 
    print("내 소심한 자만심과 거만한 수치심.")
print("인간실격")

num3 = 24
if num3 > num1 : 
    print("나는 늘 혼자고 비참하오.")
elif num3 < num1 : 
    print("새는 알에서 나오기 위해 투쟁한다.")
else :
    print("알은 세계이다.")
print("프랑켄슈타인")

name = "idden"
print("이 중에서 내가 읽은 건 인간실격...") if name == "idden" else print(" 데미안은 아직 읽고 있음...") if num2 == 27 else print(" 산월기는... 읽어야 함...")

j = int(input("j의 점수를 입력: "))
g = int(input("g의 점수를 입력: "))
print("비겼다...!") if j == g else print("j의 승...!") if j > g else print("g의 승...!")
'''

'''
# 문제 4
y = int(input("y의 시험 점수를 입력: "))
j = int(input("j의 시험 점수를 입력: "))
s = int(input("s의 시험 점수를 입력: "))
tot = y + j + s
avg = tot / 3
print("세 사람의 점수 총합: {0}".format(tot))
print("세 사람의 점수 평균: {0:.2f}".format(avg))

if avg < 70 :
    print("평균 점수의 등급은 ...")
else :
    if avg < 80 :
        print("평균 점수의 등급은 C.")
    else :
        if avg < 90 :
            print("평균 점수의 등급은 B.")
        else:
            print("평균 점수의 등급은 A.")

if avg >= 90 :
    print("평균 점수의 등급은 A.")
elif avg >= 80 :
    print("평균 점수의 등급은 B.")
elif avg >= 70 :
    print("평균 점수의 등급은 C.")
else :
    print("평균 점수의 등급은 ...")
'''

'''
# 파이썬은 증감연산자(++)가 없다.
num = int(input("보고 싶은 구구단의 단을 입력: "))
i = 1
while i < 10 :
    # print(i)  # 1부터 10 까지 출력
    # print(str(num) + " * " + str(i) + " = " + str(i * num))   # 방법 1
    print("{0} * {1} = {2}".format(num, i, i * num))            # 방법 2
    i += 1
'''

'''
i = 1
while i < 5 : 
    print(i)
    i += 1
else :
    print("5 이상이라면 반복문 종료 \n")

i = 1
while True :
    print(i)
    if i == 100 : break
    i += 1
'''

'''
m = 10000
c = 0
while m > 1200 :
    m -= 1200
    c += 1
print("탑승 횟수(환승 x): {0}번, 잔액: {1}원".format(c, m))
'''

'''
for i in range(10) :        # (0부터 10까지)
    print(i)

for i in range(1, 10) :     # (1부터 10까지)
    print(i)

for i in range(1, 10, 3) :  # (1부터 10까지 3씩 증가)
    print(i)
'''

'''
num = int(input("보고 싶은 구구단의 단을 입력: "))
for i in range(1, 10) :
    print("{0} * {1} = {2}".format(num, i, num * i))
'''