# HTTP - 하이퍼텍스트(html) 을 전송하기위한 프로토콜
# 프로토콜 -  약속, 규약 
# url -  http://www.naver.com
# uri -   url 에    사용자 정보와 스키마 를 포함한값


# 스크래핑: 웹페이지에서 자동으로 데이터를 추출하는 것. 웹 페이지 소유자의 허락없이 무단으로 끌어 오는행위 (특정 웹사이트에서 데이터 추출)
# 크롤링: 웹페이지에서 자동으로 대이터 추출 (웹사이트의 링크를 통해 정보를 찾아서 추출ㄹ하는 방식)
# 둘 다 데이터를 추출하는 것을 의미하므로 흔히 크롤링이라고 한다.
# import urllib.request
# import requests

from urllib.request import urlopen
import bs4

'''
url = "https://www.naver.com"
html = urlopen(url)
print(html.read())
'''

'''
test_html = "<html><head></head><body><div>아아아아아아아아</div><p>안아줘요</p></body></html>"
bobj = bs4.BeautifulSoup(test_html, "html.parser")

print(test_html)
print(bobj)
print(test_html.find("div"))
print(bobj.find("div"))
print(bobj.find("p"))
'''

'''
html = """
<html>
    <body>
        <div>
            <ul class="baby">
                <li>응애</li>
                <li>나</li>
                <li>애기</li>
            </ul>

            <ul class="cold">
                <li>개추워요</li>
                <li>흐발</li>
                <li>안아줘요</li>
            </ul>

        </div>
    </body>
</html>
"""
bsp = bs4.BeautifulSoup(html, "html.parser")
'''

'''
ul = bsp.find("ul")
print(ul)

li = bsp.findAll("li")
print(li)
print(li[1])
for i in li:
    print(i.text, end=" ")
'''

'''
# 태그의 속성을 통해 가져오는 방법
ul = bsp.find("ul", {"class":"cold"})
print(ul)
print(ul['class'])
'''

url = "https://comic.naver.com/webtoon/weekday"

html = urlopen(url)
html = html.read()
bsp = bs4.BeautifulSoup(html, "html.parser")

'''
temp = bsp.findAll("strong", {"class", "current"})
print(temp[0].text)
for t in temp:
    if "현재기온" in t:
        print(t.text)
# print(html)

menu = bsp.findAll("a", {"class":"nav"})
for i in menu:
    print(i.text)
'''
'''
news_ul = bsp.find("ul", {"class", "type02"})
news_li = news_ul.findAll("li")
for li in news_li:
    strong = li.find("strong")
    print(strong.text)
'''
'''
webtoon = bsp.findAll("div", {"class", "col_inner"})
webtoonThu = webtoon[3].find("ul")
li = webtoonThu.findAll("li")
for i in li:
    title = i.find("a", {"class", "title"})
    print(title.text)
'''
