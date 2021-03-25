package de.andwari.agon.core.entity

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Player : BaseEntity() {

    @Column(nullable = false, unique = true)
    var name: String? = null

    @Column(unique = true)
    var dci: String? = null

    var member: Boolean? = null
}