package pe.edu.ulima.pm.mundialqatar.model.remote

import pe.edu.ulima.pm.mundialqatar.model.entity.ApuestaResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApuestaService {

    @GET("/macros/s/AKfycbxxjiiYCgyP1LO9WNgqlLbYHj3k6oxEYVmyx97o3i-BU2rgW6AtEu4qL1o19PzPygil/exec?")
    // usuario=123&idpartido=1&ganador=0 (0:empate, 1: local, 2: visita)
    fun Apuesta(
        @Query("usuario") nombre : String,
        @Query("idpartido") idPartido : String,
        @Query("ganador") apuesta : String
    ) : Call<ApuestaResponse>

}