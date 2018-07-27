package mtg.objects

import mtg.Characteristics
import mtg.Player
import mtg.zones.Stack
import mtg.zones.Zone

class CopyOfSpellCard(override var controller: Player, override val owner: Player,
                      override var characteristics: Characteristics, override var zone: Zone = Stack) : Spell