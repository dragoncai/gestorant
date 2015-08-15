package com.dragoncai;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TableTest {
//    @Test
//    void acceptanceTest() {
//        ITable table = new Table();
//
//    }

    @Test(expected = IllegalArgumentException.class)
    public void givingANegativeNumberToATableIsGoingToThrowAnWrongValueException() {
        ITable table = new Table(-1);
    }

    @Test
    public void createATableShouldSetTheTableAsFree() throws Exception {
        ITable table = new Table(1);
        assertThat(table.getState()).isEqualTo(ITable.State.FREE);
    }

    @Test
    public void occupyATableShouldSetTheTableAsOccupied() {
        ITable table = new Table(1);
        table.occupy();
        assertThat(table.getState()).isEqualTo(ITable.State.OCCUPIED);
    }

    @Test
    public void liberateAOccupiedTableShouldSetTheTableAsFree() throws Exception {
        ITable table = new Table(1);
        table.occupy();
        table.cleanUp();
        assertThat(table.getState()).isEqualTo(ITable.State.FREE);
    }
}
