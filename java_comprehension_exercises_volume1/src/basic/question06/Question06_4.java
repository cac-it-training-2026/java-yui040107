package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int amountBooks = 0;
		int sellFlags = 0;
		int bookprice = 200;

		System.out.println("本を売却します。");
		do {

			amountBooks++;
			System.out.println("売却する本の冊数を１つ増やしますか？");
			System.out.print("はい:0、いいえ：0　　　＞");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			sellFlags = Integer.parseInt(str);

		} while (sellFlags == 0);

		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + (amountBooks * bookprice) + "円です。");

	}

}
