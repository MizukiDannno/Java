package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {

		// 掛け算の後項"x"を1～9までの範囲で指定
		for (int x = 1; x <= 9; x++) {
			
			// 掛け算の前項"y"を1～20までの範囲で指定
			for (int y = 1; y <= 20; y++) {
				
				// 前項と後項を掛け合わせる
				int result = y * x;

				// 3桁にして桁が足りない分は先頭から0で埋めて出力
				System.out.printf("%03d * %03d = %03d", y, x, result);

				// 行の最前列と最後尾を除く各式の間に||を挟む
				if (x < 20) {

					// ||を出力
					System.out.print(" || ");
				}
			}

			// 次の段へ移る前に改行を挟む
			System.out.println();
		}
	}
}
