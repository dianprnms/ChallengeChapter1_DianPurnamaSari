import oop_solid.BangunDatar

abstract class Plus1:BangunDatar(){
    abstract override fun tambah()
}

class Plus(var baris : Int) : Plus1() {
    var btg : Int = baris * 2 - 1

    override fun tambah() {
        var nilai = 1
        while (nilai < baris /2) {
            var spasi = 1
            while (spasi < baris - 1) {
                print(" ")
                spasi++
            }

            println("*")
            nilai++
        }

        nilai = 1
        while (nilai < baris) {
            print("* ")
            nilai++
        }
        println()

        nilai = 1
        while (nilai < baris / 2) {
            var spasi = 1
            while (spasi < baris - 1) {
                print(" ")
                spasi++
            }
            println("*")
            nilai++
        }
    }

}



