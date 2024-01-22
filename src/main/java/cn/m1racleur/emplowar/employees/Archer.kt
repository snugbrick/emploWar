package cn.m1racleur.emplowar.employees

import cn.m1racleur.emplowar.api.emplo.Emplos
import cn.m1racleur.emplowar.api.emplo.Knapsack
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

/**
@version 1.0.0 2024.01.22 15:16
@author MiracleUR -> github.com/snugbrick
 */
class Archer : Emplos {
    private lateinit var archerKnapsack: Knapsack
    override val name: String?
        get() = ("Archer")
    override val lore: String?
        get() = ("bow dog")
    override val deffKnapsack: Array<ItemStack>
        get() = getLastKnapsack()

    private fun getLastKnapsack(): Array<ItemStack> {
        val changedItem: Array<ItemStack> = Array(2) {
            ItemStack(Material.BOW)
            ItemStack(Material.ARROW, 64)
        }

        val changedNum: Array<Int> = arrayOf(1, 2)
        archerKnapsack.Knapsack(changedItem, changedNum)

        return archerKnapsack.getAfterReplace()
    }
}