package android.app.mislugares

import com.example.mislugares.Lugar


internal object Principal {
    @JvmStatic
    fun main(main: Array<String>) {
        val lugar = Lugar(
            "Escuela Politécnica Superior de Gandía",
            "C/ Paranimf, 1 46730 Gandia (SPAIN)",
            GeoPunto(-0.166093, 38.995656),
            TipoLugar.EDUCACION,
            "",
            962849300,
            "http://www.epsg.upv.es",
            "Uno de los mejores lugares para formarse.",
            System.currentTimeMillis(),
            3F,

        )
        println("Lugar $lugar")
    }
}