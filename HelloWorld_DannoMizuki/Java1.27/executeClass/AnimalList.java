package executeClass;

import java.util.Scanner;

import processClass.AnimalStatus;

/*

コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

コンソール出力結果

コンソールに文字を入力してください
動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明

 */

public class AnimalList {

	public static void main(String[] args) {

		// 入力を受け取る
		Scanner scanner = new Scanner(System.in);
		System.out.print("コンソールに文字を入力してください\n");
		String input = scanner.nextLine();

		// 入力された文字列を","で分割
		String[] animalInfoArray = input.split(",");


		// 動物の配列を作成
		AnimalStatus[] animals = new AnimalStatus[animalInfoArray.length];

			// 各動物の情報を取得して動物の配列に格納
			for (int i = 0; i < animalInfoArray.length; i++) {
				String[] animalInfo = animalInfoArray[i].split(":");
				String name = animalInfo[0];
				double bodyLength = Double.parseDouble(animalInfo[1]);
				double speed = Double.parseDouble(animalInfo[2]);

				// 学名を設定
				String scientificName = getScientificName(name);

				// Animalオブジェクトを作成して配列に格納
				animals[i] = new AnimalStatus(name, scientificName, bodyLength, speed);
			}

			// 入力された動物の情報を出力
			for (AnimalStatus animal : animals) {
				System.out.println("\n動物名: " + animal.getAnimalName());
				System.out.println("体長: " + animal.getAnimalSize());
				System.out.println("速度: " + animal.getAnimalSpeed());
				System.out.println("学名: " + animal.getScientificName());
			}

		// Scannerを閉じる
		scanner.close();
	}


	// 動物名に応じて学名を取得
	private static String getScientificName(String animalName) {
		switch (animalName) {
		case "ライオン":
			return "パンテラ・レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロボダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";
		default:
			return "不明";
		}
	}
}


