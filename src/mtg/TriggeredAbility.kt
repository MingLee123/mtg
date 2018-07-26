package mtg

import mtg.events.Event
import java.util.function.Predicate

interface TriggeredAbility : Ability {
    var effects: MutableCollection<Event>
    var preconditions: MutableCollection<Predicate<GameState>>
    var triggeringEvents: MutableCollection<Event>
}