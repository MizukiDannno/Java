package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		// Dogクラスを呼び出す
		Dog dogName = new Dog("犬");
		
		// 出力
		System.out.println("動物の名前:" + dogName.animalName);


		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// Dogクラスを呼び出す
		Dog dogCount = new Dog(2);

		// 出力
		System.out.println("動物の数:" + dogCount.animalCount);


		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 日付を取得する変数
		Date currentDate = new Date();

		// 取得する日付のパターンを指定
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// 日付をフォーマットして出力
		System.out.println(dateFormat.format(currentDate));

	}

}

