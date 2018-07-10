package pl.codeleak.samples.petclinic.model


import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "vet_addresses")
data class VetAddress(
        @Column(name = "postal_code")
        @NotBlank
        var postalCode: String? = null,
        @Column(name = "city")
        @NotBlank
        var city: String? = null,
        @Column(name = "province")
        @NotBlank
        var province: String? = null,
        @OneToOne(optional = false)
        @JoinColumn(name = "vet_id")
        var vet: Vet? = null
) : BaseEntity()
