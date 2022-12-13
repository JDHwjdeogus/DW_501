import random

'''
# set
    - 리스트와 달리 순서없이, 중복없이 사용
    - 순서가 없다는 것은 입력한 순서대로 저장되어있지 않다는 것.
    - 중복 제거가 필요한 경우에 사용
    - 그룹 구성할 때 사용 (집합)
    - 데이터를 변경할 순 없지만 데이터를 제거하고 새 데이터를 추가할 수 있다
    - set은 {}로 작성된다.


# set 생성
    set1 = {"사과", "배", "참외", "배", " 배"}
    print(set1)

    set2 = set("member")
    print(set2)

    set3 = set("idden 이새키는 지금 집에 가고 싶다. 집에 가서 김치만두나 데워먹고 싶다. 집에 가서 수성의 마녀 최근화도 보고 싶다.")
    print(set3)

    set4 = set(("할머니", "보고", "싶다"))
    print(set4)

    # print(set4[0])           # 인덱스를 사용한 set 데이터 접근 불가: 자바에서는 iterator라는 것을 사용했다.
    for s in set4:
        print(s)
    print("할머니가" in set4)   # set 내부에 지정 데이터가 있는지 확인

    set4.add("응애")
    print(set4)

    set5 = {"안경을 쓰고있다.", "그래서", "겨울에는 김이 너무 자주 서린다."}
    set4.update(set5)
    print(set4)

    list = ["idden은", "성격이 더럽다."]
    set4.update(list)           #리스트 뿐만 아니라 튜플, 딕셔너리 데이터 추가도 가능
    print(set4)

# set 데이터 삭제
    set4.remove("겨울에는 김이 너무 자주 서린다.") # 삭제 데이터가 없으면 오류 발생
    print(set4)                                 # 삭제데이터가 없어도 오류 미발생

    set4.discard("그래서")
    print(set4)

    a = set4.pop()                              # 마지막 데이터 추출해 삭제, 마지막 데이터를 추출해 밖으로 빼고 set에서는 삭제
    print(set4)
    print(a)

    set4.clear                                  # set을 비움
    del set4                                    # set을 아예 지움
'''

'''
# 집합
abcde = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "v"}
zyxwu = {"z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "e"}
cha = abcde-zyxwu   # 차집합
print(cha)
hab = abcde | zyxwu # 합집합
print(hab)
gyo = zyxwu & abcde # 교집합
print(gyo)
hab_gyo = zyxwu ^ abcde   # 합집합에서 교집합 빼기
print(hab_gyo)

cha = abcde.difference(zyxwu)
# abcde.difference_update(zyxwu)        차집합: abcde의 데이터가 변경됨
gyo = abcde.intersection(zyxwu)
# abcde.intersection_update(zyxwu)      교집합: abcde의 데이터가 변경됨
hab = abcde.symmetric_difference(zyxwu)
# abcde.symmetric_difference(zyxwu)     합집합: abcde의 데이터가 변경됨
'''

'''
이정수팀장 = {"김기원", "최윤도", "장영주", "이종빈", "김민서", "aaa", "zzz", "idden"}
이지현팀장 = {"김지연", "윤재영", "윤종찬", "변수정", "aaa", "zzz", "a12"}

스파이 = 이정수팀장.intersection(이지현팀장)
print("스파이: {0}".format(스파이))
이정수_해바라기 = 이정수팀장 - 이지현팀장
print("이정수팀장 해바라기: {0}".format(이정수_해바라기))
전계림추종자 = {"장영주", "윤재영", "김지연", "이종빈"}
이지현_해바라기 = 이지현팀장 - 이정수팀장
이지현_해바라기 = 이지현_해바라기 - 전계림추종자
print("이지현_해바라기: {0}, 총 {1}명".format(이지현_해바라기, len(이지현_해바라기)))
'''
setNum = {random.randint(1, 50)}
while len(setNum) != 10:
    setNum.add(random.randint(1, 50))
print(setNum)

member = [
    ["김춘추", "01012345678", "남"],
    ["김지연", "01033847263", "여"],
    ["이순신", "01083942745", "남"],
    ["하지원", "01093846531", "여"],
    ["전계림", "01032220205", "남"],
    ["전지현", "01098376443", "여"],
    ["윤재영", "01011228875", "남"],
    ["이지현", "01099884455", "여"],
    ["장영실", "01023498741", "남"]
]

name = []
for i in member:
    name.append(i[0])
setMem = set(name)

print("========= 회원가입 =========")
i_name = input("이름: ")
setName = {i_name}

while setName.issubset(setMem) :    # issubset() : 지정한 set 안에 값이 포함되어있나
    print("이름이 중복됩니다.")
    i_name = input("이름: ")

# issuperset() : a.issuperset(b) : b가 a에 모두 있나
# a가 b에 포함되어있나 : b.issuperset(a) || a.issubset(b)

tel = input("전화: ")
gender = input("성별: ")

member.append([i_name, tel, gender])
print(member)