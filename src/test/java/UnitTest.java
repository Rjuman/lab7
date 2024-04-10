import org.junit.*;
import static org.junit.Assert.assertArrayEquals;


public class UnitTest {

    @Test
    public void DefaultSortTest() {
        int[] input = {1,3,2,7,12,4,990,5};
        ShellSort.sort(input);
        int[] expected = {1,2,3,4,5,7,12,990};
        assertArrayEquals(expected, input);
    }

    @Test
    public void AlreadySortedArrayTest() {
        int[] input = {1,2,3,4,5,6};
        ShellSort.sort(input);
        int[] expected = {1,2,3,4,5,6};
        assertArrayEquals(expected, input);
    }

    @Test
    public void ArrayInReversedOrderTest() {
        int[] input = {5,4,3,2,1};
        ShellSort.sort(input);
        int[] expected = {1,2,3,4,5};
        assertArrayEquals(expected, input);
    }

    @Test
    public void EmptyArraySortTest() {
        int[] input = {};
        ShellSort.sort(input);
        int[] expected = {};
        assertArrayEquals(expected, input);
    }

    @Test
    public void NegativeElementsArraySortTest() {
        int[] input = {-5,-4,-10,-1};
        ShellSort.sort(input);
        int[] expected = {-10,-5,-4,-1};
        assertArrayEquals(expected, input);
    }

}
