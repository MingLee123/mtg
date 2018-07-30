package mtg.objects

import mtg.Characteristics
import mtg.Player

class SpellCard(override var characteristics: Characteristics, override val owner: Player,
                override var controller: Player) : Card, Spell