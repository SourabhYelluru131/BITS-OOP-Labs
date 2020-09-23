package softest;
import org.junit.*;
import static org.junit.Assert.*; 
public class CardTest {
           /* Test the Card constructor */
           @Test
           public void cardConstructor(){
        	   Card c1 = new Card("ace", "hearts", 1); 
        	   Card c2 = new Card("ace", "hearts", 1); 
        	   Card c3 = new Card("ace", "hearts", 2); 
        	   assertEquals(c1.rank(), c2.rank());
        	   assertEquals(c1.suit(), c2.suit());
        	   assertTrue(c1.matches(c2));
           } 
}
