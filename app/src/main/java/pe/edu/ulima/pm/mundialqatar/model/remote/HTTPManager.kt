package pe.edu.ulima.pm.mundialqatar.model.remote

import pe.edu.ulima.pm.mundialqatar.model.entity.ApuestaResponse
import pe.edu.ulima.pm.mundialqatar.model.entity.Polla
import pe.edu.ulima.pm.mundialqatar.model.entity.Worldcup
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels.ApuestaViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HTTPManager {

    private var pollaService: PollaService

    init {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.football-data.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        pollaService = retrofit.create(PollaService::class.java)

    }

    //patrón SINGLETON
    companion object {
        private var _instance: HTTPManager? = null

        val instance: HTTPManager
            get() {
                if (_instance == null) {
                    _instance = HTTPManager()
                }
                return _instance!!
            }
    }

    fun getWorldCup(): Worldcup? {
        val worldcup = pollaService.getWorldCup().execute().body()
        return worldcup
    }

    fun getDetalle(id: String): infoEquipo? {
        val detalleEquipo = pollaService.getDetalle(codEquipo = id).execute().body()
        return detalleEquipo
    }

    fun getPolla(): Polla? {
        val polla = pollaService.getPolla().execute().body()
        return polla
    }

}