package pe.edu.ulima.pm.mundialqatar.presentation.screens.equipos.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import pe.edu.ulima.pm.mundialqatar.model.entity.Polla
import pe.edu.ulima.pm.mundialqatar.model.remote.HTTPManager

class PollaViewModel : ViewModel() {

    val listaPolla = mutableStateListOf<Polla>()

    fun getPolla() {

        viewModelScope.launch {
            val polla = withContext(Dispatchers.IO) {
                HTTPManager.instance.getPolla()
            }

            if (polla != null) {
                listaPolla.add(polla)
            } else {
                Log.e("PollaScreen", "Error de comunicación con el servicio")
            }
        }

    }

}