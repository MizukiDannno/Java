package curriculum_A;

public class Qes1_13 {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// 問1:ローカル変数の宣言
		// 問2:初期値の代入
		// 問3:変数への値の代入

		// バイト型
		// バイト型の変数を宣言し初期値を代入
		byte Byte1 = 0;
		// 変数に値を代入
		Byte1 = 10;

		// 短整数型
		// 短整数型の変数を宣言し初期値を代入
		short Short1 = 0;
		// 変数に値を代入
		Short1 = 100;

		// 整数型
		// 整数型の変数を宣言し初期値を代入
		int Int1 = 0;
		// 変数に値を代入
		Int1 = 1000;

		// 長整数型
		// 長整数型の変数を宣言し初期値を代入
		long Long1 = 0L;
		// 変数に値を代入
		Long1 = 10000;

		// 単精度浮動小数点数型
		// 単精度浮動小数点数型の変数を宣言し初期値を代入
		float Float1 = 0.0f;
		// 変数に値を代入
		Float1 = 9.5f;

		// 倍精度浮動小数点数型
		// 倍精度浮動小数点数型の変数を宣言し初期値を代入
		double Double1 = 0.0d;
		// 変数に値を代入
		Double1 = 10.5;

		// 文字型
		// 文字型の変数を宣言し初期値を代入
		char Char1 = '\u0000';
		// 変数に値を代入
		Char1 = 'a';

		// 文字列型
		// 文字列型の変数を宣言し初期値を代入
		String String1 = null;
		// 変数に値を代入
		String1 = "ハロー";

		// ブーリアン型
		// ブーリアン型の変数を宣言し初期値を代入
		boolean Boolean1 = false;
		// 変数に値を代入
		Boolean1 = true;


		// 問4:コンソール出力

		//変数同士で演算をするために型を統一
		// バイト型を倍精度浮動小数点数型に変換
		double Double2 = (double)Byte1;
		// 短整数型を倍精度浮動小数点数型に変換
		double Double3 = (double)Short1;
		// 整数型を倍精度浮動小数点数型に変換
		double Double4 = (double)Int1;
		// 長整数型を倍精度浮動小数点数型に変換
		double Double5 = (double)Long1;
		// 単精度浮動小数点数型を倍精度浮動小数点数型に変換
		double Double6 = (double)Float1;


		// 11110を出力
		// 演算で11110の値を出す
		double result1 = Double2 + Double3 + Double4 + Double5;
		
		// 結果を出力
		System.out.println(+ Math.round(result1) + "\n");


		// 20を出力
		// 演算で20の値を出す
		double result2 = Double1 + Double6;
		
		// 結果を出力
		System.out.println(+ Math.round(result2) + "\n");


		// aハローtrueを出力
		// 文字型と文字列型とブーリアン型を空白を開けて並べる
		String result3 = Char1 + " " + String1 + " "  + (Boolean1 ? "True" : "False");
		
		// 結果を出力
		System.out.println(result3 + "\n");


		// 11130を出力
		// 数字をすべて足す
		double result4 = Double1 + Double2 + Double3 + Double4 + Double5 + Double6;
		
		// 結果を出力
		System.out.println(+ Math.round(result4) + "\n");


		// 10000000000を出力
		// 小数点以外の数字を全てかける
		double result5 = Math.round(Double6) * Double2 * Double3 * Double4 * Double5;
		
		// 結果を出力
		System.out.println(+ Math.round(result5) + "\n");


		// 0.105を出力
		// 10.5割る100をする
		double result6 = Double1 / Double3;
		
		// 結果を出力
		System.out.println(+ (result6) + "\n");


		// -90を出力
		// 10引く100をする
		double result7 = Double2 - Double3;
		
		// 結果を出力
		System.out.println(+ Math.round(result7) + "\n");


		// 問5:ハローJAVA43と出力させるように修正
		String num = "20";
		int num1 = 23;
		// Stringをintに変換
		int num2 = Integer.parseInt(num);
		
		// intに変換された値を足した結果を出力
		System.out.println("ハローJAVA" + (num1 + num2) + "\n");


		// 問6:フォーマットに代入しコンソールに出力
		// 文字列型のローカル変数"name"を宣言
		String name;
		// nameに値"山田太郎"を代入
		name = "山田太郎";

		// 整数型のローカル変数"age"を宣言
		int age;
		// ageに値"18"を代入
		age = 18;

		// 倍精度浮動小数点型のローカル変数"height"を宣言
		double height;
		// heightに値"170.5"を代入
		height = 170.5;

		// 倍精度浮動小数点型のローカル変数"weight"を変数
		double weight;
		// weightに値"62.2"に値を代入
		weight = 62.2;

