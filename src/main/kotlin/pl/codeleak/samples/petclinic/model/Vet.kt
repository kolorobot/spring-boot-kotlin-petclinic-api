package pl.codeleak.samples.petclinic.model

import javax.persistence.*

@Entity
@Table(name = "vets", uniqueConstraints = arrayOf(UniqueConstraint(columnNames = arrayOf("first_name", "last_name"))))
class Vet : Person() {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = arrayOf(JoinColumn(name = "vet_id")), inverseJoinColumns = arrayOf(JoinColumn(name = "specialty_id")))
    val specialties: Set<Specialty>? = null
}
