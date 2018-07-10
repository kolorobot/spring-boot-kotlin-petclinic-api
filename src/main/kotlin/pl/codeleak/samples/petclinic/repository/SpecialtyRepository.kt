package pl.codeleak.samples.petclinic.repository

import org.springframework.data.repository.PagingAndSortingRepository
import pl.codeleak.samples.petclinic.model.Specialty

interface SpecialtyRepository : PagingAndSortingRepository<Specialty, Int>
