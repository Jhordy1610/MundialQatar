package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import pe.edu.ulima.pm.mundialqatar.R
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo


@Composable
fun CajaEquipo(
    _infoEquipo: infoEquipo,
    navController: NavHostController
) {

    Card(
        elevation = 5.dp,
        modifier = Modifier
            .clickable {
                val id = _infoEquipo.id
                navController.navigate("detalle/${id}")
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Start
        ) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(_infoEquipo.crest)
                    .decoderFactory(SvgDecoder.Factory())
                    .build(),
                modifier = Modifier
                    .weight(0.3f)
                    .padding(top = 10.dp, bottom = 10.dp),
                contentDescription = null
            )

            Column(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .weight(0.6f)
            ) {

                Text(
                    text = _infoEquipo.name,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 12.dp)
                )

                Row(
                    modifier = Modifier
                        .padding(start = 12.dp, top = 15.dp, bottom = 15.dp)
                ) {
                    Text(
                        text = "Fundado: ",
                        fontSize = 13.sp,
                        modifier = Modifier
                    )
                    Text(
                        text = _infoEquipo.founded.toString(),
                        fontSize = 13.sp,
                        modifier = Modifier
                    )
                }

            }

        }

    }

}
