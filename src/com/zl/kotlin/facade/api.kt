package com.zl.kotlin.facade

/**
 *  rudy
 * 9:59 PM
 * 12/25/16.
 */

interface AModuleApi {
    fun testA()
}

interface  BModuleApi{
    fun testB()
}

class AModuleImpl : AModuleApi{
    override fun testA() {
    }

}
class BModuleImpl : BModuleApi{
    override fun testB() {
    }

}

class Facade {
    fun test() {
        AModuleImpl().testA()
        BModuleImpl().testB()
    }
}

fun main(args:Array<String>) {
    //客户端调用
   Facade().test()
}
