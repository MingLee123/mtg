package mtg

class Spell(override var controller: Player, override var owner: Player) : Controllable,
        Object(characteristics = ArrayList(), owner = owner, zone = GameState.stack)