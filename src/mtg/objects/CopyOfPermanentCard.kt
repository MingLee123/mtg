package mtg.objects

import mtg.Characteristics
import mtg.Player

class CopyOfPermanentCard(override var controller: Player, override val owner: Player, override var characteristics: Characteristics) :
        Token(controller = controller, owner = owner, characteristics = characteristics)