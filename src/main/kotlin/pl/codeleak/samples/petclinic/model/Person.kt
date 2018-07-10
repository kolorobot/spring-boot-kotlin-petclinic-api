package pl.codeleak.samples.petclinic.model

import javax.persistence.Column
import javax.persistence.MappedSuperclass
import javax.validation.constraints.NotEmpty

@MappedSuperclass
open class Person : BaseEntity() {

    @Column(name = "first_name")
    @NotEmpty
    var firstName: String? = null

    @Column(name = "last_name")
    @NotEmpty
    var lastName: String? = null

}
