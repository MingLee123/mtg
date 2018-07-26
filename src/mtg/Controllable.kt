package mtg

interface Controllable : Ownable {
    var controller: Player
}