package pl.codeleak.samples.petclinic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetclinicApiApplication

fun main(args: Array<String>) {
    runApplication<PetclinicApiApplication>(*args)
}
