/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.info6205.randomwalk;

import edu.neu.coe.info6205.NotReadyTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class RandomWalkTest {

    /**
     */
    @Category(NotReadyTests.class)
    @Test
    public void testMove1() {
        RandomWalk rw = new RandomWalk();
        rw.move(1, 0);
        assertEquals(rw.distance(), 1.0, 1.0E-7);
        rw.move(1, 0);
        assertEquals(rw.distance(), 2.0, 1.0E-7);
        rw.move(-1, 0);
        assertEquals(rw.distance(), 1.0, 1.0E-7);
        rw.move(-1, 0);
        assertEquals(rw.distance(), 0.0, 1.0E-7);
    }

    /**
     */
    @Category(NotReadyTests.class)
    @Test
    public void testMove2() {
        RandomWalk rw = new RandomWalk();
        rw.move(0, 1);
        assertEquals(rw.distance(), 1.0, 1.0E-7);
        rw.move(0, 1);
        assertEquals(rw.distance(), 2.0, 1.0E-7);
        rw.move(0, -1);
        assertEquals(rw.distance(), 1.0, 1.0E-7);
        rw.move(0, -1);
        assertEquals(rw.distance(), 0.0, 1.0E-7);
    }

    /**
     */
    @Category(NotReadyTests.class)
    @Test
    public void testMove3() {
        RandomWalk rw = new RandomWalk();
        double root2 = Math.sqrt(2);
        rw.move(1, 1);
        assertEquals(rw.distance(), root2, 1.0E-7);
        rw.move(1, 1);
        assertEquals(rw.distance(), 2 * root2, 1.0E-7);
        rw.move(0, -2);
        assertEquals(rw.distance(), 2.0, 1.0E-7);
        rw.move(-2, 0);
        assertEquals(rw.distance(), 0.0, 1.0E-7);
    }

    /**
     */
    @Category(NotReadyTests.class)
    @Test
    public void testRandomWalk() {
        RandomWalk rw = new RandomWalk();
        rw.move(1, 0);
        assertEquals(rw.distance(), 1.0, 1.0E-7);
    }

}