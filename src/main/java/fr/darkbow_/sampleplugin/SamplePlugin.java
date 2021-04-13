package fr.darkbow_.sampleplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class SamplePlugin extends JavaPlugin {

    private SamplePlugin instance;

    public SamplePlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new SamplePluginEvents(this), this);

        System.out.println("[SamplePlugin] Plugin ON!");
    }

    @Override
    public void onDisable() {
        System.out.println("[SamplePlugin] Plugin OFF!");
    }
}