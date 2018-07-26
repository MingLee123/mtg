package mtg

interface Permanent : Controllable {
    var isTapped: Boolean
    var isFlipped: Boolean
    var isFaceUp: Boolean
    var isPhasedIn: Boolean
}