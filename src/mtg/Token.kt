package mtg

import mtg.zones.Zone

class Token(override var controller: Player, override var owner: Player,
            characteristics: MutableCollection<Collection<Characteristic>>, zone: Zone, override var isTapped: Boolean,
            override var isFlipped: Boolean, override var isFaceUp: Boolean, override var isPhasedIn: Boolean) :
        Object(characteristics, owner, zone), Permanent