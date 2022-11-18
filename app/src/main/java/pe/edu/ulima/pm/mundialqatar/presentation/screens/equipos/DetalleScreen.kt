package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components.DetalleEquipo
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components.ListaEquipos
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels.DetalleViewModel

@Composable
fun DetalleScreen(
    id : Int?,
    navController: NavHostController,
    vm : DetalleViewModel = viewModel()
) {

    LaunchedEffect(key1 = true) {
        vm.getDetalle(id)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        DetalleEquipo(
            detalle = vm.detalleEquipo,
            navController = navController
        )
    }

}

