import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook book ;
	private GradeBook book1;
	@BeforeEach
	void setUp() throws Exception {
		book =new GradeBook(5);
		book1 =new GradeBook(5);
		
		book.addScore(20);
		book.addScore(8);
		book1.addScore(9);
		book1.addScore(7);
	}

	@AfterEach
	void tearDown() throws Exception {
		book=null;
		book1=null;
		
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue(book.toString().equals("null20.0 8.0 0.0 0.0 0.0 "));
		assertEquals(2,book.getScoresSize(), .0001);
		assertEquals(2,book1.getScoresSize(), .0001);
	}

	@Test
	void testSum() {
		assertEquals(28, book.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(8, book.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(20, book.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
