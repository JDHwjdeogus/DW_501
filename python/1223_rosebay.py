import requests
import bs4
from urllib.request import urlopen

url = "https://www.graychic.co.kr/product/list.html?cate_no=4"
# res = requests.get(url=url)
html = urlopen(url)

bsp = bs4.BeautifulSoup(html, "html.parser")
href_list = []
items = bsp.findAll("div", {"class", "sp-product__thumb"})
# print(items)

for item in items:
    href_list.append(item.find("a")['href'])
print(href_list)