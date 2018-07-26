package mtg

import mtg.events.Event
import mtg.zones.Battlefield
import mtg.zones.Stack

object GameState {
    val battlefield: Battlefield = Battlefield
    var events: MutableCollection<Event> = ArrayList()
    val stack: Stack = Stack
}