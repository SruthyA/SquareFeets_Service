package com.squarefeet.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class ConfigCheck(
        @Value("\${spring.data.cassandra.local-datacenter:NOT_FOUND}")
        private val dc: String
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Loaded Cassandra DC = $dc")
    }
}
