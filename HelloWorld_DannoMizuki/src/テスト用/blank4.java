package テスト用;

import java.util.Scanner;

public class blank4 {
	public static void main(String[] args) {

		// 人数入力を求める初期文
		System.out.print("生徒の人数を入力してください（2以上）：");

		// コンソール入力を受け付ける
		Scanner UserInput = new Scanner(System.in);

		// 扱われる教科
		String[] SubjectArray = { "英語", "数学", "理科", "社会"};	

		// int型の入力を受け取れるようにする
		int N = UserInput.nextInt();


		if (N >= 1 && N <= 5) {

		
			for (int i = 1; i <= N; i++) {

				for (String Subject : SubjectArray) {

					String Message = i + "人目の『" + Subject + "』の点数を入力してください:";

					System.out.print(Message);
					
					switch(Subject){

					case "英語":
						int EngScore = UserInput.nextInt();

					case "数学":
						int MathScore = UserInput.nextInt();

					case "理科":
						int SciScore = UserInput.nextInt();

					case "社会":
						int SocScore = UserInput.nextInt();

					}

					String input2 = UserInput.nextLine();

				}

				System.out.println("\n");
			}


		} else if (N >= 5) {
			System.out.println("値が大きすぎます");

		} else {
			System.out.println("無効な数値です");
		}



		// int PersonalAverage = 

		// int SbjectAvarage =


	}

}

