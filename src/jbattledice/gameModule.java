package jbattledice;

import java.util.Arrays;

/**
 * Created by andrew on 04/02/16.
 * Enemy force generation
 */
public class gameModule {
    public gameModule()
    {}
    public String genResult()
    {
        dieRoll currentVal = new dieRoll();
        String enemyForce;
        String tempForce ="";
        for (int i = 0; i < 20; i++) {
           tempForce=tempForce+currentVal.rollResult(6);
        }
        char[] ar = tempForce.toCharArray(); //TODO seperate method?
        Arrays.sort(ar);
        enemyForce = String.valueOf(ar);
        return enemyForce;
    }
}
