package main.java.breakoutgame.GameHelpers;

import java.lang.Math;


public class Vector2D {
    public double x;
    public double y;

    /**
     * Basic constructor using two double values to create position vector
     * @param x x coordinate of Vector2D
     * @param y y coordinate of Vector2D
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy constructor.
     * @param toCopy Vector2D to copy
     */
    public Vector2D(Vector2D toCopy) {
        this.x = toCopy.x;
        this.y = toCopy.y;
    }

    /**
     *
     * @param vec
     * @return
     */
    public Vector2D add(Vector2D vec) {
       x += vec.x; 
       y += vec.y;
       return this;
    }

    public Vector2D add(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vector2D sub(Vector2D vec) {
        x -= vec.x;
        y -= vec.y;
        return this;
    }

    public Vector2D mult(double m) {
        x *= m; 
        y *= m;
        return this;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Vector2D vec) {
        return sub(vec).length();
    }

    public double dot(Vector2D vec) {
        return x * vec.x + y * vec.y;
    }
    public double angle(Vector2D vec) {
        return Math.acos(dot(vec) / (length() * vec.length()));
    }

    public Vector2D normalize() {
        if (length() != 0) {
            x /= length();
            y /= length();
        }
        return this;
    }

    public boolean equals(Vector2D vec) {
        return (x == vec.x) && (y == vec.y);
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

