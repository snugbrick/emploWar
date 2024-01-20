package cn.m1racleur.emplowar;

import cn.m1racleur.emplowar.api.ymlGetter.Employees;
import org.bukkit.plugin.java.JavaPlugin;

public final class EmploWar extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("EmploWar Enabled!");

    }
    public void onStart(){
        String emploValue =  Employees.EMPLOYEE.getValue("emplo");
    }

    @Override
    public void onDisable() {
    }

    public static void main(String[] args) {
        onStart();
    }
}
