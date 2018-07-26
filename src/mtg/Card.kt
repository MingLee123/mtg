package mtg

import mtg.zones.Zone

class Card(characteristics: MutableCollection<Collection<Characteristic>>, owner: Player, zone: Zone) :
        Object(characteristics, owner, zone)