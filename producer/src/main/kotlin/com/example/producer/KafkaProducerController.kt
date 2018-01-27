package com.example.producer

import org.springframework.http.ResponseEntity
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class KafkaProducerController(val kafkaTemplate: KafkaTemplate<String, String>) {
    @GetMapping("/person/{name}")
    fun getPerson(@PathVariable name: String): ResponseEntity<String> {
//        val person = personRepository.findById(name)
        val person = Optional.of("Some person name")

        return if (person.isPresent) {
            kafkaTemplate.send("Topic1", "GET /person/name OK > " + name)
            ResponseEntity.ok(person.get())
        } else {
            kafkaTemplate.send("Topic1", "GET /person/name BadRequest > " + name)
            ResponseEntity.badRequest().body(null)
        }
    }
}