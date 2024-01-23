package cn.m1racleur.emplowar;

import cn.m1racleur.emplowar.gui.emploGui;
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
        emploGui empGui=new emploGui();//职业选择gui创建
        empGui.gui();
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public Plugin getInstance() {
        return instance;
    }
}
