package jbattledice;

import java.util.Arrays;

/**
 * Created by andrew on 04/02/16. Enemy force generation
 */
public class gameModule {

    public gameModule() {
    }

    public String genResult() {
        dieRoll currentVal = new dieRoll();
        String enemyForce;
        String tempForce = "";
        for (int i = 0; i < 20; i++) {
            tempForce = tempForce + armyType(currentVal.rollResult(6));
        }
        char[] ar = tempForce.toCharArray(); //TODO seperate method?
        Arrays.sort(ar);
        
        enemyForce = String.valueOf(ar);
        return enemyForce;
    }

    public String armyType(int rollVal) {
        String retVal = "";
        switch (rollVal) {
            case 1:
                retVal = "A";
                break;
            case 2:
                retVal = "M";
                break;
            case 3:
                retVal = "W";
                break;
            case 4:
                retVal = "G";
                break;
            case 5:
                retVal = "A";
                break;
            case 6:
                retVal = "M";
                break;
            default:
                retVal = "Q";
                break;

        }
        return retVal;
    }
}
