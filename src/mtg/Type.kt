package mtg

enum class Type(isPermanentOnly: Boolean, isNonPermanentOnly: Boolean) : Characteristic {
    ARTIFACT(true, false), CREATURE(true, false), ENCHANTMENT(true, false), INSTANT(false, true), LAND(true, false),
    PLANESWALKER(true, false), SORCERY(false, true), TRIBAL(false, false)
}