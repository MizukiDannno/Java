package executeClass;
	
	import java.text.SimpleDateFormat;
import java.util.Date;

import processClass.worldFood;

	/*

	下記がコンソールに出力されるように作成してください

	 こんにちは！ここは日本です！
	 この寿司はうまい
	 寿司は和食です
	 今の現在日時は2023/03/09 10:23:39です

	【条件】
	 ・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	 ・適切なファイルにフィールドで変数を必要な数作ってください。
	 ・thisを使って作成してください。
	 ・日時は今日の日付を取得してください。

	 */

	// 実行用
	public class World {

		public static void main(String[] args) {

			// 呼び出し
			worldFood Japan = new worldFood("日本", "寿司", "和食");

			// 文章を出力
			System.out.println("こんにちは！ここは" + Japan.country + "です！");
			System.out.println("この" + Japan.food + "うまい");
			System.out.println(Japan.food + "は" + Japan.foodGenre + "です");


			// 日付を取得する変数
			Date currentDate = new Date();

			// 取得する日付のパターンを指定
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");

			// 日付をフォーマットして出力
			System.out.println("今の現在日時は" + dateFormat.format(currentDate) + "です");

		}
	}

