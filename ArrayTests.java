import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 , 7, 9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9,7,3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {9,4,6 };
    assertArrayEquals(new int[]{ 6,4,9}, ArrayExamples.reversed(input1));
  }
}
