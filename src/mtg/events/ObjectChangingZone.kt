package mtg.events

import mtg.objects.Object
import mtg.zones.Zone

class ObjectChangingZone(private val mtgObject: Object, private val newZone: Zone, private val oldZone: Zone?) :
        Event() {
    override fun takeEffect() {
        super.takeEffect()
        oldZone?.objects?.remove(mtgObject)
        newZone.objects.add(mtgObject)
        mtgObject.zone = newZone
    }
}