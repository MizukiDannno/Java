package executeClass;

import processClass.Lion;

/*

	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください

	動物名：ライオン
体長：2.1m
速度：80km/h

 */

public class Animal {

	public static void main(String[] args) {
		
        // Lionオブジェクトを作成
        Lion lion = new Lion();
        
        lion.setAnimalName("ライオン");
        lion.setAnimalSize(2.1);
        lion.setAnimalSpeed(80);

        // コンソールに出力
        System.out.println("動物名：" + lion.getAnimalName());
        System.out.println("体長：" + lion.getAnimalSize() + "m");
        System.out.println("速度：" + lion.getAnimalSpeed() + "km/h");
        
	}
}
