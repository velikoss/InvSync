package com.mrnavastar.invsync.sql.column;

import java.util.ArrayList;

public class PlayerRolesColumns {

    public static ArrayList<Column> getColumns() {
        ArrayList<Column> columns = new ArrayList<>();

        columns.add(new Column("roles", "TEXT"));

        return columns;
    }
}
