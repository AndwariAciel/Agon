package de.andwari.agon.core.entity

import javax.persistence.*

@Entity
open class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Int? = null

    @Column(nullable = false)
    open var username: String? = null
}