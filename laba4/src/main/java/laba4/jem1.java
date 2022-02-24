package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jem1 implements ActionListener {
    private int number;
    MainForm form;
    jem1(MainForm form){
        this.form=form;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        number = 1;
        form.setValueee(number);
        System.out.println(number);
    }
}
