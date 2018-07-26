package mtg

import mtg.zones.Library

class Player(library: Library = Library(), life: Int = 20, manaPool: Map<Mana, Int> = HashMap()) : Targetable