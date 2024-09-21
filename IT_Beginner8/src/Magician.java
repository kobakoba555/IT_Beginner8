
public class Magician {

	String name;	//名前
	int hp;			//体力
	int mp;			//MP
	int at;			//攻撃力
	
	//課題8-1
	
	Magician(){
		this.name = "レベッカ";
		this.hp = 50;
	}
	void attack(Monster monster) {//打撃攻撃
		System.out.println(this.name + "の攻撃！");
		System.out.println(monster.name + "にダメージを" + this.at/2 + "与えた！！");
		monster.takeDamage(this.at/2);
	}
	
	void magicAttack(Monster monster) {//魔法攻撃
		System.out.println(this.name + "はメラを唱えた！");
		System.out.println(monster.name + "にダメージを" + this.at*2 + "与えた！！");
		this.mp = this.mp - 10;
		System.out.println("MP:" + this.mp);
		monster.takeDamage(this.at*2);
	}
	
	void healMagic() {//回復魔法
		System.out.println(this.name + "はホイミを唱えた！");
		this.hp = this.hp + 10;
		this.mp = this.mp - 5;
		System.out.println("MPを5消費し、体力が10回復した！！");
		System.out.println("HP:" + this.hp + " MP:" + this.mp);
	}
	
	void heal() {//休憩
		System.out.println(this.name + "が休憩した");
		this.hp = this.hp + 10;
		this.mp = this.mp + 5;
		System.out.println("HPが10、MPが5、回復した！");
		System.out.println("HP:" + this.hp + " MP:" + this.mp);
	}
}
