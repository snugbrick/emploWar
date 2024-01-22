package cn.m1racleur.emplowar.api.emplo

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

/**
 * @version 1.0.0 2024.01.21 23:54
 * @author MiracleUR -> github.com/snugbrick
 *
 * 创建职业背包，只需要输入与战士装备不同的装备以及替代序号即可
 *
 * 替代位默认为0号位
 */
class Knapsack {
    private lateinit var diffItems: Array<ItemStack>
    private lateinit var replaceNum: Array<Int>
    private lateinit var soldierKnapsack: Array<ItemStack>
    private lateinit var afterReplacedKnapsack: Array<ItemStack>

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

    fun Knapsack(diffItems: Array<ItemStack>, replaceNum: Array<Int>) {
        this.diffItems = diffItems
        this.replaceNum = replaceNum
    }

    fun getAfterReplace(): Array<ItemStack> {
        for (index in diffItems.indices) {
            val item = diffItems[index]
            val num = replaceNum[index]//请保证diffItems与replaceNum数组长度一致
            soldierKnapsack[num] = item
        }
        afterReplacedKnapsack = soldierKnapsack

        return afterReplacedKnapsack
    }

    fun getDefaultKnapsack(): Array<ItemStack> {
        return soldierKnapsack
    }
}
