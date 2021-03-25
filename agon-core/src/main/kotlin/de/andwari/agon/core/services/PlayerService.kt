package de.andwari.agon.core.services

import de.andwari.agon.core.entity.Player

interface PlayerService {

    fun save(player: Player): Player
}