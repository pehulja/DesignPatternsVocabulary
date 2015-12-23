package com.pehulja.patterns.factory;

import javax.swing.JComponent;

public interface ItemEditor {
    public JComponent getGUI();
    public void commitChanges();
}
