package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

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
	@DisplayName("入力値に「１０」を与えると、trueを返す")
	void numberUtilsTest() {
		assertTrue(NumberUtils.isEven(10), "trueです");
	}
	@Test
	@DisplayName("入力値に「７」を与えると、falseを返す")
	void numberUtilsTest2() {
		assertFalse(NumberUtils.isEven(7), "falseです");
	}

}
