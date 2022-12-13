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