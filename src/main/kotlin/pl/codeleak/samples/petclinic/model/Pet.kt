package pl.codeleak.samples.petclinic.model

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import javax.persistence.*


@Entity
@Table(name = "pets")
data class Pet(
        @Column(name = "birth_date")
        @DateTimeFormat(pattern = "yyyy/MM/dd")
        var birthDate: LocalDate? = null,

        @ManyToOne
        @JoinColumn(name = "type_id")
        var type: PetType? = null,

        @ManyToOne(cascade = arrayOf(CascadeType.ALL), optional = true)
        @JoinColumn(name = "owner_id")
        var owner: Owner? = null,

        @OneToMany(cascade = arrayOf(CascadeType.ALL), mappedBy = "pet", fetch = FetchType.EAGER)
        val visits: Set<Visit>? = null
) : NamedEntity()