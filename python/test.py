'''
print("test")
x = 9
print("output: " + str(x))
print("output: {0}".format(x))

a = 3.14
print("float: {0}".format(a))
print("float: {0:.1f}".format(a))
print(type(a))

name = "idden"
print( "이름: {0:s}".format(name))
print("이름: " + name)

memo = "자도자도 졸림."
result = name + ": " + memo
print(result)
res_len = len(result)
print(res_len)

temp1 = result.split()
temp2 = result.split(" ", 1)
# 띄어쓰기를 기준으로 문자열을 나누되 한번만 나눈다.
print(temp1)
print(temp2)
print(" {0}".format(",".join(temp1)))
# join은 문자열 배열을 합치기.                                              # 주석 1
""" "%".join(배열)을 하면 각 배열의 요소 사이에 %가 붙은 상태로 합쳐진다. """ # 주석 2

# num = input("숫자를 입력하세요: ")        # input은 입력함수로, 결과는 문자열만을 반환한다.
num = int(input("숫자를 입력하세요: "))     # 따라서 숫자로서 반환되길 원한다면 형변환(캐스팅)을 해준다.
print(type(num))
# 정수타입 변환: int(), 실수타입 변환: float(), 문자열 타입 변환: str()
'''

kor = int(input("국어점수 입력: "))
eng = int(input("영어점수 입력: "))
mat = int(input("수학점수 입력: "))
sum = kor + mat + eng
avg = sum / 3
print("과목평균: {0:.3f}".format(avg))