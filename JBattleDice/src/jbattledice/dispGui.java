/* hope this shit works
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ckage jbattledice;
package jbattledice;

import javax.swing.*;
import java.awt.*;


/**
 * @author andrew
 */
public class dispGui extends JPanel {
    private final static String newline = "\n";
    protected JTextField textField;
    protected JTextArea textArea;

    public dispGui() {

        super(new GridBagLayout());

        textField = new JTextField(20);


        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        //Add Components to this panel.
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;
        add(textField, c);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);
    }


}

        
    


