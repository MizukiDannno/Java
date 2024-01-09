package java1_30;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7,60);

		// printメソッドを呼び出し名前、年、BMIを出力		    
		person1.print();

		// 合計人数を出力
		System.out.println("合計" + Person.count() + "人です");
	}
}
