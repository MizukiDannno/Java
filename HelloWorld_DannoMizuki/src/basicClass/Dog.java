package basicClass;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。

	// 動物の名前の変数
	public String animalName;


	// Q2：フィールドに動物の数の変数を定義してください。

	// 動物の数の変数
	public int animalCount;


	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。

	// Dogクラスのコンストラクタを宣言
	public Dog(String animalName) {

		// animalNameを受け取る
		this.animalName = animalName;

	}


	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

	// Dogクラスのコンストラクタを宣言
	public Dog(int animalCount) {

		// animalCountを受け取る
		this.animalCount = animalCount; 

	}

}
