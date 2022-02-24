package laba4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listenerback implements ActionListener {
    private JFrame frame;
    @Override
    public void actionPerformed(ActionEvent e){
        frame.dispose();
    }
    public Listenerback(JFrame frame){
        this.frame=frame;
    }
}