package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		// 問1、問2：入力チェックシステムの実装

		// コンソールに文字を入力できるようにする
		Scanner UserInput = new Scanner(System.in);

		// 乱数を扱えるようにする
		Random random = new Random();

		// 正常な文字列が入力されるまで入力を受け付ける
		while(true) {

			// 入力された文字列を読み取る
			String UserName = UserInput.nextLine();

			// 入力された文字列が10文字以上か判定
			if (UserName.length() > 10) {

				// 10文字以上だった場合に表示される文章
				System.out.println("名前を10文字以下にしてください" + "\n");

				// 入力された文字列が0文字もしくはnullか判定(空白は文字数に含まず)
			} else if (UserName == null || UserName.trim().isEmpty()) {

				// 入力された文字列が0文字もしくはnullだった場合に表示される文章
				System.out.println("名前を入力してください" + "\n");

				// 入力された文字列が半角英数字か判定
			} else if (!UserName.matches("[a-zA-Z0-9]+")) {

				// 入力された文字列が半角英数字以外だった場合に表示される文章
				System.out.println("半角英数字のみで名前を入力してください" + "\n");

				// 上記以外の正常な文字列
			} else {

				// 正常なユーザー名が登録されるときに出力される文章
				System.out.println("\n" + "ユーザー名" + UserName + "を登録しました" + "\n");


				// 問3：じゃんけんゲームの実装


				// プレイヤーの勝利回数の初期値として0を代入
				int UserWins = 0;

				// 勝負回数の初期値として0を代入
				int TotalGames = 0;

				// ユーザーが勝つまでゲームループ
				while (UserWins == 0) {

					// プレイヤーの手の変数を宣言
					int UserHand = UserInput.nextInt();
					
					// ユーザー名表示
					System.out.println("\n" + "ユーザー名" + UserName + "を登録しました" + "\n");

					// 0、1、2以外の数値を無効とする
					if (UserHand < 0 || UserHand > 2) {

						// 無効な数値が入力されたため先頭に戻る
						continue;
					}

					// コンピュータの手の値として0以上3未満で乱数の範囲を指定
					int ComputerHand = random.nextInt(3);

					// プレイヤーが何を出したか出力
					System.out.println(UserName + "の手は「" + HandName(UserHand) + "」" + "\n");

					// コンピュータが何を出したか出力
					System.out.println("相手の手は「" + HandName(ComputerHand) + "」" + "\n");

					// 勝者を決定する変数を呼び出す
					String result = Winner(UserHand, ComputerHand);


					// あいこだった場合
					if (result.equals("Tie")) {

						// あいこだった時のメッセージ出力
						System.out.println("DRAW　あいこ　もう一回しましょう！" + "\n");

						// ユーザーが勝った時
					} else if (result.equals("Win")) {

						// ユーザーが勝った時のメッセージ出力
						System.out.println("やるやん。" + "\n" + "次は俺にリベンジさせて" + "\n");

						// 勝利回数を一回足す
						UserWins++;

					} else {

						// 負けた時のメッセージ出力（3パターン後述)
						System.out.println(getLosingMessage(UserHand) + "\n");
					}

					// 総勝負回数を一回足す
					TotalGames++;
				}

				// 勝つまでにかかった回数を出力
				System.out.println("勝つまでにかかった合計回数は" + TotalGames + "です");

				// scannerを閉じる
				UserInput.close();

				// ループを抜ける
				break;
			}
		}
	}

	// 勝者を決定する変数
	private static String Winner(int PlayerHand, int ComputerHand) {

		// プレイヤーとコンピュータの値が同じ場合
		if (PlayerHand == ComputerHand) {

			// 返り値はあいこ
			return "Tie";

			// プレイヤーがグーでコンピュータがチョキの場合
		} else if ((PlayerHand == 0 && ComputerHand == 1) ||

				// プレイヤーがチョキでコンピュータがパーの場合
				(PlayerHand == 1 && ComputerHand == 2) ||

				// プレイヤーがパーでコンピュータがグーの場合
				(PlayerHand == 2 && ComputerHand == 0)) {

			// 上記3パターンの返り値は勝ち
			return "Win";

		} else {
			// それ以外のケースは負け
			return "Lose";

		}
	}

	// int型でされた手をString型で文字に起こす
	private static String HandName(int choice) {

		// 条件分岐で値と手の名前を紐付ける
		switch (choice) {

		// 0の場合
		case 0:

			// グーを返す
			return "グー";

			// 1の場合
		case 1:

			// チョキを返す 
			return "チョキ";

			// 2の場合
		case 2:

			// パーを返す
			return "パー";

			// その他の値
		default:

			// 何も返さない
			return "";
		}
	}


	// 負けた時のメッセージを3パターン用意
	private static String getLosingMessage(int UserChoice) {

		// 負け方で分岐させる
		switch (UserChoice) {

		// 相手がパー、自分がグーを出した場合
		case 0:

			//出力されるメッセージ
			return "俺の勝ち！" + "\n" + "なんで負けたか、明日まで考えといてください。" + "\n" + "そしたら何かが見えてくるはずです";

			// 相手がグー、自分がチョキを出した場合
		case 1:

			// 出力されるメッセージ
			return "俺の勝ち！" + "\n" + "負けは次につながるチャンスです！" + "\n" + "ネバーギブアップ！";

			// 相手がチョキ、自分がパーを出した場合
		case 2:

			// 出力されるメッセージ
			return "俺の勝ち！" + "\n" + "たかがじゃんけん、そう思ってないですか？" + "\n" + "それやったら次も、俺が勝ちますよ";

			//その他の場合
		default:

			//何も返さない
			return "";
		}

	}

}

