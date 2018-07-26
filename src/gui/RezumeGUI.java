package gui;

import com.jtattoo.plaf.acryl.AcrylBorders;
import com.jtattoo.plaf.smart.SmartLookAndFeel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.border.LineBorder;

import listeners.RezumeButtonActionListener;

public class RezumeGUI {

    public static final String INPUT_TEXT_1 = "период времени учебы или работы                  ";
    public static final String INPUT_TEXT_2 = "наименование учебного заведения или места работы ";
    public static final String INPUT_TEXT_3 = "учебный факультет или должность работника        ";
    public static final String INPUT_TEXT_4 = "учебная специальность или должностные обязанности";

    private Color colEdu;
    private Color colStage01;
    private Color colStage02;
    private Color colStage03;
    private Color colStage04;
    private Color colStage05;
    private Color colStage06;
    private Color colStage07;
    private Color colStage08;
    private Color colStage09;
    private Color colDopInf;

    private MyJButton btnEdu;
    private MyJButton btnStage01;
    private MyJButton btnStage02;
    private MyJButton btnStage03;
    private MyJButton btnStage04;
    private MyJButton btnStage05;
    private MyJButton btnStage06;
    private MyJButton btnStage07;
    private MyJButton btnStage08;
    private MyJButton btnStage09;
    private MyJButton btnDopInf;

    private ImageIcon myPhoto;

    private MyJLabel labelPeriod;
    private MyJLabel labelName;
    private MyJLabel labelJob;
    private MyJLabel labelFunctions;
    private JLabel labelFstName;
    private JLabel labelLstName;
    private JLabel labelBthName;
    private JLabel labelBthDay;
    private JLabel labelBoris;
    private JLabel labelVacans;
    private JLabel labelVcnName1;
    private JLabel labelVcnName2;
    private JLabel labelVcnName3;
    private JLabel labelVcnName4;


    private MyJTextArea jtxtPeriod;
    private MyJTextArea jtxtName;
    private MyJTextArea jtxtJob;
    private MyJTextArea jtxtFunctions;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;
    private MyJPanel panel4;
    private MyJPanel panel5;
    private JPanel mainPanel;

    private MyJFrame frame;

    private ScrollPane ScrollMainPane;


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(RezumeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        RezumeGUI rezumeGUI = new RezumeGUI();

        rezumeGUI.createLabels();
        rezumeGUI.createTextFields();
        rezumeGUI.createButtons();
        rezumeGUI.createPanels();
        rezumeGUI.createFrame();

    }


    private void createLabels() {
        labelPeriod = new MyJLabel("Период: ", 550);
        labelName = new MyJLabel("Организация: ", 550);
        labelJob = new MyJLabel("Должность: ", 550);
        labelFunctions = new MyJLabel("Обязанности: ", 550);
        labelVacans = new MyJLabel("Соискание вакансии :", 25);
        labelVcnName1 = new MyJLabel("Системный администратор, ", 30);
        labelVcnName2 = new MyJLabel("Администратор БД, ", 25);
        labelVcnName3 = new MyJLabel("JAVA-программист, ", 25);
        labelVcnName4 = new MyJLabel("WEB-программист. ", 25);
        labelFstName = new MyJLabel("Могильченко ", 200);
        labelLstName = new MyJLabel("Борис Николаевич, ", 200);
        labelBthName = new MyJLabel("Дата рождения :", 200);
        labelBthDay = new MyJLabel("24 февраля 1960 года", 200);
        myPhoto = new ImageIcon("images/Boris_rezume.jpg");
        labelBoris = new JLabel(myPhoto);

    }

    private void createTextFields() {

        jtxtPeriod = new MyJTextArea(INPUT_TEXT_1, 2, 50);
        jtxtName = new MyJTextArea(INPUT_TEXT_2, 2, 50);
        jtxtJob = new MyJTextArea(INPUT_TEXT_3, 2, 50);
        jtxtFunctions = new MyJTextArea(INPUT_TEXT_4, 10, 50);


    }

