package pl.codeleak.samples.petclinic.model

import org.springframework.format.annotation.DateTimeFormat

import javax.persistence.*
import java.time.LocalDateTime
import javax.validation.constraints.NotEmpty

@Entity
@Table(name = "visits")
data class Visit(
        @Column(name = "visit_date")
        @DateTimeFormat(pattern = "yyyy/MM/dd")
        var date: LocalDateTime? = LocalDateTime.now(),

        @NotEmpty
        @Column(name = "description")
        var description: String? = null,

        @ManyToOne
        @JoinColumn(name = "pet_id")
        var pet: Pet? = null
) : BaseEntity()