package com.grails

import grails.converters.JSON
import pk.CountryCommand

class CountryController {
    def index() {
    }
    def save(CountryCommand cmd){
            if (cmd.hasErrors()){
                render template:'/country/errors', model: [country:cmd]
                return
            }
            else{
               Country country=new Country(params)
                country.save(failOnError: true,flush: true)
                render view: 'index'
            }
    }
    def getAllCountries(){
        println("hiiii")
        def countries = Country.list()
        def response = []
        countries.each {
            response << "${it.name}"
        }
        println "List Contry "+response
        render response as JSON
    }
    def countryauto(){

    }
}
