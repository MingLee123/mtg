package mtg.zones

import mtg.Targetable
import mtg.events.ObjectChangingZone
import mtg.objects.Object

abstract class Zone : Targetable {
    protected open var objects: MutableCollection<Object> = ArrayList()
    fun acquireObject(mtgObject: Object, from: Zone?) {
        this.objects.add(mtgObject)
        from?.objects?.remove(mtgObject)
        ObjectChangingZone(mtgObject.characteristics, this, from)
    }
}