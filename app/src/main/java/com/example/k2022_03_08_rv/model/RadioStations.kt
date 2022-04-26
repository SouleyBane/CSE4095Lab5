package com.example.k2022_03_08_rv.model

import kotlin.collections.MutableList

var stations: MutableList<RadioStation> = mutableListOf(RadioStation())


class RadioStations() {

    init {
        stations.add(RadioStation("Sainte Famille  ", "http://ns385874.ip-176-31-243.eu:8001/stream"))
        stations.add(RadioStation("Maine NPR  ", "https://playerservices.streamtheworld.com/api/livestream-redirect/WMEAFM.mp3"))
        stations.add(RadioStation("Radio Argentia", "http://19253.live.streamtheworld.com:80/LOS40_ARGENTINAAAC_SC"))
        stations.add(RadioStation("WHUSFM  ", "http://stream.whus.org:8000/whusfm"))
        stations.add(RadioStation("National Public Radio", "https://cms.stream.publicradio.org/cms.mp3"))
        stations.add(RadioStation("WNYC","http://sgrewind.streamguys1.com/wnycfm/wnycfm.aac/playlist.m3u8"))
        stations.add(RadioStation("Current", "https://current.stream.publicradio.org/kcmp.mp3"))
        stations.add(RadioStation("WEEI Talk", "https://kmojfm.streamguys1.com/live-mp3"))
        stations.add(RadioStation("97.1 Sports", "https://servidor28.brlogic.com:8264/live"))
        stations.add(RadioStation("German Radio", "http://www.radioeins.de/livemp3"))
    }

    public fun getStations() : MutableList<RadioStation> {
        return stations
    }

    public fun size() : Int {
        return stations.size
    }
}

