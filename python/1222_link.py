import bs4
import requests


def getHref(html_tag):
    main_ul = bsp.find("ul", {"class","permanent-list-body"})
    main_li = main_ul.findAll("li")
    href_list = []  # 링크들을 저장할 리스트

    for li in main_li:
        sub_ul = li.findAll("ul", {"class", "permanent-area"})
        for sul in sub_ul:
            sub_li = sul.findAll("li")
            for sli in sub_li:
                if sli.find("a"):
                    href_list.append(sli.find("a")['href'])
    return href_list



url = "https://www.museum.go.kr/site/main/content/permanent_exhibition_guide"
site = "https://www.museum.go.kr"

result = requests.get(url=url)

bsp = bs4.BeautifulSoup(result.content, "html.parser")

href_list = getHref(bsp)

dic_column = ["title", "menu"]
site_info = dict()

for href in href_list:
    link = site + href
    result2 = requests.get(url=link)
    sub_bsp = bs4.BeautifulSoup(result2.content, "html.parser")
    ptitle = sub_bsp.find("h2", {"class", "page-title"}).text
    showtitle = sub_bsp.find("p", {"class", "showroom-title"}).text
    ul = sub_bsp.find("ul", {"class", "swiper-wrapper"})
    li = ul.findAll("li")
    menu = [l.find("a").text.strip() for l in li]
    site_info[ptitle] = dict(zip(dic_column, [showtitle, menu]))
    # print(ptitle, showtitle)
print(site_info)


'''
main_ul = bsp.find("ul", {"class","e1p6yfdy3"})

main_li = main_ul.findAll("li", {"class", "e1oznup73"})

href_list = []  # 링크들을 저장할 리스트

for li in main_li:
    sub_ul = li.find("ul")
    sub_li = sub_ul.findAll("li")
    for sl in sub_li:
        href_list.append(sl.find("a")['href'])
print(href_list)
'''
