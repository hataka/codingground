package isemba.CommonLibrary;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.UIManager;

public class swingLib {

	/**
	 * http://stackoverflow.com/questions/7434845/setting-the-default-font-of-swing-program
	 * @param f
	 * usage :
	 * setUIFont (new javax.swing.plaf.FontUIResource("Serif",Font.ITALIC,12));
	 */
	public static void setUIFont (javax.swing.plaf.FontUIResource f) {
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get (key);
			if (value != null && value instanceof javax.swing.plaf.FontUIResource)
			UIManager.put (key, f);
		}
	}

	/**
	* http://satoshi.kinokuni.org/tech/SwingTipsFont.html
	*/
	public static void setUIFont(Font font) {
		UIManager.put("Button.font", font);
		UIManager.put("ToggleButton.font", font);
		UIManager.put("RadioButton.font", font);
		UIManager.put("CheckBox.font", font);
		UIManager.put("ColorChooser.font", font);
		UIManager.put("ComboBox.font", font);
		UIManager.put("Label.font", font);
		UIManager.put("List.font", font);
		UIManager.put("MenuBar.font", font);
		UIManager.put("MenuItem.font", font);
		UIManager.put("MenuItem.acceleratorFont", font);
		UIManager.put("RadioButtonMenuItem.font", font);
		UIManager.put("RadioButtonMenuItem.acceleratorFont", font);
		UIManager.put("CheckBoxMenuItem.font", font);
		UIManager.put("CheckBoxMenuItem.acceleratorFont", font);
		UIManager.put("Menu.font", font);
		UIManager.put("Menu.acceleratorFont", font);
		UIManager.put("PopupMenu.font", font);
		UIManager.put("OptionPane.font", font);
		UIManager.put("Panel.font", font);
		UIManager.put("ProgressBar.font", font);
		UIManager.put("ScrollPane.font", font);
		UIManager.put("ViewPort.font", font);
		UIManager.put("TabbedPane.font", font);
		UIManager.put("Table.font", font);
		UIManager.put("TableHeader.font", font);
		UIManager.put("TextField.font", font);
		UIManager.put("PasswordField.font", font);
		UIManager.put("TextArea.font", font);
		UIManager.put("TextPane.font", font);
		UIManager.put("EditorPane.font", font);
		UIManager.put("TitledBorder.font", font);
		UIManager.put("ToolBar.font", font);
		UIManager.put("ToolTip.font", font);
		UIManager.put("Tree.font", font);
	}


}
