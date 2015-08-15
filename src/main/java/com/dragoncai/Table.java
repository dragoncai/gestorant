package com.dragoncai;

import com.dragoncai.exceptions.WrongValueException;

public class Table implements ITable {
    private int tableNumber;

    public Table(int tableNumber) throws WrongValueException {
        if (tableNumber < 0) {
            throw new WrongValueException();
        }
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public enum State {
        FREE,
        OCCUPIED
    }
}
