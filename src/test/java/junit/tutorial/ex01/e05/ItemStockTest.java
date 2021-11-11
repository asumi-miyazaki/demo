package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("初期状態で、getNumで０が取得できる")
	void test() {
		Item item = new Item("book", 0);
		ItemStock itemStock = new ItemStock();
		int result = itemStock.getNum(item);
		assertEquals(0, result,"値が正しくありません");
	}
	
	@Test
	@DisplayName("初期状態で、addでItemを追加するとgetNumで１が取得できる")
	void test2() {
		Item item = new Item("book", 0);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result,"値が正しくありません");
	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる")
	void test3() {
		Item item = new Item("book", 0);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(2, result,"値が正しくありません");
	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる")
	void test4() {
		Item item = new Item("book", 0);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		Item item2 = new Item("CD", 0);
		itemStock.add(item2);
		int result = itemStock.getNum(item);
		assertEquals(1, result,"値が正しくありません");
	}

}
