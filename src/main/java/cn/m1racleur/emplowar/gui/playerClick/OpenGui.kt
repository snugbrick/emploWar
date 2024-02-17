package cn.m1racleur.emplowar.gui.playerClick

import cn.m1racleur.emplowar.gui.EmploGui
import me.filoghost.chestcommands.api.ClickHandler
import me.filoghost.chestcommands.api.MenuView
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player

/**
@version 1.0.0 2024.01.26 21:03
@author MiracleUR -> github.com/snugbrick
 */
class OpenGui : CommandExecutor {
    private lateinit var solClickHandler: ClickHandler
    private lateinit var arcClickHandler: ClickHandler

    //private lateinit var menuView: MenuView
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.name.equals("openEmploGui", ignoreCase = true)) {//&& sender is Player
            Bukkit.getLogger().info("${sender.name} is opening an EploGui")

            val emploGui = EmploGui()
            emploGui.gui(sender as Player)

            solClickHandler = emploGui.solIcon.clickHandler as ClickHandler
            arcClickHandler = emploGui.arcIcon.clickHandler as ClickHandler

            //emploGui.solIcon.onClick(menuView, sender)
        }
        return true
    }
}