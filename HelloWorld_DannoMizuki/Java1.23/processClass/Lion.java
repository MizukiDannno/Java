package processClass;

public class Lion {

	// フィールド変数
	public String animalName;
	public double animalSize;
	public int animalSpeed;


	// コンストラクタを作成
	public Lion(String animalName, double animalSize, int animalSpeed) {

		// Nullチェック
		if (animalName == null ) {
			// Nullが発生した場合に処理を止める
			throw new IllegalArgumentException("引数にnullが含まれています");
		}


		// 変数にthisを使う
		this.animalName = animalName;
		this.animalSize = animalSize;
		this.animalSpeed = animalSpeed;
	}

	// 動物名のゲッター
	public String getAnimalName() {
		return animalName;
	}

	// 動物名のセッター
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	// 体長のセッター
	public double getAnimalSize() {
		return animalSize;
	}

	// 体長のゲッター
	public void setAnimalSize(double animalSize) {
		this.animalSize = animalSize;
	}


	// 速度のゲッター
	public int getAnimalSpeed() {
		return animalSpeed;
	}

	// 速度のセッター
	public void setAnimalSpeed(int animalSpeed) {
		this.animalSpeed = animalSpeed;
	}

}
