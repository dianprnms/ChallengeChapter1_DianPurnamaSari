import oop_solid.BangunDatar

open class BelahKetupat(var baris : Int) : BangunDatar() {
    var spasi = baris - 1
    var btg = 1

    override fun jenisBangunDatar(jenis: String) {
        super.jenisBangunDatar(jenis)
    }

    override fun sgtg(){
    for (i in 1..baris-1){
        for (j in 1..spasi){
            print(" ")
        }
        spasi--
        for (k in 1..btg){
            print("*")
        }
        btg += 2
        println()
    }

    var spasi2 = 0
    var btg2 = baris * 2 - 1
    for (i in 1..baris){
        for (j in 1..spasi2){
            print(" ")
        }
        spasi2++
        for (k in 1..btg2){
            print("*")
        }
        btg2 -= 2
        println()
    }
    }

}