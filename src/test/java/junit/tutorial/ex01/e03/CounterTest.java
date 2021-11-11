package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	@DisplayName("初期状態で、incrementメソッドを実行すると１が取得できる")
	void Countertest() {
		Counter counter = new Counter();
		int result = counter.increment();
		assertEquals(1, result, "値が正しくありません");
	}
	
	@Test
	@DisplayName("incrementメソッドを１回実行した状態で、incrementメソッドを実行すると２が取得できる")
	void Countertest2() {
		Counter counter = new Counter();
		counter.increment();
		int result = counter.increment();
		assertEquals(2, result, "値が正しくありません");
	}
	
	@Test
	@DisplayName("incrementメソッドを50回実行した状態で、incrementメソッドを実行すると５１が取得できる")
	void Countertest3() {
		Counter counter = new Counter();
		int result = 0;
		for (int i = 0; i < 50; i++){
			result = counter.increment();
		}
		result = counter.increment();
		assertEquals(51, result, "値が正しくありません");
	}
}
