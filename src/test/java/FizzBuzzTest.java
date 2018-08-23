import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	//Arrange
	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void shouldRespondOneForOne() {
		//Act
		String check = underTest.response(1);
		//Assert
		assertEquals("1", check);
		
	}
	
	@Test
	public void shouldRespondTwoForTwo() {
		//Act
		String check = underTest.response(2);
		//Assert
		assertEquals("2", check);
	
	
	}
	
	@Test
	public void shouldRespondFizzForThree() {
		String check = underTest.response(3);
		assertEquals("fizz", check);
		
	}
	@Test
	public void shouldRespondBuzzForFive() {
		String check = underTest.response(5);
		assertEquals("buzz", check);
	}
		
	@Test
	public void shouldRespondFizzForSix() {
			String check = underTest.response(6);
			assertEquals("fizz", check);
	}
	@Test
	public void shouldRespondFizzForTen() {
		String check = underTest.response(10);
		assertEquals("buzz", check);
		
	}
	
	@Test
	public void shouldRespondFizzBuzzForFifteen() {
		String check = underTest.response(15);
		assertEquals("fizzbuzz", check);
		
		
		
	}
	@Test
	public void shouldRespondErrorForValues0OrBelow() {
		String check = underTest.response(-1);
		assertEquals("error", check);
		
	}
	
}