package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components


import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo


@Composable
fun CajaDetalle(
    detalleEquipo: infoEquipo,
    navController: NavHostController
) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = detalleEquipo.name,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(top = 10.dp)
        )

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(detalleEquipo.crest)
                .decoderFactory(SvgDecoder.Factory())
                .build(),
            contentDescription = null,
            modifier = Modifier
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = "Dirección:",
                fontSize = 18.sp,
                modifier = Modifier
            )

            Text(
                text = detalleEquipo.address,
                fontSize = 13.sp,
                modifier = Modifier
            )

            Text(
                text = "Sitio Web:",
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 18.dp)
            )

            Text(
                text = detalleEquipo.website,
                fontSize = 13.sp,
                modifier = Modifier
            )

            Text(
                text = "Colores:",
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 18.dp)
            )

            Text(
                text = detalleEquipo.clubColors,
                fontSize = 13.sp,
                modifier = Modifier
            )

            Text(
                text = "Estadio:",
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(top = 18.dp)
            )

            Text(
                text = detalleEquipo.venue,
                fontSize = 13.sp,
                modifier = Modifier
                    .padding(bottom = 105.dp)
            )
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
}