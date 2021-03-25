package de.andwari.agon.core.persistance.dao.jpa

import de.andwari.agon.core.entity.Player
import de.andwari.agon.core.persistance.dao.util.GenericJpaDao
import de.andwari.agon.core.persistance.dao.PlayerDao

class PlayerJpaDao: GenericJpaDao<Player, Long>(), PlayerDao {

    init {
        persistedClass = Player::class.java
    }
}