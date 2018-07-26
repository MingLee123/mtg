package mtg

import mtg.zones.Zone

open class Object(override var controller: Player, override var owner: Player, private var zone: Zone) : Controllable {
    private var characteristics: MutableCollection<Collection<Characteristic>> = ArrayList()
    fun move(zone: Zone) {
        this.zone.objects.remove(this)
        this.zone = zone
        zone.objects.add(this)
    }

    fun getCharacteristic(characteristicClass: Class<in Characteristic>): Collection<Characteristic> {
        for (characteristic in characteristics) {
            if (characteristic::class == characteristicClass) return characteristic
        }
        return ArrayList()
    }
    fun isColorless() = getCharacteristic(Color::class).isEmpty()
}