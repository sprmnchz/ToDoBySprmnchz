import java.util.TreeMap;

public class menu {
    private TreeMap<Integer, String> menuAppMap = new TreeMap<Integer, String>();

    private void menuApp() {
        menuAppMap.put(1, "Open ToDo list");
        menuAppMap.put(2, "Create new list");
        menuAppMap.put(3, "Change current list");

    }
    public void outOnDisplayMenu() {
        System.out.println(menuAppMap);
    }
}
