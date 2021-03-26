package de.andwari.agon.core.persistance.repositories

import de.andwari.agon.core.persistance.entity.BaseEntity
import jakarta.inject.Inject
import java.io.Serializable
import javax.persistence.EntityManager

abstract class BaseRepository<T, ID : Serializable> {

    @Inject
    lateinit var entityManager: EntityManager

    lateinit var persistedClass: Class<T>

    fun findById(id: ID): T {
        return entityManager.find(persistedClass, id)
    }

    fun findAll(): MutableList<T> {
        return entityManager.createQuery("from " + persistedClass.name).resultList as MutableList<T>
    }

    fun save(entity: T): T {
        val transaction = entityManager.transaction
        transaction.begin()
        entityManager.persist(entity)
        transaction.commit()
        return entity
    }

    fun update(entity: T): T {
        val transaction = entityManager.transaction
        transaction.begin()
        entityManager.merge(entity) as T
        transaction.commit()
        return entity
    }

    fun delete(entity: T) {
        entityManager.remove(entity)
    }


}