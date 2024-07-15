package day02.castingTask;

public class Shinchon extends Shop {
	// 메뉴를 다르게 해서
	// 내용을 채워준다
	
	static {
		// 10개 메뉴
		menus = new String[]{"치즈버거", "불고기버거", "치킨버거", "콜라", "제로콜라", "사이다", "펩시", "환타", "환타제로", "기본버거",};
	}
	
	@Override
	public void menuOrder(String menuName) {
		super.menuOrder(menuName);
	}
}
