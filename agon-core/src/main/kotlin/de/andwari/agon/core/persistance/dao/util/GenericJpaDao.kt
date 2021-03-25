package de.andwari.agon.core.persistance.dao.util

import jakarta.inject.Inject
import java.io.Serializable
import javax.persistence.EntityManager

abstract class GenericJpaDao<T, ID : Serializable> : GenericDao<T, ID> {

    @Inject
    lateinit var entityManager: EntityManager

    lateinit var persistedClass: Class<T>

    override fun findById(id: ID): T {
        return entityManager.find(persistedClass, id)
    }

    override fun findAll(): MutableList<T> {
        return entityManager.createQuery("from " + persistedClass.name).resultList as MutableList<T>
    }

    override fun save(entity: T): T {
        val transaction = entityManager.transaction
        transaction.begin()
        val savedEntity = entityManager.persist(entity) as T
        transaction.commit()
        return savedEntity
    }

    override fun update(entity: T): T {
        return entityManager.merge(entity) as T
    }

    override fun delete(entity: T) {
        entityManager.remove(entity)
    }


}