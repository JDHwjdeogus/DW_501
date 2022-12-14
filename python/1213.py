# 딕셔너리: 사전
# 파이썬 딕셔너리, 자바의 Map과 같음
# key: value

# 키로 사용 가능한 것: 문자열, 정수, 실수, boolean
# 사용 불가: 리스트, set, 딕셔너리
# value 사용: 아무거나 다

# 딕셔너리 생성
# dic = {}
# dic = dict()

'''
dic = {'이름':'이순신', '나이':24, '직업':'군인'}
print(dic)
print(dic['이름'])

dic1 = dict(이름='김지연', 나이=27, 직업='마이쥬판매원')
print(dic1)
dic2 = dict([('이름', '이지현'), ('나이', '27'), ('특징', '상냥함')])
print(dic2)
dic3 = dict( zip(['이름', '나이', '관심분야'], ['윤재영', 25, '컴퓨터선생님']) )
print(dic3)

dic3['관심분야'] = '지연이누나'
print(dic3)
dic3['싫어하는것'] = '옆반선생님'
print(dic3)

if '이름' in dic3:
    print("너의 이름은 {0}".format(dic3['이름']))
else:
    print("존재하지 않는 키")
print(len(dic3))    # 딕셔너리 키 개수


title = ["캐릭터명", "생명력", "코딩기술", "잔머리", "수학능력", "공간능력", "지능지수"]
data = []
for x in title:
    data.append(input(x + " : "))
print(data)

info = dict( zip(title, data) )
print(info)

for x in info:
    print(x)        # 딕셔너리 key 출력
for x in info:
    print(info[x])  # 딕셔너리 value 출력
for x in info.values():
    print(x)        # 딕셔너리 value 출력
for x in info.keys():
    print(x)        # 딕셔너리 key 출력
for k, v in info.items():
    print(k, v)     # 딕셔너리 key, value 출력
'''

'''
title = ["이름", "키", "몸무게", "관심분야"]
# 5명의 정보를 입력
info = []
for i in range(5):
    data = []
    for t in title:
        data.append(input(t + " : "))
    info.append(data)

dicInfo = dict()
for data in info:
    dicInfo[data[0]] = dict( zip(title, data) )
print(dicInfo)
'''

'''
d_key = ["이름", "번호", "c언어", "java", "react", "db", "관심분야"]
d_value = []        # 입력한 값을 리스트에 저장하고 나면 값이 저장된 리스트를 저장할 리스트

for i in range(3):
    data = []       # 입력값이 저장될 리스트
    for k in d_key: # 한 사람에 대한 정보 입력 for문
        data.append(input(k+": "))
        if k == "관심분야":
            print("=====================")
    d_value.append(data)

dic = dict()
for data in d_value:
    dic[data[0]] = dict( zip(d_key, data) ) # 딕셔너리 이름: d_key, 모든 데이터: d_value

for k in dic:
    print("{0}: {1}".format(k, dic[k]))     # 딕셔너리 출력
'''

'''
# 성적의 합계 및 평균 구하기 1 (과목별 전체 x, 학생 한 사람 당 과목점수 합계 및 평균 o)
avg = []
dic_avg = dict()
for name in dic:
    sum = 0
    for title in dic[name]:
        if title=="이름" or title=="번호" or title=="관심분야":
            continue
        sum = sum + int(dic[name][title])
    avg.append(sum/4)
    dic_avg[name] = dict(평균점수=sum/4, 관심분야=dic[name]['관심분야'])
print(dic_avg)


# 성적의 합계 및 평균 구하기 2 (과목별 전체 x, 학생 한 사람 당 과목점수 합계 및 평균 o)
avg = []
dic_avg = dict()
for name in dic:
    sum = 0
    title = list(dic[name].keys()) # 딕셔너리의 키를 리스트로 변환
    for i in range(2,6):
        sum = sum + int(dic[name][title[i]])
    dic_avg[name] = dict(평균점수=sum/4, 관심분야=dic[name]['관심분야'])
print(dic_avg)


# 성적의 합계 및 평균 구하기 3 (과목별 전체 x, 학생 한 사람 당 과목점수 합계 및 평균 o)
avg = []
dic_avg = dict()
for name in dic:
    sum = 0
    score = list(dic[name].values()) # 딕셔너리의 value를 리스트로 변환
    for i in range(2,6):
        sum = sum + int(score[i])
    dic_avg[name] = dict(평균점수=sum/4, 관심분야=dic[name]['관심분야'])
print(dic_avg)
'''

# 딕셔너리 key만 리스트로 변환
# li = list(dic.keys())
# 딕셔너리의 value만 리스트로 변환
# li = list(dic.values())
# 딕셔너리의 key, value를 리스트로 변환
# li = list(dic.items())
# key와 value를 한 쌍으로 튜플 형태로 저장
# [ ('key1' : 'value1') , ('key2' : 'value2') ]



file = []

with open("c:/test/question.txt", "r", encoding="utf-8") as f :
    file = f.readlines()

for i in range(len(file)):
    file[i] = file[i][:len(file[i])-1] 
    file[i] = file[i].split(" ")

d_key = ["문의제목", "작성자", "문의내용", "작성일", "답변", "답변일"]
qus = dict()

for i in range(len(file)):
    qus[i+1] = dict(zip(d_key, file[i]))
print(qus)

for num in qus:
    print( "{0}. {1} {2}".format( num, qus[num]["문의제목"], qus[num]["작성일"] ) )

번호 = int(input("문의 번호: "))
print("작성자: {0}".format(qus[번호]['작성자']))
print("문의제목: {0}".format(qus[번호]['문의제목']))
print("작성일: {0}".format(qus[번호]['작성일']))
print("문의내용: {0}".format(qus[번호]['문의내용']))
print("============================")
print("답변: {0}".format(qus[번호]['답변']))
print("답변일: {0}".format(qus[번호]['답변일']))
'''
java에서 db 데이터 가져올 때 
rs = pt
rs.getInt("번호")
rs.getString("문의제목")
rs.getString("작성자")
컬럼명 입력해서 가져옴.
'''