    private void createButtons() {

        colEdu = new Color(255, 150, 0);
        colStage01 = new Color(255, 0, 0);
        colStage02 = new Color(255, 100, 100);
        colStage03 = new Color(255, 100, 255);
        colStage04 = new Color(255, 165, 0);
        colStage05 = new Color(100, 255, 100);
        colStage06 = new Color(0, 255, 0);
        colStage07 = new Color(150, 150, 255);
        colStage08 = new Color(255, 100, 255);
        colStage09 = new Color(202, 231, 250);
        colDopInf = new Color(250, 210, 222);

        btnEdu = new MyJButton("    Образование    ", 125, 25, colEdu);
        ColorAction colEduAction = new ColorAction(colEdu);
        btnStage01 = new MyJButton("          Стаж 1          ", 125, 25, colStage01);
        ColorAction colStage01Action = new ColorAction(colStage01);
        btnStage02 = new MyJButton("          Стаж 2          ", 125, 25, colStage02);
        ColorAction colStage02Action = new ColorAction(colStage02);
        btnStage03 = new MyJButton("          Стаж 3          ", 125, 25, colStage03);
        ColorAction colStage03Action = new ColorAction(colStage03);
        btnStage04 = new MyJButton("          Стаж 4          ", 125, 25, colStage04);
        ColorAction colStage04Action = new ColorAction(colStage04);
        btnStage05 = new MyJButton("          Стаж 5          ", 125, 25, colStage05);
        ColorAction colStage05Action = new ColorAction(colStage05);
        btnStage06 = new MyJButton("          Стаж 6          ", 125, 25, colStage06);
        ColorAction colStage06Action = new ColorAction(colStage06);
        btnStage07 = new MyJButton("          Стаж 7          ", 125, 25, colStage07);
        ColorAction colStage07Action = new ColorAction(colStage07);
        btnStage08 = new MyJButton("          Стаж 8          ", 125, 25, colStage08);
        ColorAction colStage08Action=new ColorAction(colStage08);
        btnStage09 = new MyJButton("          Стаж 9          ", 125, 25, colStage09);
        ColorAction colStage09Action=new ColorAction(colStage09);
        btnDopInf = new MyJButton("Доп. информация", 125, 25, colDopInf);
        ColorAction colDopInfAction=new ColorAction(colDopInf);

        btnEdu.addActionListener(colEduAction);
        btnStage01.addActionListener(colStage01Action);
        btnStage02.addActionListener(colStage02Action);
        btnStage03.addActionListener(colStage03Action);
        btnStage04.addActionListener(colStage04Action);
        btnStage05.addActionListener(colStage05Action);
        btnStage06.addActionListener(colStage06Action);
        btnStage07.addActionListener(colStage07Action);
        btnStage08.addActionListener(colStage08Action);
        btnStage09.addActionListener(colStage09Action);
        btnDopInf.addActionListener(colDopInfAction);

        btnEdu.setMnemonic('J');
        btnStage01.setMnemonic(KeyEvent.VK_1);
        btnStage02.setMnemonic(KeyEvent.VK_2);
        btnStage03.setMnemonic(KeyEvent.VK_3);
        btnStage04.setMnemonic(KeyEvent.VK_4);
        btnStage05.setMnemonic(KeyEvent.VK_5);
        btnStage06.setMnemonic(KeyEvent.VK_6);
        btnStage07.setMnemonic(KeyEvent.VK_7);
        btnStage08.setMnemonic(KeyEvent.VK_8);
        btnStage09.setMnemonic(KeyEvent.VK_9);
        btnDopInf.setMnemonic('L');

        addButtonListeners();
    }


