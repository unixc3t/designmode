package com.zl.kotlin.observer

/**
 * Created by rudy
 * 2016
 * 16-12-3
 * 上午2:01
 */
fun main(args: Array<String>) {
    var observer1:ConcreteObserver=ConcreteObserver()
    var observer2:ConcreteObserver= ConcreteObserver()

    var subject:ConcreteSubject = ConcreteSubject()
    subject.attach(observer1)
    subject.attach(observer2)

    subject.status="fire"
}

class Test {

    var status: String = ""



}
