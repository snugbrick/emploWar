package cn.m1racleur.emplowar.api.emplo

import org.bukkit.inventory.ItemStack

/**
@version 1.0.0 2024.01.22 14:54
@author MiracleUR -> github.com/snugbrick
 */
interface Emplos {
    val name: String?

    val lore: String?

    val deffKnapsack: Array<ItemStack>  //背包

}