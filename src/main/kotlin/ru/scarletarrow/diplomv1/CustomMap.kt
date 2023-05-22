package ru.scarletarrow.diplomv1

import jakarta.persistence.Column
import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.util.*

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class CustomMap {
    override fun toString(): String {
        return "CustomMap{" +
                "uuid=" + uuid +
                ", mapName='" + mapName + '\'' +
                ", mapType=" + customMapTypeClass +
                ", countries=" + countries +
                '}'
    }

    @Id
    private val uuid: UUID? = null
    private val mapName: String? = null

    @OneToOne
    private val customMapTypeClass: CustomMapTypeClass? = null

    @ElementCollection
    private val countries: List<Countries>? = null

    @OneToOne(fetch = FetchType.EAGER)
    private val owner: AppUser? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    var created: Calendar? = null

    @Column(name = "updated_at", nullable = true, updatable = true)
    var updated: Calendar? = null
}