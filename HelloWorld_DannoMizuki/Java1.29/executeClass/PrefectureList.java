/*

 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"

 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください

   	例:
   	8,5,9,.....
   	と入力された場合（昇順）

   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2

   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

 */


package executeClass;

import java.util.Scanner;

import processClass.Prefecture;

public class PrefectureList {

	public static void main(String[] args) {

		// 県の情報を格納する配列を作成
		String[] prefectureData = {
				"北海道:札幌市:83424",
				"青森県:青森市:9646",
				"岩手県:盛岡市:15275",
				"宮城県:仙台市:7282",
				"秋田県:秋田市:11638",
				"山形県:山形市:9323",
				"福島県:福島市:13784",
				"茨城県:水戸市:6097",
				"栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362",
				"埼玉県:さいたま市:3798"
		};

		// Prefectureクラスのインスタンスを格納する配列を作成
		Prefecture[] prefectures = new Prefecture[prefectureData.length];


		// 県の情報をPrefectureクラスのインスタンスに変換して配列に格納
		for (int i = 0; i < prefectureData.length; i++) {
			String[] info = prefectureData[i].split(":");
			String name = info[0];
			String capital = info[1];
			double area = Integer.parseInt(info[2]);
			prefectures[i] = new Prefecture(name, capital, area, i);
		}


		// コンソールから入力を受け取る
		Scanner scanner = new Scanner(System.in);
		System.out.print("番号を入力してください: ");
		String inputNumbers = scanner.nextLine();
		String[] inputArray = inputNumbers.split(",");


		// 選択された都道府県番号を格納
		int[] selectedNumbers = new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			selectedNumbers[i] = Integer.parseInt(inputArray[i].trim());
		}


		// バブルソートで昇順にソート
		for (int i = 0; i < selectedNumbers.length - 1; i++) {
			// 未ソート箇所の末尾から比較を繰り返す
			for (int j = 0; j < selectedNumbers.length - i - 1; j++) {
				// 隣接する2つの要素を比較、前の要素が大きい場合は入れ替える
				if (selectedNumbers[j] > selectedNumbers[j + 1]) {
					// 入れ替え
					int temp = selectedNumbers[j];
					selectedNumbers[j] = selectedNumbers[j + 1];
					selectedNumbers[j + 1] = temp;
				}
			}
		}


		// 選択した都道府県の情報を表示
		for (int selectedNumber : selectedNumbers) {
			Prefecture selectedPrefecture = prefectures[selectedNumber];
			displayPrefectureInfo(selectedPrefecture);
		}

		// Scannerをクローズ
		scanner.close();
	}


	// 配列の内容を表示
	public static void displayPrefectureInfo(Prefecture prefecture) {
		System.out.println("\n都道府県名: " + prefecture.getPrefectureName());
		System.out.println("県庁所在地: " + prefecture.getCapital());
		System.out.println("面積: " + prefecture.getArea() + "km2");
	}
}
