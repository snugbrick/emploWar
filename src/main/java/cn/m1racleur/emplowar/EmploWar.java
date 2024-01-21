package cn.m1racleur.emplowar;

import cn.m1racleur.emplowar.api.ymlGetter.Employees;
import org.bukkit.plugin.java.JavaPlugin;


public final class EmploWar extends JavaPlugin {
    private final EmploWar instance = this;

    @Override
    public void onEnable() {
        getLogger().info("EmploWar Enabled!");

        onStart();
    }

    public void onStart() {
        String emploValue = Employees.EMPLOYEE.getValue("emplo");
        getLogger().info(emploValue);
    }

    @Override
    public void onDisable() {
    }

    public EmploWar getInstance() {
        return instance;
    }

}
