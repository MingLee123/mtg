package mtg

class Spell(override var controller: Player, override var owner: Player) : Object(controller, owner, GameState.stack)