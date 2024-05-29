package com.example.exaad.tapas.data.remote

import com.example.exaad.tapas.domain.Tapa

fun DownloadFirebaseModel.toModel(): Tapa =
    Tapa(this.id!!, this.name!!, this.description!!, this.establishment!!, this.photoTapas!!)