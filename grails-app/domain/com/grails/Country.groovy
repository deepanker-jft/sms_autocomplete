package com.grails

class Country {

    String name

    static constraints = {
    name blank: false,unique: true
    }
}
