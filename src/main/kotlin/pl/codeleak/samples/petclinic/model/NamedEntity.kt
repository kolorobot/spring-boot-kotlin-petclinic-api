package pl.codeleak.samples.petclinic.model

import javax.persistence.Column
import javax.persistence.MappedSuperclass


@MappedSuperclass
open class NamedEntity : BaseEntity() {
    @Column(name = "name")
    var name: String? = null
}
