package de.andwari.agon.business.service

import de.andwari.agon.core.persistance.entity.Player
import de.andwari.agon.core.services.PlayerPersistenceService
import jakarta.inject.Inject

class PlayerService {

    @Inject
    lateinit var playerService: PlayerPersistenceService

    fun save(player: Player) : Player {
        return playerService.save(player)
    }
}