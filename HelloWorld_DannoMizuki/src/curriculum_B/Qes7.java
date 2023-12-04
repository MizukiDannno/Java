package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {


		// 扱われる教科
		String[] SubjectArray = {"英語", "数学", "理科", "社会"};

		// 各教科の点数
		double[][] ScoreArray = new double[4][100]; // 2次元配列に変更

		// 各教科のN人分の合計点
		double[] TotalArray = new double[4];

		// 各教科の平均点
		double[] AverageArray = new double[4];

		// 個人の平均点と各教科の平均点と全体の平均点
		double PersonalAverage, TotalAverage;

		// 人数
		int N;

		// コンソール入力を受け付ける
		Scanner UserInput = new Scanner(System.in);

		// 繰り返しフラグ
		boolean repeatProcess;


		// 繰り返し
		do {

			// 人数入力を求める初期文
			System.out.print("生徒の人数を入力してください（2以上）：");

			// 繰り返し
			do {

				// 人数を表すint型の入力を受け取れるようにする
				N = UserInput.nextInt();

				// 2以下の数値が入力された場合
				if (N < 2) {

					// 無効な値を示すメッセージ
					System.out.println("無効な数値です。");

				}

				// 繰り返す
			} while (N < 2);

			// 生徒番号
			int i = 1;

			// 繰り返し
			do {

				// 科目数の分の処理
				for (int y = 0; y < SubjectArray.length; y++) {

					// 教科の配列から教科を指定
					String subject = SubjectArray[y];

					// 点数の入力を求める文章
					System.out.print("\n" + i + "人目の" + subject + "の点数を入力してください:");

					// 点数の入力を受け付ける
					ScoreArray[y][i - 1] = UserInput.nextDouble();

				}

				// 改行
				System.out.println("\n");

				// 次の生徒へ
				i++;

				// 繰り返し	
			} while (i <= N);

			// 各生徒の平均点を計算
			for (int j = 0; j < N; j++) {

				// 個人平均点の初期値
				PersonalAverage = 0;

				// 全科目分の値を計算に組む
				for (int y = 0; y < SubjectArray.length; y++) {

					// 個人平均点の算出のために全科目の点数を加算
					PersonalAverage += ScoreArray[y][j];
				}

				// 科目数で割って個人平均点を計算
				PersonalAverage /= SubjectArray.length;

				// 個人の平均点を出力
				System.out.println("\n" + (j + 1) + "人目の平均点は" + PersonalAverage + "点です");
			}

			// 各教科の合計点を初期化
			for (int y = 0; y < SubjectArray.length; y++) {

				// 教科の合計点を算出
				TotalArray[y] = 0;
			}

			// 各教科の合計点を計算
			for (int y = 0; y < SubjectArray.length; y++) {

				// 生徒の人数分だけ計算に組む
				for (int j = 0; j < N; j++) {

					// 教科の合計点を算出
					TotalArray[y] += ScoreArray[y][j];
				}
			}

			// 各教科の平均点を計算
			for (int y = 0; y < SubjectArray.length; y++) {

				// 合計点を人数で割って平均点を算出
				AverageArray[y] = TotalArray[y] / N;
			}

			// 改行
			System.out.println("\n");

			// 教科数分の平均点を算出
			for (int y = 0; y < SubjectArray.length; y++) {

				// 各教科の平均点を出力
				System.out.println("\n" + SubjectArray[y] + "の平均点は" + AverageArray[y] + "です。");
			}

			// 全体の平均点の初期値
			TotalAverage = 0;

			// 全体の平均点を計算
			for (int y = 0; y < SubjectArray.length; y++) {

				// 平均点を加算
				TotalAverage += AverageArray[y];
			}

			// 合計点を科目数で割って全体の平均点を算出
			TotalAverage /= SubjectArray.length;

			// 全体の平均点を表示
			System.out.println("\n" + "全体の平均点は" + TotalAverage + "です。");

			// プロセスを繰り返すか確認
			System.out.print("\n" + "「continue」でもう一度実行します。：");

			// continueと入力された際に繰り返し
			repeatProcess = UserInput.next().equals("continue");

			// 繰り返し
		} while (repeatProcess);

		
		// scannerを閉じる
		UserInput.close();
		
	}

}
