package テスト用;

public class blank5 {

	public class Curriculum_New_1_18{
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

		public static void Q1(String message, int num){
			System.out.println(message + " " + num);
		}


		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

		public static void Q2(int num1, int num2) {
			int result = (num1 * num2);
			System.out.println(result);
		}


		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

		public static void Q3(int num3, int num4) {
			System.out.println(num3 + " " + num4);
		}

		
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

		public static void Q4(double num1, double num2){
			double result = (num1 + num2);
			System.out.println(result);
		}




		public static void main(String[] args) {
			// 作成したメソッドをここで呼び出してください

			// Q1
			Q1("HelloJavaSE",11);

			// Q2
			Q2(2, 3);

			// Q3
			Q3(2, 3);

			// Q4
			Q4(2.2, 3.3);

			//Q5


		}
	}

}