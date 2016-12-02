package com.zl.kotlin.observer

/**
 * Created by rudy
 * 2016
 * 16-12-3
 * 上午2:44
 */

interface Observer {
    var status: String
    fun update(subject: Subject)
}

class ConcreteObserver : Observer {
    override var status: String = ""

    override fun update(subject: Subject) {
        this.status = (subject as ConcreteSubject).status
        println("receive " + status)
    }

}
