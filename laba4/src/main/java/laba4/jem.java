package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jem implements ActionListener {
    private int number;
    MainForm form;
    jem(MainForm form){
        this.form=form;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        number = 2;
        form.setValueee(number);
        System.out.println(number);
    }
}
