package com.reihan.reogapp.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.reihan.reogapp.R
import com.reihan.reogapp.databinding.FragmentHomeBinding
import com.reihan.reogapp.preferences.ReogPreference
import com.reihan.reogapp.statis.BeritaDataSource
import com.reihan.reogapp.ui.bansos.BansosActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var homeAdapter: HomeAdapter
    @Inject
    lateinit var reogPreference: ReogPreference

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setActionBarTitle()

        homeAdapter = HomeAdapter(BeritaDataSource.dummyBerita)
        binding.rvBerita.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = homeAdapter
        }

        binding.btnCekBantuan.setOnClickListener {
            val intent = Intent(requireContext(), BansosActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setActionBarTitle() {
        val reogModel = reogPreference.getUser()
        val username = reogModel?.name

        val activity = requireActivity() as AppCompatActivity
        activity.supportActionBar?.apply {
            title = getString(R.string.label_greeting_user, username)
            setDisplayShowHomeEnabled(true)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}