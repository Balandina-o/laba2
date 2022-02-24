package laba4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class ComboBox1 implements ActionListener {
    private JComboBox comboBox;
    private MainForm form;
    public  ComboBox1(MainForm form, JComboBox comboBox){
    	this.form = form;
        this.comboBox = comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        this.form.moveLogo(this.comboBox.getSelectedIndex());
        }
    }