		// 文字列型のローカル変数"favoriteFood"を宣言
		String favoriteFood;
		// favoriteFoodに値"寿司"を代入
		favoriteFood = "寿司";

		// フォーマットに埋め込んで出力
		System.out.println("初めまして" + name + "です" // 初めまして○○です
				+ "\n" + "年齢は" + age + "です" // 年齢は○○です
				+ "\n" + "身長は" + height + "です" // 身長は○○です
				+ "\n" + "体重は" + weight + "kgです" // 体重は○○です
				+ "\n" + "好きな食べ物は" + favoriteFood + "です"); // 好きな食べ物は○○です


		// 問7:BMIを出力
		// BMIの値"身長(m)²÷体重"を計算
		//heightの値を100で割ってM二乗する
		double bmi = weight / Math.pow(height/100,2);
		
		// BMIの値を小数点第二位以下を四捨五入して結果を出力
		System.out.println("\n" + "BMIは" + ((double)Math.round(bmi*10))/10 + "です" + "\n");


		// 問8:再代入
		// 値"鈴木一郎"を再代入
		name = "鈴木一郎";
		// 値"24"を再代入
		age = 24;
		// 値"168.5"を再代入
		height = 168.5;
		// 値"64.2"を再代入
		weight  = 64.2;
		// 値"オムライス"を再代入
		favoriteFood = "オムライス";

		// 再代入した結果を出力
		System.out.println("初めまして" + name + "です"
				+ "\n" + "年齢は" + age + "です"
				+ "\n" + "身長は" + height + "です"
				+ "\n" + "体重は" + weight + "kgです"
				+ "\n" + "好きな食べ物は" + favoriteFood + "です");
		// 再代入した値からBMIを計算
		double bmi2 = weight / Math.pow(height/100,2);
		
		// 再代入した値から計算されたBMIの結果を出力
		System.out.println("BMIは" + ((double)Math.round(bmi2*10))/10 + "です" + "\n");


		// 問9:和算で自己代入
		// 変数"age"に和算で自己代入
		age = age*2;
		// 変数"height"に和算で自己代入
		height = height*2;
		// 変数"weight"に和算で自己代入
		weight = weight*2;

		//自己代入された値で結果を出力
		System.out.println("初めまして" + name + "です"
				+ "\n" + "年齢は" + age + "です"
				+ "\n" + "身長は" + height + "です"
				+ "\n" + "体重は" + weight + "kgです"
				+ "\n" + "好きな食べ物は" + favoriteFood + "です");

		// 自己代入された値からBMIを計算
		double bmi3 = weight / Math.pow(height/100,2);
		
		// 自己代入された値から計算されたBMIの結果を出力
		System.out.println("BMIは" + ((double)Math.round(bmi3*100))/100 + "です" + "\n");


		// 問10:25歳以上でtrueを返す

		//問9で和算で自己代入された値を元に戻す
		// 値"24"を再代入
		age = 24;
		// 値"168.5"を再代入
		height = 168.5;
		// 値"64.2"を再代入
		weight  = 64.2;

		// 三項演算子で"age"の値が25以上の場合の返り値をtrueに
		String result8 = age >= 25 ? "true" : "false";
		
		// 結果を出力
		System.out.println(result8 + "\n");


		// 問11:年齢身長体重を文字列型に変換して繋げて出力
		// "age"を整数型から文字列型に変換
		String ageSt = String.valueOf(age);
		// "height"を倍精度浮動小数点型から文字列型に変換
		String heightSt = String.valueOf(height);
		// "weight"を倍精度浮動小数点型から文字列型に変換
		String weightSt = String.valueOf(weight);

		// 文字列型に変換された3つの値を繋げ結果を出力
		System.out.println(ageSt + heightSt + weightSt + "\n");


		// 問12:11で変換した年齢身長を整数型に変換して出力
		// 文字列型から倍精度浮動小数点型に変換し小数点以下を切り捨て
		double ageDo = Double.parseDouble(ageSt);
		// 整数型に変換
		int ageIn = (int) ageDo;

		// 文字列型から倍精度浮動小数点型に変換し小数点以下を切り捨て
		double heightDo = Double.parseDouble(heightSt);
		// 整数型に変換
		int heightIn = (int) heightDo;

		// 結果を出力
		System.out.println(ageIn + heightIn + "\n");


		// 問13:年齢が25もしくは身長が160以上でtrueを返す
		// 三項演算子で年齢が25もしくは身長が160以上でtrueを返す
		String result9 = age >= 25 || height >= 160 ? "true" : "false";
		
		// 結果を出力
		System.out.println(result9);

	}

}
