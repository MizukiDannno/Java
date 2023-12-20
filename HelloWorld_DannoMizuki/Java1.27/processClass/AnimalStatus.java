package processClass;

public class AnimalStatus {

	// 変数を宣言
	private String animalName;
	private String scientificName;
	private double animalSize;
	private double animalSpeed;

	// コンストラクタ
	public AnimalStatus(String animalName, String scientificName, double animalSize, double animalSpeed) {
		// Nullチェック
		if (animalName == null || scientificName == null) {
			throw new IllegalArgumentException("引数にnullが含まれています");
		}

		setAnimalName(animalName);
		setScientificName(scientificName);
		setAnimalSize(animalSize);
		setAnimalSpeed(animalSpeed);
	}


	// ゲッター
	public String getAnimalName() {
		return animalName;
	}

	public String getScientificName() {
		return scientificName;
	}

	public double getAnimalSize() {
		return animalSize;
	}

	public double getAnimalSpeed() {
		return animalSpeed;
	}


	// セッター
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public void setAnimalSize(double animalSize) {
		this.animalSize = animalSize;
	}

	public void setAnimalSpeed(double animalSpeed) {
		this.animalSpeed = animalSpeed;
	}

}

