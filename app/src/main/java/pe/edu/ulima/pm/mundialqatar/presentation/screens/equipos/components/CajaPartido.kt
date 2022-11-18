package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import pe.edu.ulima.pm.mundialqatar.model.entity.Partido
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels.ApuestaViewModel
import pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels.PollaViewModel

@Composable
fun CajaPartido(
    infoPartido: Partido,
    vm: ApuestaViewModel = viewModel(),
    nombre: String?,
    navController: NavHostController
) {

    vm.nombre.value = nombre!!

    /*** Falta mejorar esta lógica (que se mande el id del partido deseado)***/
    if (infoPartido.id == 391882) {
        vm.id.value = infoPartido.id.toString()
    }

    Card(
        elevation = 5.dp,
        modifier = Modifier,
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 13.dp, start = 15.dp, bottom = 13.dp),
        ) {

            if (infoPartido.homeTeam.name != null) {
                Text(
                    text = infoPartido.homeTeam.name,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .weight(0.29f)
                )
            } else {
                Text(
                    text = "NULL",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .weight(0.29f)
                )
            }

            Text(
                text = "   VS   ",
                fontSize = 13.sp,
                modifier = Modifier
                    .weight(0.10f)
            )

            if (infoPartido.awayTeam.name != null) {
                Text(
                    text = infoPartido.awayTeam.name,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .weight(0.29f)
                        .padding(start = 18.dp)
                )
            } else {
                Text(
                    text = "NULL",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .weight(0.29f)
                        .padding(start = 18.dp)
                )
            }

            OutlinedTextField(
                modifier = Modifier
                    .weight(0.34f)
                    .height(30.dp)
                    .padding(top = 13.dp, bottom = 13.dp, start = 15.dp, end = 18.dp),
                value = vm.resultado.value,
                onValueChange = {
                    vm.resultado.value = it
                }
            )
        }
    }

}

