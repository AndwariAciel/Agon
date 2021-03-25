package de.andwari.agon.core.persistance

import jakarta.enterprise.inject.Produces
import javax.persistence.EntityManager
import javax.persistence.Persistence

class EntityManagerProducer {

    @Produces
    fun createEntityManager(): EntityManager {
        return Persistence.createEntityManagerFactory("AGON_DATABASE").createEntityManager()
    }
}