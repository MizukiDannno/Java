package java1_30;

public class Main {
	  public static void main(String[] args) {
		    Person person1 = new Person("鈴木太郎", 20, 1.7,60);
		   
		    // 名前、年、BMIを出力
		    System.out.println(person1.name);
		    System.out.println(person1.age);
		    System.out.println(person1.height);
		    
			// 合計人数を出力
			Person.printCount();
		  }
}
