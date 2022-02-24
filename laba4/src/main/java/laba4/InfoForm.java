package laba4;

import java.awt.Point;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class InfoForm {
	private JFrame frame;
	private JTextArea fio1;
	private JLabel zka;
	private JLabel fio;
	private JScrollPane scrollPane;
	
	public InfoForm () {
		frame = new JFrame("ФИО");
		frame.setBounds(500,400,400,300);
		frame.setResizable(false); // фиксированный размер окна

		JPanel panel1 = new JPanel();
		frame.setLayout(null);
		frame.add(panel1);

		fio = new JLabel("ФИО участников:"); // Отображение текста или изображения
		fio.setBounds(20,0,150,30);
		frame.add(fio);

		fio1 = new JTextArea("");
		fio1.setBackground(new java.awt.Color(238, 238, 238));
		fio1.setEditable(false);
		scrollPane = new JScrollPane(fio1);
		scrollPane.setBounds(20,30,355,130);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		frame.add(scrollPane);

		zka = new JLabel("Номер зачетной книжки:"); // Отображение текста или изображения
		zka.setBounds(150,0,150,30);
		frame.add(zka);

		
		JButton button3 = new JButton("Назад"); // создание кнопки
		button3.setBounds(190,170,120,40); // установка размеров
		ActionListener actionListener3 = new Listenerback(frame); // создаем слушатель
		button3.addActionListener(actionListener3); // добавление к кнопке слушателя
		frame.add(button3); // добавление на рамку кнопки

		JButton button4 = new JButton("Проводник"); // создание кнопки
		button4.setBounds(50,170,120,40); // установка размеров
		ActionListener actionListener4 = new FileChooser(this); // создаем слушатель
		button4.addActionListener(actionListener4); // добавление к кнопке слушателя
		frame.add(button4); // добавление на рамку кнопки
	}

	public void show () {
		frame.setVisible(true);
	}
	public void ren() {
		zka.setText("");
		fio.setText("Содержимое файла:");
	}
	public void ner() {
		zka.setText("Номер зачетной книжки:");
		fio.setText("ФИО участников:");
	}
	
	public JTextArea getFio() {
		return fio1;
	}

	public  void chooser  () {
		String ss = "";
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("D:"));
		fc.setDialogTitle("Проводник");
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

		
		if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {

			fio1.setText(null);
			String s = fc.getSelectedFile().getAbsolutePath();

			try(FileReader reader = new FileReader(s)){
				if (fc.getSelectedFile().getAbsolutePath().endsWith(".txt")) {
					int c;
					while((c=reader.read())!=-1){
						ss=ss+String.valueOf((char)c);
					}
					fio1.setText(ss);
					
				}else {
					 JOptionPane.showMessageDialog(null, "Выбранный файл должен иметь расширение .txt", "Ошибка", JOptionPane.WARNING_MESSAGE);
				}}catch(IOException ex){}
		}
	}
}