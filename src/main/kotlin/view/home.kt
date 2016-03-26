package view

import br.com.caelum.vraptor.Controller
import br.com.caelum.vraptor.Path

/**
 * Created by cordjr on 23/03/16.
 */
@Controller
open class Home{
    @Path("/")
    open fun index(){
        println("Hello world!!")
    }
}
