package cn.m1racleur.emplowar.employees

import cn.m1racleur.emplowar.api.emplo.Emplos
import cn.m1racleur.emplowar.api.emplo.Knapsack
import org.bukkit.inventory.ItemStack

/**
@version 1.0.0 2024.01.22 14:48
@author MiracleUR -> github.com/snugbrick
 */
class Soldier : Emplos {
    private var soldierKnapsack = Knapsack()

    override val name: String?
        get() = ("Soldier")
    override val lore: String?
        get() = ("the simplest employee")
    override val deffKnapsack: Array<ItemStack>
        get() = getLastKnapsack()

    private fun getLastKnapsack(): Array<ItemStack> {
        return soldierKnapsack.getDefaultKnapsack()
    }
}