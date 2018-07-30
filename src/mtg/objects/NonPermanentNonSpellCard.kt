package mtg.objects

import mtg.Characteristics
import mtg.Player

class NonPermanentNonSpellCard(override var characteristics: Characteristics, override val owner: Player) : Card