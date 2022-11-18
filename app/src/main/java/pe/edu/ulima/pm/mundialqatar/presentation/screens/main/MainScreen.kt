package pe.edu.ulima.pm.mundialqatar.presentation.screens.main

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import pe.edu.ulima.pm.mundialqatar.presentation.components.GraphNav
import pe.edu.ulima.pm.mundialqatar.presentation.components.TopBar

@Composable
fun MainScreen(nombre : String?) {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()

    val title = remember {
        mutableStateOf("World Cup 2022")
    }

    val changeTitle: (String) -> Unit = { newTitle ->
        title.value = newTitle
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                title = title.value,
            )
        }
    ) {
        GraphNav(
            nombre = nombre,
            navController = navController
        )
    }

}