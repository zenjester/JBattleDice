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
        JPanel compPanel = new JPanel();
        JPanel playerPanel = new JPanel();
        
      
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
       
        
        //control panel code
 
        JPanel controlPanel = new JPanel();
        JPanel controlPanel1= new JPanel();
        controlPanel.add(yesBttn);
        controlPanel.add(noBttn);
        controlPanel1.add(quitBttn);
        controlPanel1.add(saveBttn);
        controlPanel1.add(endTurnBttn);
        
        //player panel code
        playerPanel.setOpaque(true);
        playerPanel.setBackground(Color.GRAY);
        playerPanel.setForeground(Color.YELLOW);
        JLabel myGeneral = new JLabel(currentGame.genResult());
        JLabel myInfantry = new JLabel(currentGame.genResult());
        JLabel myArcher = new JLabel(currentGame.genResult());
        JLabel myCavalry = new JLabel(currentGame.genResult());
        JLabel myMages = new JLabel(currentGame.genResult());
        JLabel myMonsters = new JLabel(currentGame.genResult());
        
        playerPanel.setLayout(new GridLayout(6,2));
        JLabel GeneralLbl= new JLabel("General");
        playerPanel.add(GeneralLbl);
        playerPanel.add(myGeneral);
        JLabel InfantryLbl = new JLabel("Infantry");
        playerPanel.add(InfantryLbl); //just a test placeolder
        playerPanel.add(myInfantry);
        JLabel ArcherLbl = new JLabel("Archer");
        playerPanel.add(ArcherLbl); //just a test placeolder
        playerPanel.add(myArcher);
        JLabel CavalryLbl = new JLabel("Cavalry");
        playerPanel.add(CavalryLbl); //just a test placeolder
        playerPanel.add(myCavalry);
        JLabel MagesLbl = new JLabel("Mages");
        playerPanel.add(MagesLbl); //just a test placeolder
        playerPanel.add(myMages);
        JLabel MonstersLbl = new JLabel("Monsters");
        playerPanel.add(MonstersLbl); //just a test placeolder
        playerPanel.add(myMonsters);
  
        
        
        //comp player code
        compPanel.setOpaque(true);
        compPanel.setBackground(Color.BLUE);
        compPanel.setForeground(Color.WHITE);
        JLabel compGeneral = new JLabel(currentGame.genResult());
        JLabel compInfantry = new JLabel(currentGame.genResult());
        JLabel compArcher = new JLabel(currentGame.genResult());
        JLabel compCavalry = new JLabel(currentGame.genResult());
        JLabel compMages = new JLabel(currentGame.genResult());
        JLabel compMonsters = new JLabel(currentGame.genResult());
        
        compPanel.setLayout(new GridLayout(6,2));
        JLabel compGeneralLbl= new JLabel("General");
        compPanel.add(compGeneralLbl);
        compPanel.add(compGeneral);
        JLabel compInfantryLbl = new JLabel("Infantry");
        compPanel.add(compInfantryLbl); //just a test placeolder
        compPanel.add(compInfantry);
        JLabel compArcherLbl = new JLabel("Archer");
        compPanel.add(compArcherLbl); //just a test placeolder
        compPanel.add(compArcher);
        JLabel compCavalryLbl = new JLabel("Cavalry");
        compPanel.add(compCavalryLbl); //just a test placeolder
        compPanel.add(compCavalry);
        JLabel compMagesLbl = new JLabel("Mages");
        compPanel.add(compMagesLbl); //just a test placeolder
        compPanel.add(compMages);
        JLabel compMonstersLbl = new JLabel("Monsters");
        compPanel.add(compMonstersLbl); //just a test placeolder
        compPanel.add(compMonsters);
        
        
//test compForce colors
       
        
        contentPane.add(playerLbl);
        contentPane.add(computerLbl);
        contentPane.add(playerPanel);
        contentPane.add(compPanel);
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
        frame.getContentPane().setPreferredSize(new Dimension(800, 600));

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