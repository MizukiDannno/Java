package main;

import person.Person;
import vehicle.Bicycle;
import vehicle.Car;

public class Main {
	public static void main(String[] args) {

		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		// 合計人数を出力
		Person.printCount();


		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// 所有者を設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());

		// ownerを出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		System.out.println("\n");

		// 乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);
	}
}
