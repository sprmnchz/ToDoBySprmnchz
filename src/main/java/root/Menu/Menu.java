package root.Menu;

public class Menu {

    //out on display menu
    public static void outOnDisplayMenu() {
        MenuBuilder menuBuilder = new MenuBuilder();
        menuBuilder.setMenuPoint(1, "Open ToDo list");
        menuBuilder.setMenuPoint(2, "Create new list");
        menuBuilder.setMenuPoint(3, "Change current list");
        System.out.println(menuBuilder.getMenu());
    }

}

