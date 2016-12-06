package com.zl.kotlin.easyfactory

/**
 * Created by rudy
 * 2016
 * 16-12-6
 * 下午11:26
 */

interface Api {
    fun operation(s: String)
}

class Impla : Api {
    override fun operation(s: String) {
        println("this is Impla " + s)
    }
}

class Implb : Api {
    override fun operation(s: String) {
        println("this is Implb " + s)
    }
}

fun factory(n: Int): Api {
    var api: Api
    when (n) {
        1 -> api = Impla()
        2 -> api = Implb()
        else -> throw IllegalArgumentException("errror arg")
    }
    return api
}
