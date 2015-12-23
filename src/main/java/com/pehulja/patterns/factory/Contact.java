package com.pehulja.patterns.factory;

import java.io.Serializable;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Contact implements Editable, Serializable {

    private static final long serialVersionUID = -307036592966872591L;
    private String name;
    private String relationship;

    @Override
    public ItemEditor getEditor() {
	return new ContactEditor();
    }

    private class ContactEditor implements ItemEditor, Serializable {
	private static final long serialVersionUID = -3728029277641286306L;

	private transient JPanel panel;
	private transient JTextField nameField;
	private transient JTextField relationField;

	@Override
	public JComponent getGUI() {
	    return null;
	}

	@Override
	public void commitChanges() {
	    System.out.println("Comitted");
	}

    }

}
