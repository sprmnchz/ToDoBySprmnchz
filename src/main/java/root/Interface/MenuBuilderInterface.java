package root.Interface;

import java.util.HashMap;

public interface MenuBuilderInterface {

    HashMap<Integer, String> getMenu();
    MenuBuilderInterface setMenuPoint(int keyPointMenuHashMap, String namePointMenuHashMap);

}
