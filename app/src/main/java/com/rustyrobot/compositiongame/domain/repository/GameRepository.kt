package com.rustyrobot.compositiongame.domain.repository

import com.rustyrobot.compositiongame.domain.entity.GameSettings
import com.rustyrobot.compositiongame.domain.entity.Level
import com.rustyrobot.compositiongame.domain.entity.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question
    fun getGameSettings(level: Level): GameSettings
}