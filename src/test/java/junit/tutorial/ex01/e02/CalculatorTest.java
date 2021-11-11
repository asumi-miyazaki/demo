package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
	@DisplayName("0で割る(第二引数が0)場合に例外が送出される")
	void test() {
		try {
			Calculator calculator = new Calculator();
			calculator.divide(2, 0);
			fail("IllegalArgumentException例外が発生しませんでした");
		} catch (IllegalArgumentException e) {
			assertEquals("divide by zero.",e.getMessage(),"例外のメッセージが異なります");
		}
	}

}
