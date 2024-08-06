package LLD.Design_Patterns.Registry_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class PluginRegistry {
    private Map<String , Plugin> map = new HashMap<>();

    private static PluginRegistry instance = new PluginRegistry();

    private PluginRegistry(){};

    public static PluginRegistry getInstance() {
        return instance;
    }
    public void registerPlugin(String name, Plugin plugin) {
        map.put(name, plugin);
    }

    public Plugin getPlugin(String name) {
        return map.get(name);
    }

}
