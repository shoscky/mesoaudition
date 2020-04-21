package metro_audit_doc_env;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;

public class MeWindow {

	protected Shell shlMade;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MeWindow window = new MeWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMade.open();
		shlMade.layout();
		while (!shlMade.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMade = new Shell();
		shlMade.setSize(950, 600);
		shlMade.setText("MADE - \u6C14\u8C61\u5BA1\u6838\u6587\u4EF6\u73AF\u5883");
		
		Menu meMenu = new Menu(shlMade, SWT.BAR);
		shlMade.setMenuBar(meMenu);
		
		MenuItem meFileMItem = new MenuItem(meMenu, SWT.NONE);
		meFileMItem.setText("\u6587\u4EF6");
		
		MenuItem meEditMItem = new MenuItem(meMenu, SWT.NONE);
		meEditMItem.setText("\u7F16\u8F91");
		
		MenuItem meToolMitem = new MenuItem(meMenu, SWT.NONE);
		meToolMitem.setText("\u5DE5\u5177");
		
		MenuItem meHelpMitem = new MenuItem(meMenu, SWT.NONE);
		meHelpMitem.setText("\u5E2E\u52A9");
		
		Menu menu = new Menu(shlMade);
		shlMade.setMenu(menu);
		
		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("New Item");
		
		MenuItem mntmNewItem_1 = new MenuItem(menu, SWT.NONE);
		mntmNewItem_1.setText("New Item");

	}
}
