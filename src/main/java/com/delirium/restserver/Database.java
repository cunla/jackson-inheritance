package com.delirium.restserver;

import com.delirium.restserver.model.Circle;
import com.delirium.restserver.model.Shape;
import com.delirium.restserver.model.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by morand3 on 7/24/2016.
 */
public class Database {
    private static Database ins = new Database();
    private Map<Long, Shape> db = new HashMap<>();

    private Database() {
        Circle shape = new Circle();
        shape.setId(1L);
        this.db.put(shape.getId(), shape);
        Square square = new Square();
        square.setSide(10.0);
        square.setId(2L);
        this.db.put(2L, square);
    }

    public static Database instance() {
        return ins;
    }

    public Map<Long, Shape> getDb() {
        return db;
    }
}
