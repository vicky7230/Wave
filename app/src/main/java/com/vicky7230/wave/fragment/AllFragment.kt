package com.vicky7230.wave.fragment


import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frostwire.jlibtorrent.*

import com.vicky7230.wave.R

/**
 * A simple [Fragment] subclass.
 *
 */
class AllFragment : Fragment() {

    companion object {
        fun newInstance() = AllFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_all, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    private fun init() {



        val magnetUrl = "magnet:?xt=urn:btih:834a559eea34a343f6be6b6dd575764a5ab135a9&dn=Deadpool.2.2018.Super.Duper.Cut.UNRATED.1080p.AMZN.WEBRip.DDP5.1.x264-ION10&tr=http%3A%2F%2Ftracker.trackerfix.com%3A80%2Fannounce&tr=udp%3A%2F%2F9.rarbg.me%3A2710&tr=udp%3A%2F%2F9.rarbg.to%3A2710"

        val addTorrentParams = AddTorrentParams.parseMagnetUri(Uri.parse(magnetUrl).toString())
        addTorrentParams.savePath(context?.filesDir?.path)


    }


}
