import static org.junit.Assert.*;

import org.junit.*;

public class MainTest {

	@Test
	public void testBowlingScore() {
		
		assertEquals(90,Main.bowlingScore("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-"));
		assertEquals(300,Main.bowlingScore("X X X X X X X X X X X X"));
		assertEquals(150,Main.bowlingScore("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5"));
		assertEquals(154,Main.bowlingScore("1/ 2/ 3/ 4/ 5/ 6/ 7/ 8/ 9/ -/ X"));
		assertEquals(60,Main.bowlingScore("1/ 1- 1/ 1- 1/ 1- 1/ 1- 1/ 1-"));
		assertEquals(103,Main.bowlingScore("-/ -/ -/ -/ -/ -/ -/ -/ -/ -/ 3"));
		assertEquals(115,Main.bowlingScore("73 37 91 19 55 55 4/ 4/ 3/ 2/ 6"));
		assertEquals(192,Main.bowlingScore("9/ 9/ 9/ 9/ 9/ 9/ 9/ 9/ 9/ X 9/"));
		assertEquals(226,Main.bowlingScore("X X X X X 9/ 9/ 9/ 9/ 9/ 1"));
		assertEquals(117,Main.bowlingScore("1/ 3/ 5/ 7/ 9/ 7- 5- 3- 1- X 8/"));
		assertEquals(96,Main.bowlingScore("-/ 2- 4/ 6- 8/ 1- 3/ 5- 7/ 9-"));
		assertEquals(200,Main.bowlingScore("X 9/ X 9/ X 9/ X 9/ X 9/ X"));
		assertEquals(159,Main.bowlingScore("X -- 6/ -/ X X 7/ 8/ 5/ X 72"));
		assertEquals(116,Main.bowlingScore("5/ 5- 5/ 5- 5/ 5- 5/ 5- 5/ 7/ 9"));
		assertEquals(98,Main.bowlingScore("-9 18 27 36 45 54 63 72 81 9/ 7"));
		assertEquals(178,Main.bowlingScore("7/ 7/ 7/ 7/ 5/ 8/ 8/ 8/ 8/ X -/"));
		assertEquals(109,Main.bowlingScore("1- 2- 3- 4- 5- 6/ 7/ 8/ 9/ X X-"));
		assertEquals(120,Main.bowlingScore("11 22 33 44 55 66 77 88 99 X XX"));
		assertEquals(115,Main.bowlingScore("1/ 2/ 3/ 4/ X 6- 7- 8- 9- X --"));
		assertEquals(196,Main.bowlingScore("1- 1- X X X X X 9/ 9/ 9/ 7"));
		
	}

}
