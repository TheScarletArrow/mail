/*
 * Copyright (c) 2023. Program made by Anton Yurkov.
 */
package ru.scarletarrow.diplomv1

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.Getter
import lombok.Setter
import java.io.Serializable

@Entity
@Getter
@Setter
open class UserVerification : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private val id: Int? = null

    @JvmField
    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("verificationString")
    var verificationString: String? = null

    @JsonProperty("isSent")

    var isSent: Boolean? = null

    @JvmField
    @JsonProperty("isPressed")

    var isPressed: Boolean? = null
    @JsonProperty("email")
    var email: String? = null
}