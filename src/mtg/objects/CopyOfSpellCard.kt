package mtg.objects

import mtg.Characteristics
import mtg.Player

class CopyOfSpellCard(override var controller: Player, override val owner: Player,
                      override var characteristics: Characteristics) : Spell