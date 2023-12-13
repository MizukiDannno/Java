package processClass;

public class Lion {

	// フィールド変数
	public String animalName;
	public double animalSize;
	public int animalSpeed;


	// 戻り値無しでコンストラクタを定義
	public Lion() {
		// デフォルト値を設定
		this.animalName = "Unknown";
		this.animalSize = 0.0;
		this.animalSpeed = 0;
	}


	// 動物名のゲッター
	public String getAnimalName() {
		return this.animalName;
	}

	// 動物名のセッター
	public void setAnimalName(String lionName) {
		this.animalName = lionName;
	}


	// 体長のセッター
	public double getAnimalSize() {
		return this.animalSize;
	}

	// 体長のゲッター
	public void setAnimalSize(double lionSize) {
		this.animalSize = lionSize;
	}


	// 速度のゲッター
	public int getAnimalSpeed() {
		return this.animalSpeed;
	}

	// 速度のセッター
	public void setAnimalSpeed(int lionSpeed) {
		this.animalSpeed = lionSpeed;
	}

}
