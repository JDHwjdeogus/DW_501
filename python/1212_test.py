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
