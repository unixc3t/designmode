package com.zl.kotlin.easyfactory

/**
 * Created by rudy
 * 2016
 * 16-12-7
 * 上午12:13
 */

fun main(args: Array<String>) {
    var api: Api = factory(1)
    api.operation("impla")
    api = factory(2)
    api.operation("implb")
}
