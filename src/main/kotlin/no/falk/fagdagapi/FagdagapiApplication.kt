package no.falk.fagdagapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FagdagapiApplication

fun main(args: Array<String>) {
    runApplication<FagdagapiApplication>(*args)
}
