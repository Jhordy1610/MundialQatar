package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo

@Composable
fun DetalleEquipo(
    navController: NavHostController,
    detalle : List<infoEquipo>
) {

    LazyColumn {
        items(detalle.size) { index ->
            CajaDetalle(
                navController = navController,
                detalleEquipo = detalle[index])
        }
    }

}