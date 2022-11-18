package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.model.entity.Polla

@Composable
fun ListaPolla(
    navController: NavHostController,
    polla: List<Polla>,
    nombre : String?
) {

    LazyColumn {
        items(polla.size) { index ->
            ListaPartidos(
                listaPartidos = polla[index].matches,
                navController = navController,
                nombre = nombre
            )
        }


    }
}
