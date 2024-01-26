package cn.m1racleur.emplowar.gui.playerClick

import cn.m1racleur.emplowar.gui.EmploGui
import me.filoghost.chestcommands.api.ClickHandler
import me.filoghost.chestcommands.api.MenuView
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player

/**
@version 1.0.0 2024.01.26 21:03
@author MiracleUR -> github.com/snugbrick
 */
class OpenGui : TabExecutor {
    private lateinit var clickHandler: ClickHandler
    private lateinit var menuView: MenuView
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.equals("openEmploGui") && sender is Player) {
            val emploGui = EmploGui()
            menuView = emploGui.menu.open(sender)

            clickHandler = emploGui.solIcon.clickHandler as ClickHandler

            emploGui.solIcon.onClick(menuView, sender)
        }

        return true
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): MutableList<String>? {
        return mutableListOf("null")
    }
}