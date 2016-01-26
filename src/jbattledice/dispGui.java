/* hope this shit works
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ckage jbattledice;
//ckage jbattledice;

import javax.swing.*;
import java.awt.*;


/**
 * @author andrew
 */
public class dispGui extends JPanel {
    private final static String newline = "\n";
    protected JTextField textField;
    protected JTextArea textArea1;
    protected JTextArea textArea2;
    protected JTextArea textArea3;
    protected JTextArea textArea4;
    protected JTextArea textArea5;
    protected JTextArea textArea6;

    public dispGui() {

        super(new GridBagLayout());

        //TODO consider JEditorPane http://docs.oracle.com/javase/tutorial/uiswing/components/editorpane.html

        textField = new JTextField(20);
        textArea1 = new JTextArea("First Area",5, 20);
        textArea2 = new JTextArea("2nd text string",5, 20);
        textArea3 = new JTextArea("3rd text string",5, 20);
        textArea4 = new JTextArea("4th text string", 5, 20);
        textArea5 = new JTextArea("Message", 1, 20);
        textArea6 = new JTextArea("Actions", 1, 20);
        textArea1.setEditable(false);
        textArea2.setForeground(Color.BLUE);
//TODO fix column x =1
        //Add Components to this panel.
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(textArea1, c);

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 0;
        add(textArea2,c );

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        add(textArea3,c );

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 31;
        c.gridy = 1;
        add(textArea4,c );

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        add(textArea5,c );

        c.fill = GridBagConstraints.BOTH;
        c.gridx = 31;
        c.gridy = 2;
        add(textArea6,c );


    }


}

        
    


