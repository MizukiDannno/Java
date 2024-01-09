package java1_32;

class Person{
	public static int count = 0;
	public String firstName;
	// インスタンスフィールドに「lastName」を追加
	public String lastName;
	public int age;
	public double height, weight;

	// lastNameの値を引数で受け取るコンストラクタを追加で定義
	Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		// 「this.lastName;」を追加しlastNameフィールドの値をセット
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// Person.count++を追加
		Person.count++;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です" + "\n");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}