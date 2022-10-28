$(document).ready(function(){
    // $(".menu-toggle").click -> 이벤트 이름을 직접 설정
    // 모든 이벤트에 대한 스크립트 설정
    $(".menu-toggle").on("click", function(){
        $(".gnb").stop().slideToggle('fast');
        // 애니메이션 함수(jQuery)
        // show(1000) -> 숨겨진 항목(hide())에 대해 보이도록 하는 함수. 1000ms라는 시간동안 천천히 보임.
        // hide(1000) -> 나타난 항목(show())에 대해 숨기도록 하는 함수. 1000ms라는 시간동안 천천히 숨겨짐.
        // toggle(); -> hide() & show()
        // fadein(), fadeout();
        // show()와 fadein()차이: 후자는 투명도를, 전자는 아예 있고 없고를 설정.
        // slideup(), slidedown(), slideToggle(); -> 슬라이드 형태로 나타나고 사라짐. slideToggle()은 앞의 두 가지를 한번에 설정.
    });
});