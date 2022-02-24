package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextArea;

public class ButtonInput implements ActionListener {
	private JTextArea fio;

    public ButtonInput(JTextArea fio) {
    	this.fio = fio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        InputClick();
    }

    public void InputClick() {
        try {
        	Input input = new Input();
            fio.setText(null);
            input.inut();
            fio.setText(input.getStr());
        } catch (IOException ioException) {
            ioException.printStackTrace();
           
        }
    }
}
