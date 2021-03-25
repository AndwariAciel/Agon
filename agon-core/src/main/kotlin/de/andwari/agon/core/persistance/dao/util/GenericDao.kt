package de.andwari.agon.core.persistance.dao.util

import java.io.Serializable

interface GenericDao<T, ID : Serializable> {

    fun save(entity: T): T
    fun update(entity: T): T
    fun delete(entity: T)
    fun findById(id: ID): T
    fun findAll(): MutableList<T>

}