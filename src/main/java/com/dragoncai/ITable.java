package com.dragoncai;

public interface ITable {
    enum State {
        FREE,
        OCCUPIED
    }

    int getTableNumber();
    State getState();
    void occupy();
    void cleanUp();
}
