package mtg

import mtg.events.Event

object GameState {
    var activePlayer: Player? = null
    var players: MutableCollection<Player> = ArrayList()
    var eventsPerSbaCheck: MutableCollection<Event> = ArrayList()
    var eventsPerTurn: MutableCollection<Event> = ArrayList()
}