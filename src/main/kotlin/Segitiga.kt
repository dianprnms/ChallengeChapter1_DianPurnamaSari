import oop_solid.BangunDatar

open class Segitiga() : BangunDatar(){
    var baris : Int = 0
    var spasi : Int = baris - 1
    var btg : Int = 1
    val bintang : String = "*"

    constructor(_baris:Int) : this() {
        this.baris = _baris
    }

    override fun jenisBangunDatar(jenis: String) {
       super.jenisBangunDatar(jenis)
    }

    override fun sgtg() {
        var spasi = baris - 1
        var btg = 1
        for (i in 1..baris) {
            for (j in 1..spasi) {
                print(" ")
            }
            spasi--
            for (k in 1..btg) {
                print(bintang)
            }
            btg += 2
            println()
        }
    }
}