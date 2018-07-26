package mtg

class AbilityOnStack(override var controller: Player, source: Object, targets: Collection<Targetable>) : Controllable,
        Object(characteristics = ArrayList(), owner = source.owner, zone = GameState.stack)