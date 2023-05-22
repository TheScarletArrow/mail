package ru.scarletarrow.diplomv1

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MailSenderLatestApplication

fun main(args: Array<String>) {
	runApplication<MailSenderLatestApplication>(*args)
}
