# f = open("c:/test/question.txt", "r", encoding="utf-8") 
# 쓰기 w, 읽기 r, 추가 a

# line = f.readlines() # 파일 전체 읽어오기: 한 줄씩 가져와서 리스트에 저장
# line = f.readline()  # 파일 한 줄 읽어오기
# line = f.read()      # 파일 전체 읽어오기
# print(line)

# f.close() # 파일을 열어서 다 읽었다면 닫아야한다.

'''
file = []

with open("c:/test/question.txt", "r", encoding="utf-8") as f :
    # 이 코드는 파일을 열어서 출력해주고 나면 자동으로 파일을 닫음
    file = f.readlines()

for i in range(len(file)):
    file[i] = file[i][:len(file[i])-1] 
    # 문자열 슬라이싱: "banana"[2:] -> "nana" || "banana"[2:4] -> "na" || "banana"[:4] -> "bana" 
    # 각각 2번 인덱스부터 끝까지, 2번부터 4번 인덱스까지, 0번부터 4번 인덱스 전까지 문자열 자른다는 뜻
    file[i] = file[i].split(" ")

# print(file)

search = input("작성자 또는 질문 카테고리로 검색: ")
print("\n")
'''

'''
searchArr = []
for i in range(len(file)):
    if(file[i][0] == search or file[i][1] == search):
        searchArr.append(file[i])

for i in range(len(searchArr)):
    print("작성자: {0}".format(searchArr[i][1]))
    print("제목: {0}".format(searchArr[i][0]))
    print("작성일: {0}".format(searchArr[i][3]))
    print("문의글: {0}".format(searchArr[i][2]))
    print("--------------------------------------------")
    print("답변: {0}".format(searchArr[i][4]))
    print("답변일: {0}".format(searchArr[i][5]))
    print("============================================\n")
'''

'''
for qus in file:
    for i in range(len(qus)):
        if search in qus:
            print("작성자: {0}".format(qus[1]))
            print("제목: {0}".format(qus[0]))
            print("작성일: {0}".format(qus[3]))
            print("문의글: {0}".format(qus[2]))
            print("--------------------------------------------")
            print("답변: {0}".format(qus[4]))
            print("답변일: {0}".format(qus[5]))
            print("============================================\n")
            break
'''

'''
# 튜플: 리스트처럼 데이터를 저장해두는 구조
        리스트처럼 여러 데이터를 복합적으로 저장하는 게 가능하나, 리스트와 달리 데이터 변경이 안된다.
        그 외에는 리스트와 동일.
        표현태그는 ()이다. (리스트는 [])
        튜플은 데이터의 갯수가 고정적으로 제한되어있거나 데이터가 변경되지 않아야 하는 경우에 사용한다.

[]로 표현된다고 리스트인 게 아니고, ()로 표현된다고 튜플인 게 아니므로 반드시 타입확인을 해주는 것이 좋다: print(type(튜플 or 리스트명))
'''

# 튜플 생성
tu1 = "새신발", "밟혔다."
print(tu1)
print(type(tu1))
tu2 = ("그래서", "싸웠다.")
print(tu2)
tu3 = ("화해했다.")
print(type(tu3))            # str

tu_strange = ("메이드복",)
print(type(tu_strange))     # tuple
tu_strange_maid = ("맛있어", "져라", "모에모에큥")
a, b, c = tu_strange_maid
print(a, b, c)
print(tu_strange_maid[2])   # 튜플 인덱스 사용
print(tu_strange_maid[:2])  # 튜플 슬라이싱: 처음부터 2번 인덱스 전까지
# tu_strange_maid.append("당신의 하트에 니코니코니") # 새 데이터 추가 불가능
# tu_strange_maid = "내 마법으로 맛있어"            # 데이터 변경 불가능
print(tu_strange_maid.count("져라")) # 지정 데이터가 몇개나 있는지
print(tu_strange_maid.index("모에모에큥")) # 지정 데이터는 몇번 인덱스에 있는지
