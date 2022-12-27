import requests
import bs4
import urllib
from urllib.request import urlopen
import pymysql

url = "https://weather.naver.com/today/07140102?cpName=KMA"
html = urlopen(url)

bsp = bs4.BeautifulSoup(html,"html.parser")
print(bsp.find("div",{"class","weather_table_wrap"}))