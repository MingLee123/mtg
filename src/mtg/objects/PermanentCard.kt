package mtg.objects

import mtg.Characteristics
import mtg.Player

class PermanentCard(override var characteristics: Characteristics, override val owner: Player,
                    override var isTapped: Boolean = false, override var isFlipped: Boolean = false,
                    override var isFaceUp: Boolean = false, override var isPhasedIn: Boolean = false,
                    override var controller: Player) : Card, Permanent