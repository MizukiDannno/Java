package java1_33;

public class Person {

	// インスタンスフィールドを定義
	public String firstName, lastName;
	public int age;
	public double height, weight;

	// クラスフィールド「count」を定義
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName, String lastName, int age, double height, double weight){

		// コンストラクタの中で値をセット
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// クラスフィールドに1を足す
		count++;
	}


	// 氏名「fullName」を定義
	public String fullName(){
		return this.firstName + this.lastName;
	}

	// インスタンスメソッド「bmi」を定義
	public double bmi() {
		// インスタンスのBMIを返す
		double BMI = this.weight / (this.height * this.height);
		return BMI;
	}

	// インスタンスメソッド「print」を定義
	public void print() {
		// メソッド内でthisを用いて出力
		System.out.println("名前は" + this.fullName() + "です");
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


	// インスタンスメソッドbuyを定義（仮引数：car）
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	// インスタンスメソッドbuyを定義（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}

