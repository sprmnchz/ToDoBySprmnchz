package root.Menu;

import root.Interface.MenuBuilderInterface;
import java.util.HashMap;

class MenuBuilder implements MenuBuilderInterface {
    //collection menu
    HashMap<Integer, String> menuAppMap = new HashMap<>();
    private int keyPointMenu;
    private String namePointMenu;
    //method create menu
   /* private void menuApp() {
        menuAppMap.put(1, "Open ToDo list");
        menuAppMap.put(2, "Create new list");
        menuAppMap.put(3, "Change current list");
    }*/
    //create and return menu
    public HashMap<Integer, String> getMenu(){
        return menuAppMap;
    }

    public MenuBuilderInterface setMenuPoint (int keyPointMenuHashMap, String namePointMenuHashMap){
        keyPointMenu = keyPointMenuHashMap;
        namePointMenu = namePointMenuHashMap;
        menuAppMap.put(keyPointMenu, namePointMenu);
        return null;
    }

}
