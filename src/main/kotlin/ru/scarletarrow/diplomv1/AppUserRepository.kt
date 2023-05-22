package ru.scarletarrow.diplomv1

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository(value = "AppUserRepository")
interface AppUserRepository : JpaRepository<AppUser?, Long?> {
    fun findByUsername(username: String?): AppUser?
    fun existsByUsername(username: String?): Boolean
}