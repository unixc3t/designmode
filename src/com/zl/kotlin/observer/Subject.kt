package com.zl.kotlin.observer

/**
 * Created by rudy
 * 2016
 * 16-12-3
 * 上午2:42
 */

interface Subject {
    var observes: MutableList<Observer>
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifyObservers()
}

class ConcreteSubject : Subject {
    override var observes: MutableList<Observer> = mutableListOf()
    var status: String = ""
    set(value) {
        field = value
        notifyObservers()
    }

    override fun attach(observer: Observer) {
        observes.add(observer)
    }

    override fun detach(observer: Observer) {
        observes.remove(observer)
    }

    override fun notifyObservers() {
        for (o in observes) {
            o.update(this)
        }
    }
}