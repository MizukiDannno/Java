package テスト用;

import java.util.Scanner;

public class blank2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int チン長 = scanner.nextInt();

		System.out.println("お前のチン長は" + チン長 + "cmだ");

			if (チン長 >= 13 && チン長 <=17 ) {
				System.out.println("フランクフルトだな");
			} else if (チン長 >= 8 && チン長 <=13 ) {
				System.out.println("シャウエッセンだな");
			} else if (チン長 >= 17) {
				System.out.println("ジャンボフランクだな！");
			} else if (チン長 <= 8 ) {
				System.out.println("ポークビッツだな");
			} else {
				System.out.println("チン長を測って出直し給え");
			}
		}
	}
