//package ru.scarletarrow.diplomv1;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Objects;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/")
//public class VerificationControllerJ {
//    private final UserVerificationRepository userVerificationRepository;
//    private final AppUserRepository appUserRepository;
//
//    @GetMapping("/{userName}/{verification}")
//    public ResponseEntity<?> verify(@PathVariable String userName, @PathVariable String verification) {
//        var userVerification= userVerificationRepository.findByVerificationString(verification);
//         if (!Objects.equals(userVerification.username, userName))
//             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
//        else {
//            userVerification.isPressed = true;
//            userVerificationRepository.save(userVerification);
//            var findByUsername = appUserRepository.findByUsername(userName);
//            findByUsername.isVerified = true;
//            appUserRepository.save(findByUsername);
//             return  ResponseEntity.status(HttpStatus.OK).body("Verified");
//        }
//    }
//}
