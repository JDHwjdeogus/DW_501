import random
'''
name = ["김유신", "이순신", "어영담", "이성계", "장영실", "홍길동", "을지문덕", "김춘추"]
job = ["군인", "국회의원", "과학자", "의적", "건설업자", "변호사", "장군"]
age = [24, 53, 57, 21, 28, 41, 30, 35, 42]
info = []
sum_of_Sc = 0
list_of_Sc = []
for i in range(10):
    info.append([random.choice(name), random.choice(job), random.choice(age)])

print("\n랜덤 리스트 info 출력: \n\n{0}\n".format(info))
print("=============================================")
print("1. 군인인 사람들의 이름:  ", end="")
for printing in info:
    if printing[1] == "군인":
        print(printing[0], end=" ")
print("\n=============================================")
print("2. 20대인 사람들의 직업:  ", end="")
for printing in info:
    if int(printing[2]/10) == 2:
        print(printing[1], end=" ")
print("\n=============================================")
for printing in info:
    if printing[1] == "과학자":
        sum_of_Sc += int(printing[2])
        list_of_Sc.append(printing)
if(sum_of_Sc != 0):
    print("3. 과학자인 사람들의 평균 나이:  {0:.1f}세".format(sum_of_Sc/len(list_of_Sc)))
else:
    print("3. 과학자인 사람들의 평균 나이:  {0:.1f}세".format(sum_of_Sc))
print("=============================================")
print("\ninfo 중에서 과학자인 사람들만 모은 리스트: \n{0}".format(list_of_Sc))
'''

'''
# 랜덤 사용방법
# random.randint(1, 40) : 1~40 중에서 랜덤
a = []
b = []
c = []
num = []

for i in range(15):
    a.append(random.randint(1, 30))
    b.append(random.randint(10, 50))
    c.append(random.randint(1, 100))

print("a: {0}".format(a))
print("b: {0}".format(b))
print("c: {0}".format(c))

for x in a:                 # a 리스트 값을 하나씩 x의 변수에 저장 
    if x in b:              # x의 값이 리스트 b에 있는가
        if x in c:          # x의 값이 리스트 c에 있는가
            num.append(x)

if len(num) != 0:                    # len(num) -> num 리스트의 크기값으로 중복값 존재 여부 판별
    print(num)
else:
    print("중복값이 존재하지 않음.")
'''

word = ["boy", "table", "book", "girl", "interest", "limit", "endless", "mission", "hope", "tigerprint"]
eng = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
randomAl = []
maked = ""
count = 0
for i in range(random.randint(3, 10)):
    randomAl.append(random.choice(eng))
for i in range(len(randomAl)):
    maked += str(randomAl[i])
    # print(randomAl[i], end="")
print("만들어진 단어: {0}".format(maked))
for i in word:
    count += 1
    if(maked == i):
        print("word 리스트의 {0} 와/과 겹칩니다. \n해당 단어는 word 리스트의 {1}번째 단어입니다.".format(i, count))

