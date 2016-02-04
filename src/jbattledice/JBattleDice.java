package jbattledice;

import javax.swing.*;
import java.awt.*;


public class JBattleDice {
    public final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container contentPane) {
        if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(
                    ComponentOrientation.RIGHT_TO_LEFT);
        }
//       Any number of rows and 2 columns
        dieRoll currentVal = new dieRoll();
        enemyForceGen eForce = new enemyForceGen();
        contentPane.setLayout(new GridLayout(0,2));
        String lbl1Txt ="the number rolled is ";
        JLabel myForce = new JLabel(lbl1Txt+currentVal.rollResult(6));
        myForce.setOpaque(true);
      myForce.setBackground(Color.GRAY);
        myForce.setForeground(Color.WHITE);
        JLabel compForce = new JLabel(lbl1Txt+currentVal.rollResult(6));

        contentPane.add(myForce);
        contentPane.add(compForce);
        contentPane.add(new JLabel(lbl1Txt+currentVal.rollResult(4)));
        contentPane.add(new JTextField(eForce.genResult()));
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