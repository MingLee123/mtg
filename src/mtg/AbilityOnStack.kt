package mtg

import mtg.zones.Stack

class AbilityOnStack(controller: Player, owner: Player, stack: Stack, targets: MutableCollection<Targetable>) :
        Controllable, Object(controller, owner, stack)