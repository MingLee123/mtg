package mtg

open class Permanent(isTapped: Boolean = false, isFlipped: Boolean = false, isFaceUp: Boolean = false,
                isPhasedIn: Boolean = false, override var controller: Player, override var owner: Player) :
        Object(controller, owner, GameState.battlefield)