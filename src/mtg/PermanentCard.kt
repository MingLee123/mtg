package mtg

class PermanentCard(override var controller: Player, override var owner: Player) : Card,
        Permanent(false, false, false, false, controller, owner)