package com.squarefeets.demo;

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

@Bean
fun runAtStartup(userServiceImpl: UserServiceImpl): CommandLineRunner {
	return CommandLineRunner {
		userServiceImpl.saveSampleUser()
	}
}}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
