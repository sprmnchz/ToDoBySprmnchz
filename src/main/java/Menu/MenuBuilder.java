package Menu;

import java.util.TreeMap;

public class MenuBuilder {
    //collection menu
    TreeMap<Integer, String> menuAppMap = new TreeMap<Integer, String>();
    //method create menu
    private void menuApp() {
        menuAppMap.put(1, "Open ToDo list");
        menuAppMap.put(2, "Create new list");
        menuAppMap.put(3, "Change current list");
    }
    //create and return menu
    public TreeMap<Integer, String> getMenu(){
        menuApp();
        return menuAppMap;
    }

}
