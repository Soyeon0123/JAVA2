package day05.task.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// ArrayList를 선언하고 1부터 100까지의 수를 담은 다음
		// 홀수의 값에 2를 곱하여 치환하여 요소를 수정한다.
		// 전체 요소를 출력하는 프로그램 작성
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		
		// 1부터 100까지의 수를 담는다.
		for (int i = 0; i < 100; i++) {
			arrInt.add(i+1);
		}
		
		// 세팅한 값을 확인
		for (Integer integer : arrInt) {
			System.out.println(integer);
		}
		// 1~100
		
		// 홀수의 값에 2를 곱하여 치환, 
		for (int i = 0; i < arrInt.size(); i++) {
			int currentVal = arrInt.get(i);
//			if(i%2==1) { // 2로 나눈 나머지가 1이면
				// -> 홀수면
//			}
			if(currentVal%2==0) { // 짝수인 경우
				continue; // 다음 반복으로
			}
			// 홀수인 경우
			// 홀수인 값에 2를 곱하고
			int newValue = currentVal * 2;
			// 요소를 수정한다.
			arrInt.set(i, newValue);
		}
		System.out.println("====================");
		// 전체 요소를 출력하는 프로그램 작성
		for (Integer i : arrInt) {
			System.out.println(i);
		}
		
		// 2번 문제
		// ArrayList를 선언하고 1부터 100까지의 수를 담은 다음
		// 홀수의 값에 2를 곱한 값을 리스트에 추가한다.
		// 전체 요소를 출력하는 프로그램 작성
		
		ArrayList<Integer> arrInt2 = new ArrayList<Integer>();
		
		// 1부터 100까지의 수를 담는다.
		for (int i = 0; i < 100; i++) {
			arrInt2.add(i+1);
		}
		for (Integer integer : arrInt2) {
			System.out.println(integer);
		}
		
		// 홀수의 값에 2를 곱한 값을 리스트에 추가한다.
		for (int i = 0; i < arrInt2.size(); i++) {
			int Value = arrInt2.get(i);
			
			if (Value%2==1) {
				int newValue = Value * 2;
				arrInt2.add(i, Value);
			}
			
			System.out.println("=============");
			
			for (Integer i1 : arrInt2) {
				System.out.println(i1);
			}
			
		}
		
		
		// 전체 요소를 출력하는 프로그램 작성.
		
		
		
		
		
		
		
		
		
	}

}
