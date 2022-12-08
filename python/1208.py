import random

'''
# 랜덤함수
num = random.randint(1, 99) # 1부터 99까지 중에서 랜덤으로 숫자 하나 지정
print(num)

first = ["a", "b", "c", "d", "e", "f", "g", "h", "i"]
second = [1, 2, 3, 4, 5, 6, 7, 8, 9]
third = ["R", "S", "T", "U", "V", "W", "X", "Y", "Z"]

f = random.choice(first)
s = random.choice(second)
t = random.choice(third)
print(f, s, t)
'''

'''
# 2차원 리스트
info = [
    ["idden", "작가", "오타쿠"],
    ["osman", "교사", "마법사"],
    ["lad", "의사", "연구원"]
]

search = input("검색할 단어를 입력: ")
# for i in info:
#     for k in i:
#         if search in k:
#             print(i[0])
#         else:
#             print("그런 사람은 없습니다.")
#             break

for i in info :
    if search in i:
        print(i[0])
'''

info501 = [
    ["김민서", "군인", 28], 
    ["김민정", "헤어디자이너", 28], 
    ["김지연", "밸리댄서", 34], 
    ["변수정", "멕시코음식점사장", 33], 
    ["윤재영", "수필가", 58],
    ["윤종찬", "파이터", 22], 
    ["이정수", "초등학생", 10], 
    ["이종빈", "프로게이머", 39], 
    ["이지현", "다도가", 69],
    ["장영주", "트럭기사",  61], 
    ["정다현", "디자이너", 44], 
    ["최윤도", "모필가", 24], 
]

countAge = [0, 0, 0, 0, 0, 0]
list30job = []

for i in info501:
    if int(i[2]) >= 10 and int(i[2]) < 20: 
        countAge[0] += 1
    
    if int(i[2]) >= 20 and int(i[2]) < 30: 
        countAge[1] += 1

    if int(i[2]) >= 30 and int(i[2]) < 40: 
        print("직업: " + i[1])
        list30job.append(info501[1])
        countAge[2] += 1

    if int(i[2]) >= 40 and int(i[2]) < 50: 
        countAge[3] += 1
    
    if int(i[2]) >= 50 and int(i[2]) < 60: 
        countAge[4] += 1
    
    if int(i[2]) >= 60 and int(i[2]) < 70: 
        countAge[5] += 1

print(countAge)
print("================================")
# ======================================


age = [0, 0, 0, 0, 0, 0]
age30 = []
age60 = ""
max = 0
for i in info501:
    age[int(i[2]/10) - 1] += 1
    if i[2] >= 30 and i[2] < 40:
        age30.append(i[1])
    if max < i[2]:
        max = i[2]
        age60 = i
print (age)
print (age30)
print (age60)
