package mtg

class StateBasedActionExecutor {
    /**
     * 704.5a If a player has 0 or less life, that player loses the game.
     */
    fun sbaA() {
        for (player in GameState.players) {
            if (player.life < 1) GameState.players.remove(player)
        }
    }

    /**
     * 704.5b If a player attempted to draw a card from a library with no cards in it since the last time
    state-based actions were checked, that player loses the game.
     */
    fun sbaB() {}

    /**
     * 704.5c If a player has ten or more poison counters, that player loses the game. Ignore this rule in
    Two-Headed Giant games; see rule 704.5u instead.
     */
    fun sbaC() {}

    /**
     * 704.5d If a token is in a zone other than the battlefield, it ceases to exist.
     */
    fun sbaD() {}

    /**
     * 704.5e If a copy of a spell is in a zone other than the stack, it ceases to exist. If a copy of a card is in
    any zone other than the stack or the battlefield, it ceases to exist.
     */
    fun sbaE() {}

    /**
     * 704.5f If a creature has toughness 0 or less, it’s put into its owner’s graveyard. Regeneration can’t
    replace this event.
     */
    fun sbaF() {}

    /**
     * 704.5g If a creature has toughness greater than 0, and the total damage marked on it is greater than
    or equal to its toughness, that creature has been dealt lethal damage and is destroyed.
    Regeneration can replace this event.
     */
    fun sbaG() {}

    /**
     * 704.5h If a creature has toughness greater than 0, and it’s been dealt damage by a source with
    deathtouch since the last time state-based actions were checked, that creature is destroyed.
    Regeneration can replace this event.
     */
    fun sbaH() {}

    /**
     * 704.5i If a planeswalker has loyalty 0, it’s put into its owner’s graveyard.
     */
    fun sbaI() {}

    /**
     * 704.5j If a player controls two or more legendary permanents with the same name, that player
    chooses one of them, and the rest are put into their owners’ graveyards. This is called the
    “legend rule.”
     */
    fun sbaJ() {}

    /**
     * 704.5k If two or more permanents have the supertype world, all except the one that has had the
    world supertype for the shortest amount of time are put into their owners’ graveyards. In the
    event of a tie for the shortest amount of time, all are put into their owners’ graveyards. This is
    called the “world rule.”
     */
    fun sbaK() {}

    /**
     * 704.5m If an Aura is attached to an illegal object or player, or is not attached to an object or player,
    that Aura is put into its owner’s graveyard.
     */
    fun sbaM() {}

    /**
     * 704.5n If an Equipment or Fortification is attached to an illegal permanent, it becomes unattached
    from that permanent. It remains on the battlefield.
     */
    fun sbaN() {}

    /**
     * 704.5p If a creature is attached to an object or player, it becomes unattached and remains on the
    battlefield. Similarly, if a permanent that’s neither an Aura, an Equipment, nor a Fortification is
    attached to an object or player, it becomes unattached and remains on the battlefield.
     */
    fun sbaP() {}

    /**
     * 704.5q If a permanent has both a +1/+1 counter and a -1/-1 counter on it, N +1/+1 and N -1/-1
    counters are removed from it, where N is the smaller of the number of +1/+1 and -1/-1 counters
    on it.
     */
    fun sbaQ() {}

    /**
     * 704.5r If a permanent with an ability that says it can’t have more than N counters of a certain kind
    on it has more than N counters of that kind on it, all but N of those counters are removed from
    it.
     */
    fun sbaR() {}

    /**
     * 704.5s If the number of lore counters on a Saga permanent is greater than or equal to its final
    chapter number and it isn’t the source of a chapter ability that has triggered but not yet left the
    stack, that Saga’s controller sacrifices it. See rule 714, “Saga Cards.”
     */
    fun sbaS() {}

    /**
     * 704.5t In a Two-Headed Giant game, if a team has 0 or less life, that team loses the game. See rule
    810, “Two-Headed Giant Variant.”
     */
    fun sbaT() {}

    /**
     * 704.5u In a Two-Headed Giant game, if a team has fifteen or more poison counters, that team loses
    the game. See rule 810, “Two-Headed Giant Variant.”
     */
    fun sbaU() {}

    /**
     * 704.5v In a Commander game, a player that’s been dealt 21 or more combat damage by the same
    commander over the course of the game loses the game. See rule 903, “Commander.”
     */
    fun sbaV() {}

    /**
     * 704.5w In an Archenemy game, if a non-ongoing scheme card is face up in the command zone, and
    no triggered abilities of any scheme are on the stack or waiting to be put on the stack, that
    scheme card is turned face down and put on the bottom of its owner’s scheme deck. See rule
    904, “Archenemy.”
     */
    fun sbaW() {}

    /**
     * 704.5x In a Planechase game, if a phenomenon card is face up in the command zone, and it isn’t the
    source of a triggered ability that has triggered but not yet left the stack, the planar controller
    planeswalks. See rule 901, “Planechase.”
     */
    fun sbaX() {}
}