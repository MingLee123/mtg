package mtg.zones

import mtg.Object

abstract class Zone {
    var objects: MutableCollection<Object> = ArrayList()
}