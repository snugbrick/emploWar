package cn.m1racleur.emplowar.api.emplo

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

/**
 * @version 1.0.0 2024.01.21 23:54
 * @author MiracleUR -> github.com/snugbrick
 *
 * 创建职业背包，只需要输入与战士装备不同的装备以及替代序号即可 -替代位默认为0号位
 */
class BackPack {
    private lateinit var diffItems: Array<ItemStack>
    private lateinit var replaceNum: Array<Int>
    private lateinit var soldierBackPack: Array<ItemStack>
    private lateinit var afterReplacedBackPack: Array<ItemStack>

    init {
        var num = 0
        soldierBackPack[num] = ItemStack(Material.DIAMOND_SWORD)
        num++

        while (true) {
            soldierBackPack[num] = ItemStack(Material.MUSHROOM_STEW)
            num++
            if (num == 41) {
                break
            }
        }
    }

    fun BackPack(diffItems: Array<ItemStack>, replaceNum: Array<Int>) {
        this.diffItems = diffItems
        this.replaceNum = replaceNum
    }

    fun getAfterReplace(): Array<ItemStack> {
        for (index in diffItems.indices) {
            val item = diffItems[index]
            val num = replaceNum[index] // 请保证diffItems与replaceNum数组长度一致
            soldierBackPack[num] = item
        }
        afterReplacedBackPack = soldierBackPack

        return afterReplacedBackPack
    }

    fun getDefaultBackPack(): Array<ItemStack> {
        return soldierBackPack
    }
}
