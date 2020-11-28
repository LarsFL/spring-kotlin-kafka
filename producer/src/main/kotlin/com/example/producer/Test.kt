package com.example.producer


import org.apache.kafka.clients.producer.internals.Sender
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class SpringKafkaApplication : CommandLineRunner {
    @Autowired
    private val sender: KafkaProducerController? = null

    @Throws(Exception::class)
    override fun run(vararg strings: String) {
        sender!!.sendMessage()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SpringKafkaApplication::class.java, *args)
        }
    }
}