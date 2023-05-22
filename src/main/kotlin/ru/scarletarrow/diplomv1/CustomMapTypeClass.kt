package ru.scarletarrow.diplomv1

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
class CustomMapTypeClass {
    @Id
    @GeneratedValue
    private val id: Long? = null
    private val customMapType: String? = null
}