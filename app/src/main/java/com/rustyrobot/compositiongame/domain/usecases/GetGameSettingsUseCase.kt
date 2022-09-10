package com.rustyrobot.compositiongame.domain.usecases

import com.rustyrobot.compositiongame.domain.entity.GameSettings
import com.rustyrobot.compositiongame.domain.entity.Level
import com.rustyrobot.compositiongame.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }


}