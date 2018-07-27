package mtg

import mtg.objects.Object

data class Mana(val color: Color?, val consumerRestrictions: Characteristics?, val source: Object)