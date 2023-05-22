package ru.scarletarrow.diplomv1

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null
    private val name: String? = null
}