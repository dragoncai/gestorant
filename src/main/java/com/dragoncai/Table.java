package com.dragoncai;

public class Table implements ITable {

    private int tableNumber;
    private State state;

    public Table(int tableNumber) {
        setTableNumber(tableNumber);
        setState(State.FREE);
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber){
        if (tableNumber < 0) {
            throw new IllegalArgumentException();
        }
        this.tableNumber = tableNumber;
    }

    public State getState() {
        return state;
    }

    public void occupy() {
        setState(State.OCCUPIED);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void cleanUp() {
        setState(State.FREE);
    }
}
