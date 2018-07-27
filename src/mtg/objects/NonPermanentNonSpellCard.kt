package mtg.objects

import mtg.Characteristics
import mtg.Player
import mtg.zones.Zone

class NonPermanentNonSpellCard(override var characteristics: Characteristics, override var zone: Zone,
                               override val owner: Player) : Card