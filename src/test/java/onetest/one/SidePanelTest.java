package onetest.one;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

	


public class SidePanelTest {

    @Test
    public void ReturnTrueOrFalse() {
        int a = 4;
        assertTrue("Number should be 4", a == 4); // Message first, condition second
    }
}