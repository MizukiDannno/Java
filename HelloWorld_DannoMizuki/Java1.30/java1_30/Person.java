package java1_30;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	// インスタンスフィールド「weight」を定義
	public double weight;
	
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		count++;
	}

	// インスタンスメソッド「bmi」を定義
	public double bmi() {
		// インスタンスのBMIを返す
		return this.weight / this.height / this.height;
	}

	// インスタンスメソッド「print」を定義
	public void print() {
		// thisを用いて出力
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println("\n");
	}

	// 人数をカウント
	public static int count() {
		return count;
	}
	

}
