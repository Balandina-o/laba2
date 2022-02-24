package laba4;

import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class MainForm {
	private JPanel  main_panel;
	private JFrame main_GUI;
	private JLabel label;
	private JComboBox<String> comboBox;
	private Image image;
	private JFormattedTextField field;
	private InfoForm infoform;
	
    private JLabel infoPerimeter;
    private JLabel infoArea;
    private JLabel infoNameFigur;
    private JLabel infoStoron;
    private int valueee=1;
    
    JLabel labelNotSort;
    JLabel labelSort;
    generateMass generateMass1;
    int[] y;
    int value=1;
	public MainForm () {
	
		main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Using subversion for developers"); // установка заголовка
        main_GUI.setBounds(700,100,700,700); // установка размеров
		main_GUI.setResizable(false); // фиксированный размер окна
	
		main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null); // параметр установки расположения по setBounds
		main_GUI.add(main_panel); // Добавление на фрейм панели
	
		JLabel laba_info = new JLabel("Лабораторная работа №5"); // Отображение текста или изображения
		laba_info.setBounds(175,0,150,30); // установка размеров
		main_panel.add(laba_info);  // добавление на панель метки
	
        field = new JFormattedTextField();
        field.setBounds(130,300,120,40);
        JLabel label1 = new JLabel("Введите сторону:  "); // Отображение текста или изображения
        label1.setBounds(20,300,150,40); // установка размеров
        main_panel.add(label1);  // добавление на панель метки

        
		JLabel perinf = new JLabel("Периметр: ");
        perinf.setBounds(100,400,150,40);
        main_panel.add(perinf);
       
        JLabel info5 = new JLabel("Площадь:");
        info5.setBounds(200,400,150,40);
        main_panel.add(info5);
        
        JLabel info6 = new JLabel("Сторона:");
        info6.setBounds(400,400,150,40);
        main_panel.add(info6);
        
        JLabel info7 = new JLabel("Фигура: ");
        info7.setBounds(300,400,150,40);
        main_panel.add(info7);
        
        
        infoPerimeter = new JLabel("Per");
        infoPerimeter.setBounds(100,450,150,40);
        main_panel.add(infoPerimeter);

        infoArea = new JLabel("Area");
        infoArea.setBounds(200,450,150,40);
        main_panel.add(infoArea);

        infoNameFigur = new JLabel("NameFigur");
        infoNameFigur.setBounds(300,450,150,40);
        main_panel.add(infoNameFigur);

        infoStoron = new JLabel("Storon");
        infoStoron.setBounds(400,450,150,40);
        main_panel.add(infoStoron);
        
        
        JRadioButton jRadioButton = new JRadioButton("треугольник");

        ActionListener actionListener10 = new jem(this); //создаем слушатель
        jRadioButton.addActionListener(actionListener10); // добавляем слушатель к кнопке

        JRadioButton jRadioButton1 = new JRadioButton("квадрат");
        ActionListener actionListener11 = new jem1(this);
        jRadioButton1.addActionListener(actionListener11);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        jRadioButton.setBounds(450,250,100,40); //x,y
        jRadioButton1.setBounds(450,280,100,40);
        jRadioButton1.setSelected(true);
        main_panel.add(jRadioButton);
        main_panel.add(jRadioButton1);
        
        
        
        JLabel labelNotSortInfo = new JLabel("Несортированный массив:");
        labelNotSortInfo.setBounds(40,500,170,60); // установка размеров
        main_panel.add(labelNotSortInfo);  // добавление на панель метки

        JLabel labelSortInfo = new JLabel("Отсортированный массив:");
        labelSortInfo.setBounds(290,500,170,60); // установка размеров
        main_panel.add(labelSortInfo);  // добавление на панель метки

        labelNotSort = new JLabel("NotSortArray~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        labelNotSort.setBounds(40,550,170,60); // установка размеров

        generateMass1= new generateMass();
        y = generateMass1.generate();
        labelNotSort.setText(Arrays.toString(y));
        main_panel.add(labelNotSort);  // добавление на панель метки

        labelSort = new JLabel("SortArray~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        labelSort.setBounds(290,550,170,60); // установка размеров
        main_panel.add(labelSort);  // добавление на панель метки
        
        int namber=2;
        JRadioButton jRadioButton2 = new JRadioButton("Пузырьковая сортировка");
        jRadioButton2.addActionListener(e -> setValue(namber));

        int namber1=1;
        JRadioButton jRadioButton3 = new JRadioButton("Сортировка слиянием");
        jRadioButton3.addActionListener(e -> setValue(namber1));
        
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        jRadioButton2.setBounds(450,60,200,150);
        jRadioButton3.setBounds(450,150,200,150);
        jRadioButton1.setSelected(true);
        main_panel.add(jRadioButton2);
        main_panel.add(jRadioButton3);
		JButton button_exit = new JButton("Выход"); // добавляем кнопку
		button_exit.setBounds(190,150,120,40); // установка размеров
		ActionListener actionListener = new ListenerButton(); //создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		main_panel.add(button_exit); // добавление на панель кнопки
	
		JButton button1 = new JButton("Информация"); // создание кнопки
		button1.setBounds(190,90,120,40); // установка размеров
		
		
		infoform = new InfoForm();
		ActionListener actionListener1 = new Jbutton(infoform); // создаем слушатель
		button1.addActionListener(actionListener1); // добавление к кнопке слушателя
		main_panel.add(button1); // добавление на панель кнопки
		
        JButton button3 = new JButton("Посчитать"); // добавляем кнопку
        button3.setBounds(190,360,120,40); // установка размеров
        ActionListener actionListener5 = new  CalcButton(field,this,
                infoPerimeter,infoArea,infoStoron,infoNameFigur); //создаем слушатель
        button3.addActionListener(actionListener5); // добавляем слушатель к кнопке
        main_panel.add(button3); // добавление на панель кнопки
	
		JMenuBar menuBar = new JMenuBar(); // создаем меню бар
		JMenu menu1 = new JMenu("Меню 1"); // создаем меню
		JMenuItem OpenUSATU = new JMenuItem("Отобразить логотип УГАТУ"); // добавляем в меню пункты
		JMenuItem OpenUSATU1 = new JMenuItem("Загрузить файл в проект 2"); // добавляем в меню пункты
		JMenuItem ExitMenu = new JMenuItem("Выход"); // добавляем в меню пункты
		ExitMenu.addActionListener(actionListener);
		
        image = new Image();
		comboBox = new JComboBox<>(); // создаем выпадающий список
		comboBox.addItem("Переместить логотип УГАТУ в верхний правый угол"); // создаем элемент в списке
		comboBox.addItem("Переместить логотип УГАТУ в середину"); // создаем элемент в списке
		comboBox.addItem("Переместить логотип УГАТУ в левый верхний угол"); // создаем элемент в списке
		comboBox.addItem("Отсортировать данные в прооекте2 "); // создаем элемент в списке
		comboBox.setBounds(100,210,310,40); // установка размеров
		
		label = new JLabel(); // создаем метку
		label.setBounds(390,0,100,100); // установка размеров метки
	
		ActionListener actionListener3 = new Jmenu2(this); // создаем слушатель
		OpenUSATU.addActionListener(actionListener3); //добавляем к кнопке слушателя
		
		
		ActionListener actionListener6 = new ButtonInput(infoform.getFio());
	    OpenUSATU1.addActionListener(actionListener6);
		
		ActionListener actionListener4 = new ComboBox1(this,comboBox); //создаем слушатесь
		comboBox.addActionListener(actionListener4); // добавляем слушателя к выпадающему списку
		
        main_panel.add(field);
		main_panel.add(comboBox); // добавляем к панели выпадающее меню
		menu1.add(OpenUSATU);   // Добавление в меню кнопки
		menu1.add(OpenUSATU1);
		menu1.add(ExitMenu);	// Добавление в меню кнопки
		menuBar.add(menu1);		// Добавление в меню бар кнопку
		main_GUI.setJMenuBar(menuBar); // добавляем на фрейм меню бар
		
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	
	
	}

	public void show() {
		main_GUI.setVisible(true);
	}
	
    public void showLogo() {
        main_panel.add(image);
        image.setBounds(390,0,100,100);
        image.repaint();
    }
    public void moveLogo(Integer directionIndex) {
        int height = 100,width=100;
        if(directionIndex == 0) { // меняем расположение картинки по выбранному пункту
            image.setSize(width,height);
            image.setLocation(390,0);
            image.repaint();

        }else if (directionIndex == 1) { // меняем расположение картинки по выбранному пункту
            image.setSize(width,height);
            image.setLocation(202,0);
            image.repaint();
        }else if (directionIndex == 2) { // меняем расположение картинки по выбранному пункту

            image.setSize(width,height);
            image.setLocation(2,0);
            image.repaint();
        }else if (directionIndex == 3) { // меняем расположение картинки по выбранному пункту
            if(value==1) {
                QuickSort sort = new QuickSort(y);
                moveSortArray(sort);
            }else if(value==2){
                BubbleSort sort1=new BubbleSort(y);
                moveSortArray(sort1);
            }
        }
    }
    public void setValueee(int valueee) {
        this.valueee = valueee;
    }

    public int getValueee() {
        return valueee;
    }
    public void  moveSortArray(InfoSort sort){
        sort.showInfo();
             labelSort.setText((Arrays.toString(sort.showInfo())));
    }
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

