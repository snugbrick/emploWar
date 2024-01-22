package cn.m1racleur.emplowar.employees

import cn.m1racleur.emplowar.api.emplo.Emplos
import cn.m1racleur.emplowar.api.emplo.BackPack
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

/** @version 1.0.0 2024.01.22 14:48 @author MiracleUR -> github.com/snugbrick */
class Soldier : Emplos {
    private var soldierBackPack = BackPack()

    override val name: String
        get() = ("Soldier")
    override val lore: String
        get() = ("the simplest employee")
    override val deffBackPack: Array<ItemStack>
        get() = getLastBackPack()
    override val icon: ItemStack
        get() = ItemStack(Material.IRON_SWORD)

    private fun getLastBackPack(): Array<ItemStack> {
        return soldierBackPack.getDefaultBackPack()
    }
}
