package curriculum_B;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Qes6 {

	public static void main(String[] args) {
		
		// 商品名を入力
		System.out.println("商品名を入力してください");

		// コンソールに文字を入力できるようにする
		Scanner UserInput = new Scanner(System.in);

		// 乱数を扱えるようにする
		Random random = new Random();


		// 入力を何度でも受け付ける
		while(true) {	

			// 入力された文字列を読み取る
			String ProductName = UserInput.nextLine();

			// 入力された文字列をカンマで区切る
			String[] WordsArray = ProductName.split("、");

			// 入力された単語の重複を削除
			Set<String> Products = new HashSet<>(Arrays.asList(WordsArray));


			// 0～11の乱数を個数を表す変数に代入
			int Quantity1 = random.nextInt(12);

			// ディスプレイと同一商品とするためテレビに固有の乱数を割り当てる
			int Quantity2 = random.nextInt(12);

			// ディスプレイの数はテレビの数からさらに乱数を引いた数とする
			int Quantity3 = random.nextInt(Quantity2 + 1);


			// 入力された商品を拡張for文で処理
			for (String Product : Products) {

				// 商品の残数を条件に応じて分岐させる
				int Quantity = switch (Product) {

				// 0～11の乱数を個数に指定
				case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器" -> Quantity1;

				// テレビ用の乱数を指定
				case "テレビ" -> Quantity2;

				// ディスプレイ用の乱数を指定
				case "ディスプレイ" -> Quantity3;

				// その他の商品は存在しないため在庫数を-1と設定しておく
				default -> -1;
				};


				// 存在する商品と存在しない商品を判定し条件演算子で分岐
				int number = (Quantity > -1) ? 1 : 2 ;

				// 存在する商品の数の文章に割り当てられた変数
				String Message1 = Product + "の残り台数は" + Quantity + "台です" + "\n";

				// 存在しない商品の数の文章に割り当てられた変数
				String Message2 = "『" + Product + "』は指定の商品ではありません" + "\n";



				// どちらのメッセージを表示させるか分岐
				switch(number) {

				// 存在する商品の場合
				case 1 :

					// メッセージを出力
					System.out.println(Message1);

					// プログラム終了
					break;
					
					// 存在しない商品存在の場合
				case 2 :

					// メッセージを出力
					System.out.println(Message2);

					// プログラム終了
					break;
					
				}

			}

		}

	}

}

