package ru.scarletarrow.diplomv1

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository("UserVerificationRepository")
interface UserVerificationRepository : JpaRepository<UserVerification?, Int?> {
    fun findByVerificationString(verificationString: String?): UserVerification?
}