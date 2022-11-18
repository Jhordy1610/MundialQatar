package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import pe.edu.ulima.pm.mundialqatar.model.entity.infoEquipo
import pe.edu.ulima.pm.mundialqatar.model.remote.HTTPManager

class DetalleViewModel() : ViewModel() {

    val detalleEquipo = mutableStateListOf<infoEquipo>()

    fun getDetalle(id: Int?) {
        viewModelScope.launch {
            val detalle = withContext(Dispatchers.IO) {
                HTTPManager.instance.getDetalle(
                    id = id.toString()
                )
            }

            if (detalle != null) {
                detalleEquipo.add(detalle)
            } else {
                Log.e("DetalleScreen", "Error de comunicación con el servicio")
            }

        }
    }

}