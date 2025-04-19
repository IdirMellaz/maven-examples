import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petri Kainulainen
 */
public class FizzBuzzTest {
private FizzBuzz fizzBuzz;

<<<<<<< HEAD
<<<<<<< HEAD
=======
    private FizzBuzz fizzBuzz;

=======
>>>>>>> b16e21384fa3f5454e33ff8e686c1ccae9a15822
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
        assertThat(fizzBuzz.getFizzBuzzWord(3), is("Fizz"));
    }
<<<<<<< HEAD

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfFive_ShouldReturnBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(5), is("Buzz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThreeAndFive_ShouldReturnFizzBuzz() {
        assertThat(fizzBuzz.getFizzBuzzWord(15), is("FizzBuzz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsNotMultipleOfThreeOrFive_ShouldReturnNull() {
        assertNull(fizzBuzz.getFizzBuzzWord(4));
    }
>>>>>>> origin/ut2
=======
>>>>>>> b16e21384fa3f5454e33ff8e686c1ccae9a15822

}
