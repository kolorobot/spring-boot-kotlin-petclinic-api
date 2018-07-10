package pl.codeleak.samples.petclinic.repository

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import pl.codeleak.samples.petclinic.model.Owner

interface OwnerRepository : PagingAndSortingRepository<Owner, Int> {
    fun findBylastName(@Param("lastName") lastName: String): List<Owner>
}
