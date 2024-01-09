package java1_31;

public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;

	// クラスフィールド「count」を定義
	public static int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// countに1を足す
		count++;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println("\n");
	}

	public static int count() {
		return count;
	}
	
	// クラスメソッド「printCount」を定義
	public static void printCount() {
		// クラスフィールド「count」を用いて合計人数を出力
		System.out.println("合計" + Person.count() + "人です");
		System.out.println("\n");
	}
}
