package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{


	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// 引数に文字列型と整数型を指定
	public static void Q1(String message, int num){

		// 出力
		System.out.println(message + " " + num + "\n");
	}


	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// 引数に二つの整数を指定
	public static void Q2(int num1, int num2) {

		// 値同士を乗算
		int result = (num1 * num2);

		// 出力
		System.out.println(result + "\n");
	}


	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// 引数に整数の配列を指定
	public static void Q3(int[] array) {

		// 整数の配列分繰り返す
		for (int num : array) {

			// 出力
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// 引数に少数二つを指定しオーバーロード
	public static void Q4(double num1, double num2){

		// 引数同士を和算
		double result = (num1 + num2);

		// 出力
		System.out.println(result + "\n");
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// 引数に整数の配列を指定
	public static int[] Q5(int count){

		// 乱数を格納する配列を作成
		int[] RandomNumbers =new int[count];

		// 乱数を使えるようにする
		Random random = new Random();

		// 引数の回数分処理を実行
		for(int i = 0; i < count; i++){

			// 乱数を格納
			RandomNumbers[i] = random.nextInt(100) + 1;

			// 出力(改行無しで順番に)
			System.out.print(RandomNumbers[i] + " ");
		}
		// 改行
		System.out.println("\n");

		// 格納した値を返す
		return RandomNumbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// 引数にQ5で作成したメソッドの返り値を指定
	public static double Q6(int[] array) {

		// 平均値算出用の合計値を初期化
		int sum = 0;

		// 配列の値の分だけループ
		for(int value : array){

			// 配列内の値を合計値に加算
			sum += value;
		}

		// 平均値を算出
		double average = (double) sum / array.length;

		// 出力
		System.out.println(average + "\n");

		// 平均値を返す
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// 引数のQ6で作成したメソッドの返り値を指定
	public static void Q7(double average){

		// 平均値が50以上か判定
		boolean isAbove50 = average >= 50;

		// 出力
		System.out.println(isAbove50);
	}


	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1
		Q1("HelloJavaSE",11);

		// Q2(整数2つを渡す)
		Q2(2, 3);

		// Q3(整数の配列)
		int[] intArray = {1, 2, 3, 4, 5};
		Q3(intArray);

		// Q4(小数二つを渡す)
		Q4(2.2, 3.3);

		// Q5(乱数が格納された整数の配列)
		int[] RandomNumbers = Q5(5);

		// Q6(Q5の返り値を受け取る)
		double average = Q6(RandomNumbers);

		// Q7(Q6の返り値を受け取る)
		Q7(average);

	}

}

