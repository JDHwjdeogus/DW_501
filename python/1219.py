path = "c:/test/member.txt"
d_key = ["번호", "이름", "연락처", "이메일", "성별", "주소"]

# 1. 이메일의 도메인만 분리해서 출력(중복 제거)
def setPrint(li):
    ListSet = set(li)
    print("도메인 목록: {0}, 도매인 총 갯수: {1} \n".format( ListSet, len(ListSet) ) )

def getList(file):
    mailList = []
    for i in range(len(file)):
        mailList.append(file[i][3].split("@"))

    domainList = []
    for i in range(len(mailList)):
        domainList.append(mailList[i][1])
    
    setPrint(domainList)


# 2. @naver.com의 도시이름
def printNaverCity(dic):
    dicList = list(dic.values())
    tmpLi = []
    for i in dicList:
        if "@naver.com" in i["이메일"]:
            tmpLi.append(i["주소"].split("-"))
    print("naver 도메인 사용자들의 도시이름: ")
    for i in tmpLi:
        print("{0} {1}".format(i[0], i[1]))
    print("\n")


# 3. 대전 중구의 여성
def printJG_FMN(dic):
    search = input("성별 입력(논, 여, 남): ")

    dicList = list(dic.values())
    tmpLi = []

    for i in dicList:
        if search in i["성별"]:
            tmpLi.append(i)

    print("대전 중구의 '{0}'".format(search))
    for i in tmpLi:
        if "중구" in i["주소"]:
            print(i["이름"])

    print("\n")


# 딕셔너리로 저장
def saveInDic(file):
    global d_key
    info = dict()

    for i in range(len(file)):
        info[i+1] = dict(zip(d_key, file[i]))
    
    printNaverCity(info)
    printJG_FMN(info)


# 파일 읽기
def readFile():
    global path
    file = []

    with open(path, "r", encoding="utf-8") as f :
        file = f.readlines()
    
    for i in range(len(file)):
        file[i] = file[i][:len(file[i])-1] 
        file[i] = file[i].split(" ")
    
    getList(file)   # 이메일 도메인 분리
    saveInDic(file) # 파일(리스트) 넘기기


readFile()


