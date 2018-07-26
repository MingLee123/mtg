package mtg.events

import mtg.Mana

class ManaPoolChange(private val manaPool: MutableMap<Mana, Int>, private val mana: Mana, private val amount: Int) :
        Event() {
    override fun takeEffect() {
        if (manaPool.getOrDefault(mana, 0) + amount == 0) {
            manaPool.remove(mana)
        } else manaPool.merge(mana, amount) { a, b -> a + b }
    }
}