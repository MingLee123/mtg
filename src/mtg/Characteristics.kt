package mtg

data class Characteristics(val name: String? = null, val manaCost: ManaCost? = null,
                           var colors: Collection<Color>? = null, val colorIndicator: Color? = null,
                           var cardTypes: Collection<CardType>? = null, var subtypes: Collection<String>? = null,
                           var supertypes: Collection<String>? = null, var rulesText: String? = null,
                           var abilities: Collection<Ability>? = null, var power: Int? = null,
                           var toughness: Int? = null, var loyalty: Int? = null, val handModifier: Int? = null,
                           val lifeModifier: Int? = null)