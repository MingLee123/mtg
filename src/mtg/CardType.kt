package mtg

enum class CardType(isPermanentOnly: Boolean, isNonPermanentOnly: Boolean) {
    ARTIFACT(true, false),
    CREATURE(true, false),
    ENCHANTMENT(true, false),
    INSTANT(false, true),
    LAND(true, false),
    PLANESWALKER(true, false),
    SORCERY(false, true),
    TRIBAL(false, false)
}