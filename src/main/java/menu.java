import java.util.TreeMap;

public class menu {

    public void menuApp() {
        TreeMap<Integer, String> menuAppMap = new TreeMap<Integer, String>();
        menuAppMap.put(1, "Open ToDo list");
        menuAppMap.put(2, "Create new list");
        menuAppMap.put(3, "Change current list");
    }

}
