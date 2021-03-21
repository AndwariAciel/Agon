package de.andwari.agon.core

import de.andwari.agon.core.entity.MyUser
import javax.persistence.Persistence

class EmTest {

    fun  test() {
        val em = Persistence.createEntityManagerFactory("AGON_DATABASE").createEntityManager()
        val transaction = em.transaction
        val user = MyUser()
        user.username = "Markus"

        transaction.begin()
        em.persist(user)
        transaction.commit()
        em.close()


    }
}