package mtg

import mtg.events.Event
import mtg.zones.Battlefield
import mtg.zones.Stack

object GameState {
    var activePlayer: Player? = null
    val battlefield: Battlefield = Battlefield
    var events: MutableCollection<Event> = ArrayList()
    val stack: Stack = Stack
}