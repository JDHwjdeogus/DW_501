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

'''
for i in range(1,100) : 
    if i % 3 == 0 :
        if i % 5 == 0 :
            print("★ ★ ★ ♥ ♥ ♥    ", end="")
            # end="" : 줄바꿈을 "" 으로 대체
        else :
            print("♥ ♥ ♥   ")
    elif i % 5 == 0 :
        print("★ ★ ★   ")
    else :
        print(i)
'''
'''
# 파이썬 데이터 타입: 리스트, 튜플, 딕셔너리, 셋, 배열 #

# list 선언 방법 1
name = ["a", "b", "c"]
print(name)

data1 = ["aaa", 666, 3.14, True]
print(data1)

# list 선언 방법 2
data2 = list(("심연", "애옹", 9999, 1010))
print(data2)

print(data2[0])
print(data2[-1])    # 뒤에서 첫번째 데이터를 출력
print(data2[1:3])   # 1번 인덱스에서부터 3번 인덱스 전까지를 출력
print(data2[:3])    # 처음부터 3번 인덱스 전까지
print(data2[2:])    # 2번 인덱스부터 끝까지
data2.append("이 마음은 아무도 모를거다.")
data2.append("인생은 공수래공수거라고 했다")
print(data2)
data2.remove("심연")
print(data2)
data2.pop()         # 마지막 데이터 제거
print(data2)
del data2[1]        # 인덱스를 통한 제거
print(data2)
data2.clear()       # 리스트 내부의 데이터 전부 제거
print(data2)
'''
'''
memo = ["당신이", "심연을", "바라보면", "심연도 당신을 애옹"]
for me in memo:
    print(me, end=" ")
memo[1:4] = ["쥑쥑스를", "바라보면", "오, 쥐..."]
print()
for me in memo:
    print(me, end=" ")
print("\n======================")
memo.insert(3,"나는 가끔 쥑쥑스와 함께 춤을 춰")
print(memo)
'''
'''
memo1 = ["idden", "osman", "lad"]
memo2 = ["피그말리온", "갈라테이아", "그리스"]
memo1.extend(memo2)
print(memo1)
print( len(memo1) )
'''

'''
리스트 생성
1. memo = ["a", "b", "c"]
2. memo = list(("idden", "osman", "lad"))
데이터 추가: memo.append("not blood")
데이터 삽입: memo.insert(2, "D")
# 데이터 삭제
삭제 데이터 지정: memo.remove("D")
마지막 데이터 삭제 memo.pop()
인덱스로 삭제 del memo[3]
리스트 합치기 memo.extend(리스트명)
리스트 크기 len()
갯수 구하기 memo.count("n"): n 이라는 데이터가 몇 개나 들어가있나
인덱스 찾기 memo.index("i"): i 라는 데이터는 몇 번 인덱스인가
정렬 memo.sort(): 오름차순, memo.sort(reverse=True): 내림차순
반전 memo.reverse()
'''

info = ["오늘 아침을 굶었다", "충동구매한 쿠키를 먹었다", "오늘 귀가하는 길에 하나 더 사야겠다고 생각했다", "내일은 약속이 있다", "외박을 할 예정이다", "같이 외박할 친구가 없어 혼자 자게 생겼다"]
search = input("검색할 단어를 입력: ")

for i in range(len(info)):
    if search in info[i] :
        print(info[i])
    if "오늘" in info[i] :
        print("** 자동검색 키워드 '오늘': "+info[i])

# for ii in info:
#     if search in ii:
#         print(ii)
# #===========================#
# for iii in info:
#     if "오늘" in iii:
#         print(iii)
