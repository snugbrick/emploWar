package cn.m1racleur.emplowar.api.ymlGetter

import org.yaml.snakeyaml.Yaml
import java.io.FileInputStream
import java.io.IOException


/**
@version 1.0.0 2024.01.21 03:12
@author MiracleUR -> github.com/snugbrick

该类是用于获取yml的value的类
@param getConfig(path: String, key: String)->path:指定yml文件的路径;key:指定yml文件中的key
 */
class ConfigGet {
    fun getConfig(path: String, key: String): String? {
        try {
            val inputYml = FileInputStream(path)
            val yaml = Yaml()
            val data: LinkedHashMap<String, String> = yaml.load(inputYml)

            val value = data[key]
            inputYml.close()
            return value
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }
}