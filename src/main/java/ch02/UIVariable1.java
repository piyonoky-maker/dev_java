package ch02;

import javax.swing.*;

public class UIVariable1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        int width = 500;
        int height = 400;

        jf.setSize(width, height);
        jf.setVisible(true);

        boolean isView = true;
        isView = false;
        isView = true;

        jf.setVisible(isView);

    }
}
