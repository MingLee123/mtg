package mtg

data class Mana(val color: Color?, val consumerRestrictions: Collection<Characteristic>, val source: Object)