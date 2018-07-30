package mtg.objects

import mtg.CardType
import mtg.Characteristics
import mtg.Ownable
import mtg.Targetable

interface Object : Ownable, Targetable {
    var characteristics: Characteristics

    val isColorless
        get() = characteristics.colors!!.isEmpty()
    val isMonocolored
        get() = characteristics.colors!!.size == 1
    val isMulticolored
        get() = characteristics.colors!!.size > 1

    fun isType(cardType: CardType) = characteristics.cardTypes!!.contains(cardType)
}