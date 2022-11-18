package pe.edu.ulima.pm.mundialqatar.model.remote

import pe.edu.ulima.pm.mundialqatar.model.entity.ApuestaResponse
import pe.edu.ulima.pm.mundialqatar.model.entity.Polla
import pe.edu.ulima.pm.mundialqatar.model.entity.Worldcup
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface PollaService {

    @Headers("X-Auth-Token: b2ccb935e7334be0ba208e52de64b43c")
    @GET("/v4/competitions/WC/teams")
    fun getWorldCup() : Call<Worldcup>

    @Headers("X-Auth-Token: b2ccb935e7334be0ba208e52de64b43c")
    @GET("/v4/competitions/WC/matches")
    fun getPolla() : Call<Polla>

    @Headers("X-Auth-Token: b2ccb935e7334be0ba208e52de64b43c")
    @GET("/v4/teams/{id}")
    fun getDetalle(
        @Path("id") codEquipo : String
    ) : Call<infoEquipo>

}
