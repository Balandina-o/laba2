package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcButton implements ActionListener {
    private JFormattedTextField field;
    private int value;
    private int per;
    private double area;
    private String name;
    private int storon;
    private MainForm form;
    private JLabel infoPerimeter;
    private JLabel infoArea;
    private JLabel infoStoron;
    private JLabel infoNameFigur;
    private int val;
    public CalcButton(JFormattedTextField field,MainForm form,JLabel infoPerimeter,JLabel infoArea,
                      JLabel infoStoron,JLabel infoNameFigur){

        this.field = field;
        this.form=form;
        this.infoPerimeter=infoPerimeter;
        this.infoArea=infoArea;
        this.infoStoron=infoStoron;
        this.infoNameFigur=infoNameFigur;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            val = Integer.parseInt(field.getText());
            if (val > 0 & val <= 100000000) {
                checkValue();
            } else
                JOptionPane.showMessageDialog(null, "¬ведите число в диапазоне [1;100000000]", "ќшибка", JOptionPane.WARNING_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "¬ведите целое число", "ќшибка", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void checkValue() {

        value = form.getValueee();
        if ((value) == 1) {
            Square square = new Square(val);
            area = square.Area();
            per = square.Perimeter();
            name = square.GetName();
            storon = square.getStoron();

        } else if ((value) == 2) {
            Tri tri = new Tri(val);
            area = tri.Area();
            per = tri.Perimeter();
            name = tri.GetName();
            storon = tri.getStoron();
        }
        infoArea.setText(Double.toString(area));
        infoPerimeter.setText(Integer.toString(per));
        infoStoron.setText(name);
        infoNameFigur.setText(Integer.toString(storon));
    }
}
