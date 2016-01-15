/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * This is a new header
 */
package jbattledice;

import java.util.Random;

/**
 * @author andrew
 */
public class dieRoll {

    private final Random rand;
    private int roll;

    public dieRoll() {
        this.rand = new Random();
    }

    public int rollResult(int value) {
        roll = rand.nextInt(value) + 1;
        return roll;
    }
}
