package com.engagepoint.hello;

import static java.lang.System.out;

/**
 * Created by lyolik on 22.06.2014.
 */
public class GraphObject {

    public static final String DEFAULT_COLOR="Black";
    public String color;

    public GraphObject() {
        this(DEFAULT_COLOR);
        out.println("Grapg DEFctr");
    }

    public GraphObject(String color) {
        this.color = color;
        out.println("Grapg color ctr");
    }

    public void draw()
    {
        out.printf("GraphObject %s\n", color);
    }
}
