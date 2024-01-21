package cn.m1racleur.emplowar.api.emplo

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

/**
@version 1.0.0 2024.01.21 23:54
@author MiracleUR -> github.com/snugbrick

创建职业背包，只需要输入与战士装备不同的装备以及替代序号即可

替代默认为0号位
 */
class Knapsack {
    private lateinit var diffItems: Array<ItemStack>
    private var replaceNum: Int = 0
    private lateinit var soldierKnapsack: Array<ItemStack>

    init {
        var num = 0
        soldierKnapsack[num] = ItemStack(Material.DIAMOND_SWORD, num)
        num++

        while (true) {
            soldierKnapsack[num] = ItemStack(Material.MUSHROOM_STEW, num)
            num++
            if (num == 41) {
                break
            }
        }
    }

    fun Knapsack(diffItems: Array<ItemStack>, replaceNum: Int) {
        this.diffItems = diffItems
        this.replaceNum = replaceNum
    }

    fun getAfterReplace(): Array<ItemStack> {


        return diffItems
    }
}