package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {

		// 掛け算の前項"x"を1から9までの範囲で指定
		for (int x = 01; x <= 9; x++) {

			// 掛け算の後項"y"を1から9まで出指定
			for (int y = 01; y <= 9; y++) {

				// 前項と後項を掛け合わせる
				int result = x * y;

				// 2桁にして桁が足りない分は先頭から0で埋めて出力
				System.out.printf("%02d * %02d = %02d", x, y, result);

				// 行の最前列と最後尾を除く各式の間に||を挟む
				if (y < 9) {

					// ||を出力
					System.out.print(" || ");
				}
			}

			// 次の段へ移る前に改行を挟む
			System.out.println("\n");
		}
	}
}
