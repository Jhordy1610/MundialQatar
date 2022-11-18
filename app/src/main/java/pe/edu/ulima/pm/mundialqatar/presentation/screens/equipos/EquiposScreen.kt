package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components.ListaEquipos
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components.ListaWorldCup
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels.EquipoViewModel

@Composable
fun EquiposScreen(
    navController: NavHostController,
    vm: EquipoViewModel = viewModel()
) {
    LaunchedEffect(key1 = true) {
        vm.getWorldCup()
    }

    ListaWorldCup(
        worldcup = vm.listaWorldcup,
        navController = navController
    )

}
