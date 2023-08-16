package com.example.wizard101wiki

class MyRepository {

    fun getAllActivities(): List<WizActivities> {
        return listOf(
            WizActivities(
                R.string.questing,
                R.drawable.ic_questing
            ),
            WizActivities(R.string.pvp,
                R.drawable.ic_arena_tickets
            ),
            WizActivities(R.string.mini_games,
                R.drawable.ic_mini_games
            ),
            WizActivities(R.string.housing,
                R.drawable.ic_home
            ),
            WizActivities(R.string.castle_magic,
                R.drawable.ic_castle_magic
            ),
            WizActivities(R.string.crafting,
                R.drawable.ic_crafting
            ),
            WizActivities(R.string.pet_training,
                R.drawable.ic_pet_training
            ),
            WizActivities(R.string.gardening,
                R.drawable.ic_gardening
            ),
            WizActivities(R.string.fishing,
                R.drawable.ic_fishing
            ),
            WizActivities(R.string.jewel_socketing,
                R.drawable.ic_jewel
            ),
            WizActivities(R.string.monstrology,
                R.drawable.ic_monstrology
            ),
            WizActivities(R.string.deckathalons,
                R.drawable.ic_deckathalons
            ),
        )
    }
}