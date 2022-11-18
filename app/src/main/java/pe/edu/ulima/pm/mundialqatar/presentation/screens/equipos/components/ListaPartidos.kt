package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.model.entity.Partido
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components.CajaEquipo
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels.ApuestaViewModel

@Composable
fun ListaPartidos(
    listaPartidos: List<Partido>,
    vm: ApuestaViewModel = viewModel(),
    nombre: String?,
    navController: NavHostController
) {

    Row(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Text(
            text = "Polla",
            fontSize = 20.sp,
            modifier = Modifier
                .weight(0.85f)
                .padding(top = 10.dp, bottom = 10.dp),
            textAlign = TextAlign.Center
        )

        IconButton(
            onClick = {
                vm.Apuesta()
                //vm.resultado.value = "" /*** Esto limpia las cajas de TODOS los partidos y vm.resultado(al excel lo manda como "")  ***/
            },
            modifier = Modifier
                .weight(0.15f)
        ) {
            Icon(
                painter = painterResource(id = pe.edu.ulima.pm.mundialqatar.R.drawable.ic_baseline_save_24),
                //Icons.Filled.Email,
                contentDescription = null
            )
        }

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        for (index in 0 until listaPartidos.size) {
            CajaPartido(
                infoPartido = listaPartidos[index],
                navController = navController,
                nombre = nombre
            )
        }
    }

    Row(
        modifier = Modifier
            .height(138.dp)
    ) {

        Button(
            onClick = {
                navController.navigate("equiposScreen")
            },
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF673AB7),
                contentColor = Color(0xFFFFEE58)
            )
        )
        {
            Text(text = "Equipos")
        }

        Button(
            onClick = {
                navController.navigate("pollaScreen")
            },
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
        )
        {
            Text(text = "Polla")
        }
    }

}