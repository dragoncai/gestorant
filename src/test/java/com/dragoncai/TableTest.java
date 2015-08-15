package com.dragoncai;

import com.dragoncai.exceptions.WrongValueException;
import org.junit.Test;

public class TableTest {
//    @Test
//    void acceptanceTest() {
//        ITable table = new Table();
//
//    }

    @Test(expected = WrongValueException.class)
    public void givingANegativeNumberToATableIsGoingToThrowAnWrongValueException() throws WrongValueException {
        ITable table = new Table(-1);
    }
}
