package com.mine.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MineGameApiApplication

fun main(args: Array<String>) {
	runApplication<MineGameApiApplication>(*args)
}
