package com.delirium.restserver;

import com.delirium.restserver.model.Circle;
import com.delirium.restserver.model.Shape;

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
    }

    public static Database instance() {
        return ins;
    }

    public Map<Long, Shape> getDb() {
        return db;
    }
}
