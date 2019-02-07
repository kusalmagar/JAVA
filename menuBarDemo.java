import java.awt.*;
class menuBarDemo
{
	//constructor
	menuBarDemo()
	{
		Frame frame = new Frame("Menu bar");
		MenuBar menuBar = new MenuBar();
		Menu menu1 = new Menu("File");
		Menu menu2 = new Menu("Edit");
		MenuItem item1 = new MenuItem("New File");
		MenuItem item2 = new MenuItem("Open File");
		MenuItem item3 = new MenuItem("Open Folder");
		MenuItem item4 = new MenuItem("Copy");
		MenuItem item5 = new MenuItem("Cut");
		Menu subMenu = new Menu("Selection");
		MenuItem subItem1 = new MenuItem("undo");
		MenuItem subItem2 = new MenuItem("redo");
		//adding menu's items to the menu
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		menu2.add(subMenu);
		// adding submenu's items to the submenu
		subMenu.add(subItem1);
		subMenu.add(subItem2);
		//adding menu's to MenuBar
		menuBar.add(menu1);
		menuBar.add(menu2);
		frame.setMenuBar(menuBar);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLayout(null);
	}
	public static void main(String[] args) {
		new menuBarDemo();
		
	}
}