package pe.edu.ulima.pm.mundialqatar.presentation.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.ulima.pm.mundialqatar.R

@Composable
fun LoginScreen(
    cambiarAMain : (nombre : String) -> Unit
) {

    val nombre = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo ULima",
            modifier = Modifier
                .weight(0.28f)
                .fillMaxSize()
                .padding(bottom = 20.dp, top = 35.dp)
        )

        Text(
            text = "Polla ULima",
            fontSize = 30.sp,
            modifier = Modifier
                .weight(0.18f)
                .padding(top = 18.dp)
        )

        Column(
            modifier = Modifier
                .weight(0.18f)
        ) {
            Text(
                text = "20152902",
                fontSize = 15.sp,
                modifier = Modifier
                    .weight(1f)
            )

            Text(
                text = "20184407",
                fontSize = 15.sp,
                modifier = Modifier
                    .weight(1f)
            )
        }

        OutlinedTextField(
            value = nombre.value,
            onValueChange = {
                nombre.value = it
            },
            modifier = Modifier
                .weight(0.18f)
                .padding(start = 5.dp, end = 5.dp, bottom = 48.dp, top = 48.dp)
        )

        Button(
            onClick = {
                cambiarAMain(nombre.value)
            },
            modifier = Modifier
                .weight(0.18f)
                .padding(start = 15.dp, end = 15.dp, bottom = 55.dp, top = 55.dp)
        ) {
            Text(text = "Ingresar")
        }

    }
}