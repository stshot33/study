package chapter12;

public class Ex9 {

	public static void main(String[] args) {
		Apple[] basket = new Apple[3];
		
		basket[0] = new Apple();
		basket[1] = new Apple();
		basket[2] = new Apple();

		Banana[] basket1 = new Banana[3];
		basket1[0] = new Banana();
		basket1[1] = new Banana();
		basket1[2] = new Banana();
		
		Onion[] basket2 = new Onion[3];
		basket2[0] = new Onion();
		basket2[1] = new Onion();
		basket2[2] = new Onion();
		
		Product[] basket3 = new Product[3];
		basket3[0] = new Apple();
		basket3[1] = new Banana();
		basket3[2] = new Onion();
		
		FruitShelf[] fruitShelf = new FruitShelf[2];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();
		
		Vegetable[] vegetableShelf = new Vegetable[1];
		vegetableShelf[0] = new Onion();
	}
}
