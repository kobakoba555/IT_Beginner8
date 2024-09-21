
public class Monster {

	String name;	//名前
	int hp;			//体力
	int at;			//攻撃力
	int df;			//防御力
	
	//課題8-1
	
	Monster(){
		this.name = "スライム";
		this.hp = 10;
	}
	
	void attack() {//攻撃
		System.out.println(this.name + "の攻撃！");
		System.out.println(this.at + "のダメージ");
	}
	
	void defence() {//防御
		System.out.println(this.name + "は守りを固めた！");
		this.df = this.df + 10;
		System.out.println("防御力が10上がった");
	}
	
	void takeDamage(int damage) {
		this.hp -= damage;
		if(this.hp > 0) {
			System.out.println(this.name + "の残りHP:" + this.hp);
		}else {
			System.out.println(this.name + "は倒れた！");
		}
	}

}
