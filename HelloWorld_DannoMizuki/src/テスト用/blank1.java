package テスト用;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class blank1 {
	public static void main(String[] args) {

		// 商品一覧表のタイトル
		String title = ("\033[44m商品一覧　　\033[0m");

		// 商品一覧表の品目
		String items = ("\033[46mパソコン　　" + "\n" + "冷蔵庫　　　"  + "\n" + "扇風機　　　" + "\n" + "洗濯機　　　" + "\n" + "加湿器　　　" + "\n" + "テレビ　　　" + "\n" + "ディスプレイ\033[0m" + "\n");

		// タイトル出力
		System.out.println(title);

		// 品目出力
		System.out.println(items);


		// コンソールに文字を入力できるようにする
		Scanner UserInput = new Scanner(System.in);

		// 乱数を扱えるようにする
		Random random = new Random();

		
			// 入力を何度でも受け付ける
			while(true) {

				// 入力された文字列を読み取る
				String ProductName = UserInput.nextLine();

				// 入力された文字列をカンマで区切るようにする
				String[] WordsArray = ProductName.split("、");

				// 入力された単語の重複を削除
				Set<String> Products = new HashSet<>(Arrays.asList(WordsArray));

				// ディスプレイと同一商品とするためテレビに固有の乱数を割り当てる
				int Quantity2 = random.nextInt(12);

				// ディスプレイの数はテレビの数からさらに乱数を引いた数とする
				int Quantity3 = random.nextInt(Quantity2 + 1);


				// 入力された商品を拡張for文を使ってランダムな残数を出力
				for (String Product : Products) {

					// 商品の残数の表示を条件に応じて分岐させる
					int Quantity = switch (Product) {

					// 0～11の乱数を個数に指定
					case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器" -> (int) (Math.random() * 12);

					// テレビ用の乱数を指定
					case "テレビ" -> Quantity2;

					// ディスプレイ用の乱数を指定
					case "ディスプレイ" -> Quantity3;

					// その他の商品は存在しないため在庫数を-1と設定しておく
					default -> -1;
					};

					// 指定の商品とその他の商品を判定し分岐させ数値を割り当てる
					int number = (Quantity > -1) ? 1 : 2 ;

					// 存在する商品の数の文章に割り当てられた変数
					String Message1 = Product + "の残り台数は" + Quantity + "台です" + "\n";

					// 存在しない商品の数の文章に割り当てられた変数
					String Message2 = "『" + Product + "』は指定の商品ではありません" + "\n";


					// どちらのメッセージを表示させるか分岐
					switch(number) {

					// 指定の商品の場合
					case 1 :

						// メッセージを出力
						System.out.println(Message1);

						// プログラム終了
						break;

						// その他の商品の場合
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



