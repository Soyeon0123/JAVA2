package day03.practice.animal.mammal;

public class Dog extends Mammal {

	@Override
	public void walking() {
		System.out.println("네 발로 걷는다.");
	}
	
	public void bark() {
		System.out.println("소리내어 짖다.");
	}
	
}
