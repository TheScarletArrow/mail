package ru.scarletarrow.diplomv1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ListenerJ {
    @Autowired UserVerificationRepository userVerificationRepository;

    @Autowired
    JavaMailSender javaMailSender;



//    @RabbitListener(queues = "verificationQueue")
//    public void read(String userVerification){
//        log.info("received "+userVerification);
////        var mailMessage = new SimpleMailMessage();
////        mailMessage.setText("Your verification link is http://localhost:8787/"+userVerification.username+"/"+userVerification.verificationString);
////        mailMessage.setTo(userVerification.email);
////        mailMessage.setFrom("testskarlet@yandex.ru");
////        mailMessage.setSubject("your verification");
////        javaMailSender.send(mailMessage);
////        log.info("sent mail");
////        userVerification.setIsSent(true);
////        userVerificationRepository.save(userVerification);
//    }

}
