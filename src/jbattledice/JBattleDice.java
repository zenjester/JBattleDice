package jbattledice;

import javax.swing.*;
import java.awt.*;

//test comment
public class JBattleDice {
    public final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container contentPane) {
        if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(
                    ComponentOrientation.RIGHT_TO_LEFT);
        }
//       Any number of rows and 2 columns
        char [] computer;
        char [] humanForce;
        dieRoll currentVal = new dieRoll();
        gameModule currentGame = new gameModule();
        contentPane.setLayout(new GridLayout(0,2));
        String lbl1Txt ="the number rolled is ";
        JLabel myForce = new JLabel(currentGame.genResult());
        myForce.setOpaque(true);
        myForce.setBackground(Color.GRAY);
        myForce.setForeground(Color.WHITE);
        JLabel compForce = new JLabel(currentGame.genResult());
        //test compForce colors
        compForce.setOpaque(true);
        compForce.setBackground(Color.BLUE);
        compForce.setForeground(Color.CYAN);

        contentPane.add(myForce);
        contentPane.add(compForce);
        contentPane.add(new JLabel(lbl1Txt+currentVal.rollResult(4)));
        contentPane.add(new JTextField(currentGame.genResult()));
        contentPane.add(new JLabel(lbl1Txt+currentVal.rollResult(10)));
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("BattleDice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setPreferredSize(new Dimension(400, 300));

        //Set up the content pane and components in GridLayout
        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}