package pe.edu.ulima.pm.mundialqatar.model.entity

data class Partido(
    val homeTeam : Local,
    val awayTeam : Visitante,
    val group : String,
    val id : Int
) {

}