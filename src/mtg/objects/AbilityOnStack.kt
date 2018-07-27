package mtg.objects

import mtg.*
import mtg.zones.Stack
import mtg.zones.Zone

class AbilityOnStack(override var controller: Player, override val owner: Player,
                     override var characteristics: Characteristics, override var zone: Zone = Stack) :
        Ability, Controllable, Object