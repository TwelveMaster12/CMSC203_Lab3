import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
private GradeBook g1;
private GradeBook g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(6.77);
		g1.addScore(5.66);
		g1.addScore(56.6);
		
		g2.addScore(5.33);
		g2.addScore(4.22);
		g2.addScore(8.66);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("6.77 5.66 56.6 0.0 0.0 "));
		assertEquals(3, g1.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(69.03, g1.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(5.66, g1.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(63.37, g1.finalScore(), .001);
	}

}
