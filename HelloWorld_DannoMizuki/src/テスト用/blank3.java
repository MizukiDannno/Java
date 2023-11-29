package テスト用;

import java.util.Scanner;

public class blank3 {
	public static void main(String[] args) {

		// 人数入力を求める初期文
		System.out.print("生徒の人数を入力してください（2以上）：");

		// コンソール入力を受け付ける
		Scanner UserInput = new Scanner(System.in);


		while(true){

			// 入力を受け取れるようにする
			String input = UserInput.nextLine();


			if (isInt(input)) {

				int N = Integer.parseInt(input);

				if (N >= 1 && N <= 10) {

					for (int i = 1; i <= N; i++) {

						if (isDouble(input)) {

							double EngTotal = 0;

							double MathTotal = 0;

							double SciTotal = 0;

							double SocTotal = 0;

							System.out.println(i + "人目の『英語』の点数を入力してください:");

							double EngScore = UserInput.nextDouble();

							EngTotal += EngScore;

							System.out.println(i + "人目の『数学』の点数を入力してください:");

							double MathScore = UserInput.nextDouble();

							MathTotal += MathScore;

							System.out.println(i + "人目の『理科』の点数を入力してください:");

							double SciScore = UserInput.nextDouble();

							SciTotal += SciScore; 

							System.out.println(i + "人目の『社会』の点数を入力してください:");

							double SocScore = UserInput.nextDouble();

							SocTotal += SocScore;

							System.out.println(EngScore + MathScore + SciScore + SocScore);


							double PersonalAverage = (EngScore + MathScore + SciScore + SocScore) / 4;

							System.out.println(i + "人目の平均点は" + PersonalAverage + "点です。" + "\n");

							double EngAverage = EngTotal / i;

							System.out.println("英語の平均点は" + EngTotal + "です。");

							double MathAverage = MathTotal / i;


							System.out.println("数学の平均点は" + MathTotal + "です。");

							double SciAverage = SciTotal / i;


							System.out.println("理科の平均点は" + SciTotal + "です。");

							double SocAverage = SocTotal / i;

							System.out.println("社会の平均点は" + SocTotal + "です。");


							double TotalAverage = EngAverage + MathAverage + SciAverage + SocAverage;

							System.out.println("全体の平均点は" + TotalAverage + "です。");

						}

					}

				} else if (N >= 11) {
					System.out.println("値が大きすぎます");
					continue;

				} else {
					System.out.println("無効な数値です");
					continue;
				}

			} else {
				System.out.println("無効な数値です");
				continue;
			}


		}

	}



	// 文字列がintかどうかを判定するメソッド
	private static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}


	// 文字列がdoubleかどうかを判定するメソッド
	private static boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
