package laba4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FileChooser implements ActionListener {
	private InfoForm info;

	public FileChooser(InfoForm info) {
		this.info = info;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		info.ren();
		info.chooser();
	}


}



