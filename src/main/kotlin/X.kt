import oop_solid.BangunDatar

open class X(var baris : Int) :  BangunDatar() {
    var arr = intArrayOf(0, baris*2-1)

    override fun jenisBangunDatar(jenis: String) {
        super.jenisBangunDatar(jenis)
    }

    override fun sgtg(){
    for (i in 1..baris-1){
        for (j in 1..arr[0]){
            print(" ")
        }
        arr[0]++
        for (k in 1..arr[1]){
            if (k == 1 || k == arr[1]) {
                print("*")
            }else{
                print(" ")
            }
        }
        arr[1] -= 2
        println()
    }

    arr[0] = baris - 1
    arr[1] = 1
    for (i in 1..baris){
        for (j in 1..arr[0]){
            print(" ")
        }
        arr[0]--
        for (k in 1..arr[1]){
            if (k == 1 || k == arr[1]) {
                print("*")
            }else{
                print(" ")
            }
        }
        arr[1] += 2
        println()
    }
}

}