package mtg.objects

import mtg.Characteristics
import mtg.Player
import mtg.zones.Stack
import mtg.zones.Zone

class SpellCard(override var characteristics: Characteristics, override var zone: Zone = Stack,
                override val owner: Player, override var controller: Player) : Card, Spell