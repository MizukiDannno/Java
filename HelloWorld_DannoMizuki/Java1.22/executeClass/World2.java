package executeClass;
	
	import java.text.SimpleDateFormat;
import java.util.Date;

import processClass.worldFood;

	// 実行用(Nullチェック検証ver.)
	public class World2 {

		public static void main(String[] args) {

			// 呼び出し(Nullを入れてNullチェックの動作を検証)
			worldFood Japan = new worldFood("日本", "寿司", null);

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

