package cn.m1racleur.emplowar.api.register

import cn.m1racleur.emplowar.api.emplo.Emplos
import cn.m1racleur.emplowar.employees.Soldier
import cn.m1racleur.emplowar.employees.Archer
import org.bukkit.inventory.ItemStack

/**
 * @version 1.0.0 2024.01.22 15:16 @author MiracleUR -> github.com/snugbrick
 *
 * gui的内容(之所以分开写是因为我后面要调用别的UI api,所以内容暂时注册在这里备用)
 */
class guiContent {
    private lateinit var addIcon: ItemStack
    private lateinit var name: String
    private lateinit var lore: String
    private lateinit var backPack: Array<ItemStack>

    fun register(emp: Emplos) {
        val icon = emp.getIcon()
        addIcon = icon // SB vscode

        val name = emp.getName()
        this.name = name

        val lore = emp.getLore()
        this.lore = lore
        
        this.backPack = emp.getdDeffBackPack()
    }
    fun emploReg{
        register(Soldier());
        register(Archer());
    }
}
