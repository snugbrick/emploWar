package cn.m1racleur.emplowar.api.ymlGetter

import cn.m1racleur.emplowar.EmploWar


/**
@version 1.0.0 2024.01.24 00:40
@author MiracleUR -> github.com/snugbrick
 */
class ConfigGetter {
    fun getConfigOnce(key: String): Any? {
        val emploWar = EmploWar()

        return emploWar.instance.config.get(key)
    }
}