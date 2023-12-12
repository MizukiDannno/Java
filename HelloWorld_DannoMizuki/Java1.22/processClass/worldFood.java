package processClass;

// 処理用
public class worldFood {

		// フィールド変数
		public String country;
		public String food;
		public String foodGenre;


		// コンストラクタを作成
		public worldFood(String country, String food, String foodGenre) {
			
			// Nullチェック
	        if (country == null || food == null || foodGenre == null) {
	        	// Nullが発生した場合に処理を止める
	            throw new IllegalArgumentException("引数にnullが含まれています");
	        }

			// 変数にthisを使う
			this.country = country;
			this.food = food;
			this.foodGenre = foodGenre;

		}

	}

