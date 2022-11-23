package zoo;

public class vertebrate_main { // 척추동물 분류
	int height;
	int weight;
	taxonomy bi = new taxonomy();
}



/* 포함 */

// 분류
class taxonomy {
	String species; // 동물 종: 강아지 고양이 등등
	String animalFamily; // 동물 과: 고양이과, 강아지과, 올빼미과, 두루미과
	String animalOrder; // 동물 목: 앵무목 영장목 식육목 박쥐목
	String animalClass;	// 동물 강: 조강 포유강 파충강
}



/* 상속 */

// 맹수
class beast_safari extends vertebrate_main {
	String herd; // 무리생활 유무
}

// 반려 가능한 소동물: 강아지, 고양이, 햄스터, 쥐 등등
class small_mammal extends vertebrate_main {
	String donator; // 일반인 기부자
}

// 조류
class birds extends vertebrate_main {
	boolean nurture; // 반려 가능 여부
}

