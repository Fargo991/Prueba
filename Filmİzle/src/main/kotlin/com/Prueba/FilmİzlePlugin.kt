package com.primatzeka

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class FilmİzlePlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Filmİzle())
    }
}