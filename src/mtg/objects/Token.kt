package mtg.objects

import mtg.Characteristics
import mtg.Player
import mtg.zones.Battlefield
import mtg.zones.Zone

open class Token(override var isTapped: Boolean = false, override var isFlipped: Boolean = false,
                 override var isFaceUp: Boolean = false, override var isPhasedIn: Boolean = false,
                 override var controller: Player, override val owner: Player,
                 override var characteristics: Characteristics = Characteristics(),
                 override var zone: Zone = Battlefield) : Permanent