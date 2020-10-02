package micronaut.general

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Email

/**
 * @author Lukasz Frankowski
 */
@Introspected
open class SuperClass: IEmail {

    @Email
    override fun getEmail(): String = "a@a.pl"
    
}
