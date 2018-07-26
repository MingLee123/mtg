package mtg

class Token(override var controller: Player, override var owner: Player) :
        Permanent(false, false, false, false, controller, owner)