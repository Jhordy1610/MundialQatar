package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import pe.edu.ulima.pm.mundialqatar.model.entity.Polla
import pe.edu.ulima.pm.mundialqatar.model.remote.HTTPManager
import pe.edu.ulima.pm.mundialqatar.model.remote.HTTPManagerApuesta

class ApuestaViewModel : ViewModel() {

    var limpiarTexto = mutableStateOf(false)
    var resultado = mutableStateOf("")
    var id = mutableStateOf("")
    var nombre = mutableStateOf("")

    fun Apuesta() {

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                HTTPManagerApuesta.instance.Apuesta(
                    apuesta = resultado.value,
                    idPartido = id.value,
                    nombre = nombre.value
                )
            }

        }

    }
}