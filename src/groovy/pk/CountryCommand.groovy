package pk

/**
 * Created by amit on 2/1/17.
 */
@grails.validation.Validateable
class CountryCommand {
    String name
   static constraints = {
       name blank:false,unique:true
   }
}
