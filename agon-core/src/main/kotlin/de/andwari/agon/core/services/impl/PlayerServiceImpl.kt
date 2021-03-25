package de.andwari.agon.core.services.impl

import de.andwari.agon.core.entity.Player
import de.andwari.agon.core.persistance.dao.PlayerDao
import de.andwari.agon.core.services.PlayerService
import jakarta.inject.Inject

class PlayerServiceImpl : PlayerService {

    @Inject
    lateinit var playerDao: PlayerDao

    override fun save(player: Player): Player {
        return playerDao.save(player)
    }
}