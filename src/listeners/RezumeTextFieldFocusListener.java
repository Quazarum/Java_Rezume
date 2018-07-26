package listeners;

import java.awt.event.FocusEvent;
import gui.MyJTextField;
import gui.RezumeGUI;
import java.awt.Color;
import java.awt.event.FocusListener;

class RezumeTextFieldFocusListener implements FocusListener {

    private final MyJTextField field;

    public RezumeTextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(RezumeGUI.INPUT_TEXT_1);
            field.setForeground(Color.GRAY);
        }
    }

    @Override
    public String toString() {
        return "RezumeTextFieldFocusListener{" +
                "field=" + field +
                '}';
    }
}
