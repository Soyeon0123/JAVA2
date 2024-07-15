package day03.task.food;

public class FoodMain {

	public static void main(String[] args) {
		Naengmyeon mulNeang = new Naengmyeon();
		mulNeang.addFlavor(new Flavor() {

			@Override
			public void printFlavor() {
				System.out.println("식초를 넣어 시큼한 맛과 시원한 맛이 일품이다.");
			}
		});
		
		System.out.println("===================================");
		
		Sushi sushi = new Sushi();
		sushi.addFlavor(new Flavor() {

			@Override
			public void printFlavor() {
				System.out.println("다양한 회의 맛을 느낄 수 있다.");
			}
		});
		
		sushi.explainCooking(new Cooking() {

			@Override
			public void explainCook() {
				System.out.println("1. 적당히 밥을 뭉친다.\n2. 회를 적당히 썬다.\n3. 밥 위에 회를 올린다.");
			}
			
		});
		
		
		System.out.println("===================================");
		
		
		CanShrimp Cshrimp = new CanShrimp();
		Cshrimp.addFlavor(new Flavor() {

			@Override
			public void printFlavor() {
				System.out.println("달콤한 소스와 새우살이 탱글하다.");
			}
		});
		
		Cshrimp.explainCooking(new Cooking() {

			@Override
			public void explainCook() {
				System.out.println("1. 반죽을 만든다.\n2. 새우를 손질하여 새우살을 준비한다.\n3. 새우를 반죽에 묻혀 튀긴다. ");
			}
		});
		
		
		
		
		
	}

}
