import oop_solid.BangunDatar

open class SegitigaTerbalik(var baris : Int) : BangunDatar(){
    var spasi = 0
    var btg = baris * 2 - 1

    override fun jenisBangunDatar(jenis: String) {
        super.jenisBangunDatar(jenis)
    }

    override fun sgtg() {
        for (i in 1..baris) {
            for (j in 1..spasi) {
                print(" ")
            }
            spasi++
            for (k in 1..btg) {
                print("*")
            }
            btg -= 2
            println()
        }
    }
}