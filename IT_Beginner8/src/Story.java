
import java.util.Scanner;

public class Story {

	public static void main(String args[]) {
		
		//課題8-1
		
		Hero h = new Hero();	//勇者を生成（インスタンスを生成）

		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.name);
		System.out.println("体力：" + h.hp);
		
		
		Magician mg = new Magician();
		
		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + mg.name);
		System.out.println("体力：" + mg.hp);
		
		Monster m = new Monster();	//勇者を生成（インスタンスを生成）
		
		System.out.println("モンスターが誕生した");
		System.out.println("名前:" + m.name);
		System.out.println("体力:" + m.hp);
		
	}

}
