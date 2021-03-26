package de.andwari.agon.core.services

import de.andwari.agon.core.persistance.entity.Player
import de.andwari.agon.core.persistance.repositories.PlayerRepository
import jakarta.inject.Inject

class PlayerPersistenceService {

    @Inject
    lateinit var playerRepository: PlayerRepository

    fun save(player: Player): Player {
        return playerRepository.save(player)
    }
}