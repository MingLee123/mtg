package mtg

/**
 * 109.3. An object’s characteristics are name, mana cost, color, color indicator, card type, subtype, supertype, rules
 * text, abilities, power, toughness, loyalty, hand modifier, and life modifier. Objects can have some or all of these
 * characteristics. Any other information about an object isn’t a characteristic. For example, characteristics don’t
 * include whether a permanent is tapped, a spell’s target, an object’s owner or controller, what an Aura enchants, and
 * so on.
 */
data class Characteristics(val name: String? = null, val manaCost: ManaCost? = null,
                           var colors: Collection<Color>? = null, val colorIndicator: Color? = null,
                           var cardTypes: Collection<CardType>? = null, var subtypes: Collection<String>? = null,
                           var supertypes: Collection<String>? = null, var rulesText: String? = null,
                           var abilities: Collection<Ability>? = null, var power: Int? = null,
                           var toughness: Int? = null, var loyalty: Int? = null, val handModifier: Int? = null,
                           val lifeModifier: Int? = null)