package cn.m1racleur.emplowar.api.emplo

import org.bukkit.inventory.ItemStack

/** @version 1.0.0 2024.01.22 14:54 @author MiracleUR -> github.com/snugbrick */
interface Emplos {
    val name: String

    val lore: String

    val deffBackPack: Array<ItemStack> // 背包

    val icon: ItemStack

    fun getNameA(): String {
        return name
    }
    fun getLoreA(): String {
        return lore
    }
    fun getIconA(): ItemStack {
        return icon
    }
    fun getdDeffBackPack(): Array<ItemStack> {
        return deffBackPack
    }
}
