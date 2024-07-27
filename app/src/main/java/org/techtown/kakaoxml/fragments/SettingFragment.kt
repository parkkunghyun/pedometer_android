package org.techtown.kakaoxml.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import org.techtown.kakaoxml.R


class SettingFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_setting, container,false)

        val navFriend = view.findViewById<ImageView>(R.id.friend)
        navFriend.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingFragment_to_freindsFragment)
        }
        val navRanking = view.findViewById<ImageView>(R.id.ranking)
        navRanking.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingFragment_to_rankingFragment)
        }
        val navHome = view.findViewById<ImageView>(R.id.home)
        navHome.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingFragment_to_homeFragment)
        }


        // Inflate the layout for this fragment
        return view
    }
}