package mtg

import mtg.zones.Zone

class AbilityOnStack(controller: Player, owner: Player, zone: Zone, targets: MutableCollection<Targetable>) :
        Controllable, Object(controller, owner, zone) {}