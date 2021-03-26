package de.andwari.agon.core.persistance.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.io.Serializable
import java.util.*

import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity : Serializable {

    companion object {
        private const val serialVersionUID = 20180617104400L
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created: Date? = null

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated: Date? = null

}