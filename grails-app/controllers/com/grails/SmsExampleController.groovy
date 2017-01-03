package com.grails

import grails.plugin.nexmo.NexmoException

class SmsExampleController {

    /*   // Inject the service
    def nexmoService

    def index() {
        def smsResult
       // def callResult
        try {
            // Send the message "What's up?" to 1-500-123-4567
            smsResult = nexmoService.sendSms("919582747725", "What's up bro?")
            println("Hii"+smsResult.toString())
            // Call the number and tell them a message
          // callResult = nexmoService.call("919582747725", "Have a great day! Goodbye.")
        }
            catch (NexmoException e ) {
               e.printStackTrace()
            }
    }*/
    def smsService
    def index() {

        def map = [to:"+917503838109",from:"+14804625244",body:"How r  You?"]
        def result=smsService.send(map)
        println("RESULTST-----"+result.toString())
        render "Sent"
    }
}