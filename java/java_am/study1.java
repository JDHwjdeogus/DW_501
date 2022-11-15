package test1;
import java.util.Arrays;
import java.util.Scanner;
public class study1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// java 데이터 타입
		// 정수 타입: byte short int ling
		// 실수 타입: float, double
		// 문자 타입: char
		// 논리 타입: boolean
		
		/*
			int num = sc.nextInt();
			byte b = sc.nextByte();
			short s = sc.nextShort();
			long l = sc.nextLong();
			float f = sc.nextFloat();
			double d = sc.nextDouble();
			boolean bool = sc.nextBoolean();
			char ch1 = sc.nextLine().charAt(0);
			char ch2 = sc.next().charAt(0);
		*/
		
		/*
			System.out.print("국어점수를 입력: ");
			int kor = sc.nextInt();
			System.out.print("영어점수를 입력: ");
			int eng = sc.nextInt();
			System.out.print("수학점수를 입력: ");
			int mat = sc.nextInt();
			System.out.println("총점: " + (kor + eng + mat)); 
			System.out.println("평균: " + ((kor + eng + mat) / 3));
		*/
		
		// 배열
		// const arr = [], const arr2 = new Array();
		// 자바에서 1차원 배열 생성하기: 타입[] 배열이름 = new 타입[배열크기];
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		// score[5] = 100; : 지정한 길이를 넘어가므로 오류
		// System.out.println(score[0]);
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println("\n");
		
//		String[] name = new String[3];
//		for(int i = 0; i < name.length; i++) {
//			System.out.print("이름을 입력: ");
//			name[i] = sc.nextLine();
//		}
//		for(int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}
//		
		
		int[] temp = new int[10];
		System.arraycopy(score, 0, temp, 0, score.length);
		// score 배열의 0번째 인덱스부터 복사: temp 배열의 0번째 인덱스부터 score 배열의 길이만큼의 원소 갯수를 복사
		System.out.println(Arrays.toString(temp));
		
	}
}
