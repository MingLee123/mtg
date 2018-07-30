package mtg.events

import mtg.Characteristics
import mtg.zones.Zone

class ObjectChangingZone(private val characteristics: Characteristics, private val newZone: Zone,
                         private val oldZone: Zone?) : Event()