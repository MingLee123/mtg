package mtg.objects

import mtg.*
import mtg.zones.Zone

interface Object : Localizable, Ownable, Targetable {
    var characteristics: Characteristics

    val isColorless
        get() = characteristics.colors!!.isEmpty()
    val isMonocolored
        get() = characteristics.colors!!.size == 1
    val isMulticolored
        get() = characteristics.colors!!.size > 1

    fun isType(cardType: CardType) = characteristics.cardTypes!!.contains(cardType)
    fun move(zone: Zone) {
        this.zone.objects.remove(this)
        this.zone = zone
        zone.objects.add(this)
    }
}