package pl.codeleak.samples.petclinic.model

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "specialties")
class Specialty : NamedEntity()
