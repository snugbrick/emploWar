package cn.m1racleur.emplowar;

import cn.m1racleur.emplowar.gui.EmploGui;
import cn.m1racleur.emplowar.gui.playerClick.OpenGui;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public final class EmploWar extends JavaPlugin {
    private EmploWar instance = this;

    @Override
    public void onEnable() {
        getLogger().info("EmploWar Enabled!");

        onStart();
    }

    public void onStart() {
        getCommand("openEmploGui").setExecutor(new OpenGui());
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public Plugin getInstance() {
        return instance;
    }
}
