package com.CXXX

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class MotherlessProvider : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Motherless())
    }
}
