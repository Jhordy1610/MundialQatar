package pe.edu.ulima.pm.mundialqatar.presentation.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.DetalleScreen
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.EquiposScreen
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.PollaScreen
import pe.edu.ulima.pm.mundialqatar.presentation.screens.main.MainScreen

@Composable
fun GraphNav(
    nombre: String?,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "equiposScreen"
    ) {
        composable("equiposScreen") {
            EquiposScreen(navController)
        }

        composable("pollaScreen") {
            PollaScreen(navController, nombre)
        }

        composable("detalle/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {
            DetalleScreen(
                id = it.arguments!!.getInt("id"),
                navController = navController
            )
        }
    }
}

