package processClass;

public class Prefecture {

	// 変数を宣言
	private String prefectureName;
	private String capital;
	private double area;
	private int prefectureNumber;


	// コンストラクタ
	public Prefecture(String prefectureName, String capital, double area, int prefectureNumber) {
		// NUllチェック
		if (prefectureName == null || capital == null) {
			throw new IllegalArgumentException("引数にnullが含まれています");
		}

		setPrefectureName(prefectureName);
		setCapital(capital);
		setArea(area);
		setPrefectureNumber(prefectureNumber);
	}



	// ゲッター
	public String getPrefectureName() {
		return prefectureName;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

	public int getPrefectureNumber() {
		return prefectureNumber;
	}


	// セッター
	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPrefectureNumber(int prefectureNumber) {
		this.prefectureNumber = prefectureNumber;
	}

}
