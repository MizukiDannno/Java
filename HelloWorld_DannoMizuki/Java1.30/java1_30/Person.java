package java1_30;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// クラスフィールド「count」を定義
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 合計人数を表すクラスフィールドに1を足す
		count++;
	}

	// インスタンスメソッド「bmi」を定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// インスタンスメソッド「print」を定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println("\n");
	}

	// 人数をカウント
	public static int count() {
		return count;
	}
	
	// クラスメソッド「printCount」を定義
	public static void printCount() {
		System.out.println("合計" + Person.count() + "人です");
		System.out.println("\n");
	}
}
