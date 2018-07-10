package pl.codeleak.samples.petclinic.model

import javax.persistence.*
import javax.validation.constraints.Digits
import javax.validation.constraints.NotEmpty


@Entity
@Table(name = "owners")
data class Owner(
        @Column(name = "address")
        @NotEmpty
        var address: String? = null,

        @Column(name = "city")
        @NotEmpty
        var city: String? = null,

        @Column(name = "telephone")
        @NotEmpty
        @Digits(fraction = 0, integer = 10)
        var telephone: String? = null,

        @OneToMany(mappedBy = "owner", cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
        val pets: Set<Pet>? = null

) : Person()
