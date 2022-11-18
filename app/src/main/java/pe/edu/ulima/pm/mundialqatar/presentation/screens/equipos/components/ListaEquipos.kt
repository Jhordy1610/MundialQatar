package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo

@Composable
fun ListaEquipos(
    navController: NavHostController,
    listaEquipos: List<infoEquipo>
) {

    Text(
        text = "Equipos",
        fontSize = 18.sp,
        modifier = Modifier
            .padding(top = 10.dp, bottom = 10.dp, start = 165.dp)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        for (index in 0 until listaEquipos.size) {
            CajaEquipo(
                _infoEquipo = listaEquipos[index],
                navController = navController
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
                backgroundColor = Color(0xFF926BD8),
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