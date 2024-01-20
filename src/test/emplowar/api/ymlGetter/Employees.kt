package cn.m1racleur.emplowar.api.ymlGetter

/**
@version 1.0.0 2024.01.21 03:35
@author MiracleUR -> github.com/snugbrick

该枚举类提供各个yml文件的枚举，可以通过key来获取

@param enuKey:用于指定枚举值，每个枚举值有getValue方法
@param getValue(key: String):用于指定键值对的key，获取到对应的value，如果key不存在，则返回null
@return String? -> 返回所得value，如果key不存在，则返回null
 */
enum class Employees(private val enuKey: String) {
    EMPLOYEE("employee"),
    MANAGER("manager");

    private val configGet = ConfigGet()
    private var ymlKey = "null"
    private var value: String? = null

    fun getValue(key: String): String? {
        ymlKey = key
        value = configGet.getConfig("src/main/resources/$enuKey.yml", ymlKey)
        return value
    }
}
