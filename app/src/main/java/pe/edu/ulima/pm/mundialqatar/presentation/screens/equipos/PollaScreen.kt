package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components.DetalleEquipo
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components.ListaPolla
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels.PollaViewModel

@Composable
fun PollaScreen(
    navController: NavHostController,
    nombre : String?,
    vm: PollaViewModel = viewModel()
) {

    LaunchedEffect(key1 = true) {
        vm.getPolla()
    }

    ListaPolla(
        polla = vm.listaPolla,
        navController = navController,
        nombre = nombre
    )

}