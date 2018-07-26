package mtg

import mtg.zones.Zone
import kotlin.reflect.KClass

open class Object(override var controller: Player, override var owner: Player, override var zone: Zone) : Controllable,
        Localizable, Targetable {

    private var characteristics: MutableCollection<Collection<Characteristic>> = ArrayList()
    private fun getCharacteristic(characteristicClass: KClass<out Characteristic>): Collection<Characteristic> {
        for (characteristic in characteristics) {
            if (characteristic::class == characteristicClass) return characteristic
        }
        return ArrayList()
    }

    fun isColorless() = getCharacteristic(Color::class).isEmpty()
    fun isMonocolored() = getCharacteristic(Color::class).size == 1
    fun isMultiColored() = getCharacteristic(Color::class).size > 1
    fun isType(type: Type) = getCharacteristic(Type::class).contains(type)
    fun move(zone: Zone) {
        this.zone.objects.remove(this)
        this.zone = zone
        zone.objects.add(this)
    }

    fun setCharacteristic(characteristic: Collection<Characteristic>) {
        characteristics.removeIf { c -> c::class == characteristic::class }
        characteristics.add(characteristic)
    }
}