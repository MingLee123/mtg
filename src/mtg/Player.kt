package mtg

import mtg.objects.Card

class Player(mainDeck: Collection<Card>, sideboard: Collection<Card>, life: Int = 20,
             manaPool: Map<Mana, Int>) : Targetable