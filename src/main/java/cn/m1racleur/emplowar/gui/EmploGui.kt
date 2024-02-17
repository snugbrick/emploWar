package cn.m1racleur.emplowar.gui

import cn.m1racleur.emplowar.EmploWar
import me.filoghost.chestcommands.api.ConfigurableIcon
import me.filoghost.chestcommands.api.Menu
import org.bukkit.Material
import org.bukkit.entity.Player

/**
@version 1.0.0 2024.01.23 23:22
@author MiracleUR -> github.com/snugbrick
 */
class EmploGui {
    val solIcon = ConfigurableIcon.create(Material.DIAMOND_SWORD)
    val arcIcon = ConfigurableIcon.create(Material.BOW)

    fun gui(player: Player) {
        val menu: Menu
        //设置名字
        solIcon.name = "Soldier"
        arcIcon.name = "Archer"

        //设置简介
        solIcon.setLore("Soldier! complete your mission")
        arcIcon.setLore("Archer, bow dog is Not Supported!")

        val emploWar = EmploWar()
        menu = Menu.create(emploWar.instance, "employees", 6)

        menu.setIcon(0, 0, solIcon)
        menu.setIcon(0, 1, arcIcon)

        menu.open(player)
    }
}