package cn.m1racleur.emplowar.gui

import cn.m1racleur.emplowar.EmploWar
import me.filoghost.chestcommands.api.ConfigurableIcon
import me.filoghost.chestcommands.api.Menu
import org.bukkit.Material

/**
@version 1.0.0 2024.01.23 23:22
@author MiracleUR -> github.com/snugbrick
 */
class EmploGui {
    private lateinit var menu: Menu
    fun gui() {
        val solIcon = ConfigurableIcon.create(Material.DIAMOND_SWORD)
        val arcIcon = ConfigurableIcon.create(Material.BOW)

        solIcon.setLore("Soldier! complete your mission")
        solIcon.setLore("Archer, bow dog is Not Supported!")

        val emploWar = EmploWar()
        menu = Menu.create(emploWar.instance, "employees", 6)
        menu.setIcon(0, 0, solIcon)
        menu.setIcon(0, 1, arcIcon)
    }
}