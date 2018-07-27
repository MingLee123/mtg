package mtg.objects

import mtg.Controllable

interface Permanent : Controllable, Object {
    var isTapped: Boolean
    var isFlipped: Boolean
    var isFaceUp: Boolean
    var isPhasedIn: Boolean
}