package mtg.events

import mtg.GameState

abstract class Event {
    open fun takeEffect() {
        GameState.eventsPerSbaCheck.add(this)
    }
}