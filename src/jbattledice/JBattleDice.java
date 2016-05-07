package jbattledice;

//new fed box

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
        char [] computer;
        char [] humanForce;
        dieRoll currentVal = new dieRoll();
        gameModule currentGame = new gameModule();
        contentPane.setLayout(new GridLayout(0,2));
        String dieLbl1Txt ="the number rolled is ";
        String msgLblTxt = "Please enter your Choices in this box";
       
        JLabel myForce = new JLabel(currentGame.genResult());
        myForce.setOpaque(true);
        myForce.setBackground(Color.GRAY);
        myForce.setForeground(Color.WHITE);
        JLabel compForce = new JLabel(currentGame.genResult());
        JLabel playerLbl = new JLabel("Player");
        JLabel computerLbl = new JLabel("Computer");
        JTextArea msgArea = new JTextArea(msgLblTxt);
        msgArea.setEditable(false);
        JLabel msgLbl = new JLabel("Message Area");
        JLabel rollAreaLbl = new JLabel("Roll Area");
        JButton yesBttn = new JButton("Yes");
        JButton noBttn = new JButton("No");
        JButton quitBttn = new JButton("Quit");
        JButton saveBttn = new JButton("Save");
        JButton endTurnBttn = new JButton("End Turn");
        JPanel controlPanel = new JPanel();
        JPanel controlPanel1= new JPanel();
        controlPanel.add(yesBttn);
        controlPanel.add(noBttn);
        controlPanel1.add(quitBttn);
        controlPanel1.add(saveBttn);
        controlPanel1.add(endTurnBttn);
        
        
        
//test compForce colors
        compForce.setOpaque(true);
        compForce.setBackground(Color.BLUE);
        compForce.setForeground(Color.CYAN);
        
        contentPane.add(playerLbl);
        contentPane.add(computerLbl);
        contentPane.add(myForce);
        contentPane.add(compForce);
        contentPane.add(msgArea);
        contentPane.add(rollAreaLbl);
        contentPane.add(new JTextField(msgLblTxt));
        contentPane.add(new JLabel(dieLbl1Txt+currentVal.rollResult(4)));
        contentPane.add(controlPanel);
        contentPane.add(controlPanel1);
        
 //       contentPane.add(new JLabel(lbl1Txt+currentVal.rollResult(10)));
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("BattleDice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setPreferredSize(new Dimension(600, 400));

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