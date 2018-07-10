package pl.codeleak.samples.petclinic.model

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "types")
class PetType : NamedEntity()
