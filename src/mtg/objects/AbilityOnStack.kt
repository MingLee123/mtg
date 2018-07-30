package mtg.objects

import mtg.Ability
import mtg.Characteristics
import mtg.Controllable
import mtg.Player

class AbilityOnStack(override var controller: Player, override val owner: Player,
                     override var characteristics: Characteristics) : Ability, Controllable, Object