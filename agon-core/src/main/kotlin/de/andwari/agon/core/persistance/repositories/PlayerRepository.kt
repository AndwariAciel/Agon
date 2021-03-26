package de.andwari.agon.core.persistance.repositories

import de.andwari.agon.core.persistance.entity.Player

class PlayerRepository: BaseRepository<Player, Long>() {

    init {
        persistedClass = Player::class.java
    }
}