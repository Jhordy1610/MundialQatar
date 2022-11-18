package pe.edu.ulima.pm.mundialqatar.model.remote

import pe.edu.ulima.pm.mundialqatar.model.entity.ApuestaResponse
import pe.edu.ulima.pm.mundialqatar.model.entity.Polla
import pe.edu.ulima.pm.mundialqatar.model.entity.Worldcup
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HTTPManagerApuesta {

    private var apuestaService: ApuestaService

    init {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://script.google.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apuestaService = retrofit.create(ApuestaService::class.java)

    }

    //patrón SINGLETON
    companion object {
        private var _instance: HTTPManagerApuesta? = null

        val instance: HTTPManagerApuesta
            get() {
                if (_instance == null) {
                    _instance = HTTPManagerApuesta()
                }
                return _instance!!
            }
    }

    fun Apuesta(apuesta: String, idPartido: String, nombre: String): ApuestaResponse? {
        return apuestaService.Apuesta(apuesta = apuesta, idPartido = idPartido, nombre = nombre)
            .execute().body()
    }

}