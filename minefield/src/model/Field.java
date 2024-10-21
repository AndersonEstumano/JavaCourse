package model;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private final int line;
    private final int column;

    private boolean isOpen;
    private boolean isBomb;
    private boolean isFlag;

    private List<Field> neighbors = new ArrayList<>();

    public Field(int line, int column) {
        this.line = line;
        this.column = column;
    }

}
