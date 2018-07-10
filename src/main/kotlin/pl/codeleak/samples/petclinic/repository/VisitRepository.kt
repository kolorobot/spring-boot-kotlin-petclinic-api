package pl.codeleak.samples.petclinic.repository

import org.springframework.data.repository.PagingAndSortingRepository
import pl.codeleak.samples.petclinic.model.Visit

interface VisitRepository : PagingAndSortingRepository<Visit, Int>
