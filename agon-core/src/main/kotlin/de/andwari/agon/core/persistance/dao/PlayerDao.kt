package de.andwari.agon.core.persistance.dao

import de.andwari.agon.core.entity.Player
import de.andwari.agon.core.persistance.dao.util.GenericDao

interface PlayerDao: GenericDao<Player, Long> {
}