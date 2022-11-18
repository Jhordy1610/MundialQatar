package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import pe.edu.ulima.pm.mundialqatar.model.entity.Worldcup
import androidx.navigation.NavHostController

@Composable
fun ListaWorldCup(
    navController: NavHostController,
    worldcup : List<Worldcup>
) {

    LazyColumn {
        items(worldcup.size) { index ->
            ListaEquipos(
                navController = navController,
                listaEquipos = worldcup[index].teams)

        }
    }

}