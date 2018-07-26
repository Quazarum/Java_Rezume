package listeners;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import gui.MyJLabel;
import gui.MyJTextArea;
import objects.ListWork;


public class RezumeButtonActionListener implements ActionListener {

    private MyJLabel labelPeriod;
    private MyJTextArea jtxtPeriod;
    private MyJLabel labelName;
    private MyJTextArea jtxtName;
    private MyJLabel labelJob;
    private MyJTextArea jtxtJob;
    private MyJLabel labelFunctions;
    private MyJTextArea jtxtFunctions;

    public RezumeButtonActionListener(MyJLabel labelPeriod, MyJTextArea jtxtPeriod, MyJLabel labelName, MyJTextArea jtxtName, MyJLabel labelJob, MyJTextArea jtxtJob, MyJLabel labelFunctions, MyJTextArea jtxtFunctions) {

        this.labelPeriod = labelPeriod;
        this.jtxtPeriod = jtxtPeriod;
        this.labelName = labelName;
        this.jtxtName = jtxtName;
        this.labelJob = labelJob;
        this.jtxtJob = jtxtJob;
        this.labelFunctions = labelFunctions;
        this.jtxtFunctions = jtxtFunctions;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof JButton)) {
            return;
        }

        JButton btn = (JButton) e.getSource();


        if (btn.getActionCommand().trim().equals("Образование")) {
            labelPeriod.setText("Период обучения: ");
            jtxtPeriod.setText(ListWork.EDU01.getPeriod());
            labelName.setText("Учебное заведение: ");
            jtxtName.setText(ListWork.EDU01.getName());
            labelJob.setText("Факультет: ");
            jtxtJob.setText(ListWork.EDU01.getJob());
            labelFunctions.setText("Специальность: ");
            jtxtFunctions.setText(ListWork.EDU01.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 1")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK01.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK01.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK01.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK01.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 2")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK02.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK02.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK02.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK02.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 3")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK03.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK03.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK03.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK03.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 4")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK04.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK04.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK04.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK04.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 5")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK05.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK05.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK05.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK05.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 6")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK06.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK06.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK06.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK06.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 7")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK07.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK07.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK07.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK07.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 8")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK08.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK08.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK08.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK08.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Стаж 9")) {
            labelPeriod.setText("Период работы: ");
            jtxtPeriod.setText(ListWork.WRK09.getPeriod());
            labelName.setText("Предприятие, организация: ");
            jtxtName.setText(ListWork.WRK09.getName());
            labelJob.setText("Должность: ");
            jtxtJob.setText(ListWork.WRK09.getJob());
            labelFunctions.setText("Должностные обязанности: ");
            jtxtFunctions.setText(ListWork.WRK09.getFunctions());
        } else if (btn.getActionCommand().trim().equals("Доп. информация")) {
            labelPeriod.setText("Дополнительная информация:");
            jtxtPeriod.setText(ListWork.DOP01.getPeriod());
            labelName.setText("Текущее обучение:");
            jtxtName.setText(ListWork.DOP01.getName());
            labelJob.setText("Проживание, регистрация:");
            jtxtJob.setText(ListWork.DOP01.getJob());
            labelFunctions.setText("Контакты:");
            jtxtFunctions.setText(ListWork.DOP01.getFunctions());
        }
    }

}
