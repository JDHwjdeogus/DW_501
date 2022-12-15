import random

city = ("서울", "대전", "대구", "광주", "부산", "울산", "세종")
kind = ("신생아", "초등학생", "중학생", "고등학생", "대학생", "노년층")
population = dict()
for c in city:                              # 도시 수 만큼 입력
    temp = dict()
    for k in kind: 
        i = random.randint(1000, 30000)
        temp[k] = i                      # 나이대 별 인구수를 딕셔너리에 저장. 키: kind, value: 인구 수
    population[c] = temp                 # 위에서 만들어진 딕셔너리: value, 도시 이름: key

for k in population:
    print("{0}: {1}".format(k, population[k]))
