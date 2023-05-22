package ru.scarletarrow.diplomv1

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import lombok.ToString
import org.hibernate.Hibernate

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@JsonIgnoreProperties("hibernateLazyInitializer", "handler")
open class AppUser() {
    override fun toString(): String {
        return "AppUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", middleName='" + middleName + '\'' +
                ", isVerified=" + isVerified +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", isAccountNonExpired=" + isAccountNonExpired +
                ", isAccountNonLocked=" + isAccountNonLocked +
                ", isCredentialsNonExpired=" + isCredentialsNonExpired +
                ", isEnabled=" + isEnabled +
                ", roles=" + roles +
                ", maps=" + maps +
                '}'
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long? = null
    private lateinit var name: String

    @Column(unique = true)
    private lateinit var username: String
    private lateinit var middleName: String
    @JvmField
    var isVerified: Boolean = false
    private var password: String? = null
    private lateinit var email: String
    private var isAccountNonExpired: Boolean = false
    private var isAccountNonLocked: Boolean = false
    private var isCredentialsNonExpired: Boolean = false
    private var isEnabled: Boolean = false

    @ManyToMany(fetch = FetchType.LAZY)
    private var roles: List<Role> = ArrayList()

    @OneToMany(fetch = FetchType.LAZY)
    @ToString.Exclude
    @JsonIgnore
    private val maps: Collection<CustomMap> = ArrayList()


}