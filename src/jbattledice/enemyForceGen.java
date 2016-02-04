package jbattledice;

/**
 * Created by andrew on 04/02/16.
 * Enemy force generation
 */
public class enemyForceGen {
    public enemyForceGen()
    {}
    public String genResult()
    {
        dieRoll currentVal = new dieRoll();
        String enemyForce = "";
        for (int i = 0; i < 20; i++) {
           enemyForce=enemyForce+currentVal.rollResult(6);
        }
        return enemyForce;
    }
}
