package ru.scarletarrow.diplomv1//package ru.scarletarrow.mailsenderlatest
//
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class VerificationController(
    private val userVerificationRepository: UserVerificationRepository,
    private val appUserRepository: AppUserRepository
) {
//    @GetMapping("{userName}/{verification}")
//    fun verify(@PathVariable userName: String, @PathVariable verification: String): ResponseEntity<*> {
//        val userVerification = userVerificationRepository.findByVerificationString(verification)
//        return if (userVerification.username != userName)
//            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR")
//        else {
//            userVerification.isPressed = true
//            userVerificationRepository.save(userVerification)
//            var findByUsername = appUserRepository.findByUsername(userName)
//            findByUsername.isVerified = true
//            appUserRepository.save(findByUsername)
//            ResponseEntity.status(HttpStatus.OK).body("Verified")
//        }
//    }

    @GetMapping("/{userName}/{verification}")
    fun verify(@PathVariable userName: String?, @PathVariable verification: String?): ResponseEntity<*>? {
        val userVerification = userVerificationRepository.findByVerificationString(verification)
        return if (userVerification!!.username != userName) ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body("ERROR")
        else {
            userVerification.isPressed = true
            userVerificationRepository.save(userVerification)
            val findByUsername = appUserRepository.findByUsername(userName)
            findByUsername!!.isVerified = true
            appUserRepository.save(findByUsername)
            ResponseEntity.status(HttpStatus.OK).body("Verified")
        }
    }
}