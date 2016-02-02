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
//        Any number of rows and 2 columns
        dieRoll currentVal = new dieRoll();
        contentPane.setLayout(new GridLayout(0,2));
        String lbl1Txt ="the number rolled is ";

        contentPane.add(new JLabel(lbl1Txt+currentVal.rollResult(6)));
        contentPane.add(new JButton("JButton 2"));
        contentPane.add(new JLabel(lbl1Txt+currentVal.rollResult(4)));
        contentPane.add(new JTextField("Long-Named JTextField 4"));
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