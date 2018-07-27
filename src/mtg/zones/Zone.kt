package mtg.zones

import mtg.objects.Object

abstract class Zone {
    var objects: MutableCollection<Object> = ArrayList()
}