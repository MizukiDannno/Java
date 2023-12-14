// 処理用クラス
package processClass;

import java.util.Random;

// スーパークラス
public class User {

	// 変数を宣言
	protected String userName;
	protected int hp;
	protected int mp;
	protected int pow;
	protected int agi;
	protected int def;


	// コンストラクタ
	public User(String userName, int hp, int mp, int pow, int agi, int def) {
		// Nullチェック
		if (userName == null) {
			throw new IllegalArgumentException("引数にnullが含まれています");
		}


		// 変数を区別
		this.userName = userName;
		this.hp = hp;
		this.mp = mp;
		this.pow = pow;
		this.agi = agi;
		this.def = def;
	}


	// 名前のゲッター
	public String getUserName() {
		return userName;
	}

	// 名前のセッター
	public void setUserName(String userName) {
		this.userName = userName;
	}


	// HPのゲッター
	public int getHP() {
		return hp;		
	}

	// HPのセッター
	public void setHP(int hp) {
		this.hp = hp;
	}


	// MPのゲッター
	public int getMP() {
		return mp;
	}

	// MPのセッター
	public void setMP(int mp) {
		this.mp = mp;
	}


	// 攻撃力のゲッター
	public int getPow() {
		return pow;
	}

	// 攻撃力のセッター
	public void setPow(int pow) {
		this.pow = pow;
	}


	// 素早さのゲッター
	public int getAgi() {
		return agi;
	}

	// 素早さのセッター
	public void setAgi(int agi) {
		this.agi = agi;
	}


	// 防御力のゲッター
	public int getDef() {
		return def;
	}

	// 防御力のセッター
	public void setDef(int def){
		this.def = def;
	}


	// サブクラス
	public class Character extends User {
		public Character(String userName, int hp, int mp, int pow, int agi, int def) {
			// スーパークラス
			super(userName, hp, mp, pow, agi, def);
		}

		public static User generateRandomUser(String userName) {

			Random rand = new Random();
			int randomHP = rand.nextInt(999) + 1;
			int randomMP = rand.nextInt(999) + 1;
			int randomPow = rand.nextInt(999) + 1;
			int randomAgi = rand.nextInt(999) + 1;
			int randomDef = rand.nextInt(999) + 1;

			return new User(userName, randomHP, randomMP, randomPow, randomAgi, randomDef);

		}

	}

}
