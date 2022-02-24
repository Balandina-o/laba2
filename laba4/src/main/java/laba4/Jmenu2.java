package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jmenu2  implements ActionListener {
	private MainForm form; 
    public Jmenu2(MainForm form){
    	this.form = form;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	form.showLogo();
    }
}
