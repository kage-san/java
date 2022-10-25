package kage.dev.test.component;

import org.springframework.stereotype.Component;

@Component("Base")
public abstract class ComponentBase {
	
	/*
	 * 処理実行.
	 */
	public abstract int doComponent();
	
	/*
	 * コンポーネント呼び出し
	 */
	public int call(String[] args) {
		return this.doComponent();
	}
	
}
