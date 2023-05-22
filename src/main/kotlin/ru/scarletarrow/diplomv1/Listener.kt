package ru.scarletarrow.diplomv1

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
 class Listener (
    var userVerificationRepository: UserVerificationRepository

) {
    @Autowired
    var javaMailSender: JavaMailSender? = null



    @RabbitListener(queues = ["verificationQueue"])
    fun aaaa(userVerification: UserVerification) {

        var mailMessage = SimpleMailMessage();
        mailMessage.text =
            "Your verification link is http://localhost:8787/${userVerification.username}/${userVerification.verificationString}"
        mailMessage.setTo(userVerification.email)
        mailMessage.from = "testskarlet@yandex.ru"
        mailMessage.subject = "your verification"
        javaMailSender?.send(mailMessage);
        userVerification.isSent = true;
        userVerificationRepository?.save(userVerification);


    }
//    @RabbitListener(queues = [STORE_QUEUE])
//    fun allStoreEvents(message: Any) {
//        logger.info(
//            "Receiving all events " +
//                    "{}", message
//        )
//    }


}