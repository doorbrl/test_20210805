package lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class lambda {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Local local = new Local();
		local.sayHello();
		Runnable runner = () -> { System.out.println("Hello Lambda!"); };//ラムダ式の一つ
		runner.run();

		/*Function<T, R>のTはメソッドの引数の型、Rは戻り値の型を指定
		 *メソッドは R apply(T) */
		Function<Integer, String> asterisker = (i) -> { return "*"+ i; };
		String result = asterisker.apply(10);
		System.out.println(result);

		/* 2つの引数を受け付けるBiFunctionというインターフェース*/
		BiFunction<Integer, Integer, Integer> adder = (a, b) -> { return a + b; };
		int result1 = adder.apply(1, 2);
		System.out.println(result1); 

		/*Consumer<T>のTはメソッドの引数の型を指定
		 *メソッドは void accept(T) */
		Consumer<String> buyer = (goods) -> { System.out.println(goods + "を購入しました"); };
		buyer.accept("おにぎり");
	}

}
