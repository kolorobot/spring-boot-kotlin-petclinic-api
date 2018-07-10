package pl.codeleak.samples.petclinic.model

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    val isNew: Boolean
        @JsonIgnore
        get() = this.id == null

}
