package chapter12;

public class Ex5 {
	public static void main(String[] args) {
		Animal lion1 = new Lion("Simba");
		Animal lion2 = new Lion("Nufasa");
		
		Animal rabbit = new Rabbit("Bunny");
		
		ZooKeeper jane = new ZooKeeper();
		jane.feed(lion1);
		
		jane.feed(rabbit);
	}
}