    private void createPanels() {
        panel1 = new MyJPanel("panel1", 990, 50);
        panel1.setPreferredSize(new Dimension(990, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyJPanel("panel2", 150, 700);
        panel2.setPreferredSize(new Dimension(150, 700));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));

        panel3 = new MyJPanel("panel3", 600, 700);
        panel3.setPreferredSize(new Dimension(600, 700));
//        panel3.setLayout(new FlowLayout(panel3, FlowLayout.LEFT));

        panel4 = new MyJPanel("panel4", 260, 700);
        panel4.setPreferredSize(new Dimension(260, 700));
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));

        panel5 = new MyJPanel("panel5", 990, 50);
        panel5.setPreferredSize(new Dimension(990, 50));
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));


        panel1.add(labelVacans);
        panel1.add(labelVcnName1);
        panel1.add(labelVcnName2);
        panel1.add(labelVcnName3);
        panel1.add(labelVcnName4);

        panel2.add(btnEdu);
        panel2.add(btnStage01);
        panel2.add(btnStage02);
        panel2.add(btnStage03);
        panel2.add(btnStage04);
        panel2.add(btnStage05);
        panel2.add(btnStage06);
        panel2.add(btnStage07);
        panel2.add(btnStage08);
        panel2.add(btnStage09);
        panel2.add(btnDopInf);

        panel3.add(labelPeriod);
        panel3.add(jtxtPeriod);
        panel3.add(labelName);
        panel3.add(jtxtName);
        panel3.add(labelJob);
        panel3.add(jtxtJob);
        panel3.add(labelFunctions);
        panel3.add(jtxtFunctions);

        panel4.add(labelBoris);

        panel4.add(labelFstName);
        panel4.add(labelLstName);
        panel4.add(labelBthName);
        panel4.add(labelBthDay);

//        panel5.add(labelFstName);
//        panel5.add(labelLstName);
//        panel5.add(labelBthName);
//        panel5.add(labelBthDay);

        mainPanel = new JPanel();

        JScrollPane ScrollMainPane = new JScrollPane();
        ScrollMainPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollMainPane.setPreferredSize(new Dimension(500, 1000));

//        ScrollMainPane.add(panel1);
//        ScrollMainPane.add(panel2);
//        ScrollMainPane.add(panel3);
//        ScrollMainPane.add(panel4);
//        ScrollMainPane.add(panel5);
//        ScrollMainPane.setViewportView(mainPanel);
    }

    private void createFrame() {
        frame = new MyJFrame("Резюме", new BorderLayout(5, 5), 1000, 900);
        frame.setMinimumSize(new Dimension(1000, 900));

        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.WEST);
        frame.getContentPane().add(panel3, BorderLayout.CENTER);
//        frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        frame.getContentPane().add(panel4, BorderLayout.EAST);
//        frame.getContentPane().add(panel5, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }


    private void addButtonListeners() {
        RezumeButtonActionListener bl = new RezumeButtonActionListener(labelPeriod, jtxtPeriod, labelName, jtxtName, labelJob, jtxtJob, labelFunctions, jtxtFunctions);

        btnEdu.addActionListener(bl);
        btnStage01.addActionListener(bl);
        btnStage02.addActionListener(bl);
        btnStage03.addActionListener(bl);
        btnStage04.addActionListener(bl);
        btnStage05.addActionListener(bl);
        btnStage06.addActionListener(bl);
        btnStage07.addActionListener(bl);
        btnStage08.addActionListener(bl);
        btnStage09.addActionListener(bl);
        btnDopInf.addActionListener(bl);
    }

    private class ColorAction implements ActionListener {
        public ColorAction(Color colElem) {
            backgroundColor = colElem;
        }
        @Override
        public void actionPerformed(ActionEvent colEvent){

/*            if (!(colEvent.getSource() instanceof JButton)) {
                return;
            }

            JButton btn = (JButton) colEvent.getSource();
*/
            panel3.setBackground(backgroundColor);
            jtxtPeriod.setBackground(backgroundColor);
            jtxtName.setBackground(backgroundColor);
            jtxtJob.setBackground(backgroundColor);
            jtxtFunctions.setBackground(backgroundColor);
        }
        private Color backgroundColor;
    }

}
