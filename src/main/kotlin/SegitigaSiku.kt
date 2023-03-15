import oop_solid.BangunDatar

open class SegitigaSiku (var baris : Int): BangunDatar(){
    override fun jenisBangunDatar(jenis: String) {
        super.jenisBangunDatar(jenis)
    }

    override fun sgtg(){
    for (i in 1..baris){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}
}