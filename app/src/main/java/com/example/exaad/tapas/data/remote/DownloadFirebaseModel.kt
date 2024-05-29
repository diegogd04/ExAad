package com.example.exaad.tapas.data.remote

import com.example.exaad.tapas.domain.Establishment
import com.example.exaad.tapas.domain.PhotoTapas

class DownloadFirebaseModel(
    @get: ParameterName("id") @set:ParameterName("id") var id: Int? = null,
    @get: ParameterName("description") @set:ParameterName("description") var description: String? = null,
    @get: ParameterName("establishment") @set:ParameterName("establishment") var establishment: Establishment? = null,
    @get: ParameterName("name") @set:ParameterName("name") var name: String? = null,
    @get: ParameterName("photoTapas") @set:ParameterName("photoTapas") var photoTapas: List<PhotoTapas>? = null
)