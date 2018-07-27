package mtg.objects

import mtg.Player

class CopyOfPermanentCard(override var controller: Player, override val owner: Player) :
        Token(controller = controller, owner = owner)