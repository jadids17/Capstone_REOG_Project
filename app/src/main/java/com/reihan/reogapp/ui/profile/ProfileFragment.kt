package com.reihan.reogapp.ui.profile

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.reihan.reogapp.databinding.FragmentProfileBinding
import com.reihan.reogapp.preferences.ReogPreference
import com.reihan.reogapp.ui.about.AboutActivity
import com.reihan.reogapp.ui.faq.FaqActivity
import com.reihan.reogapp.ui.launcher.LauncherActivity
//import com.reihan.reogapp.ui.setting.SettingActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    @Inject
    lateinit var reogPreference: ReogPreference

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val profileViewModel =
            ViewModelProvider(this)[ProfileViewModel::class.java]

        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.logoutButton.setOnClickListener {
            reogPreference.clearUser()
            val intent = Intent(requireContext(), LauncherActivity::class.java)
            startActivity(intent)
        }

        binding.faqButton.setOnClickListener {
            val intent = Intent(requireContext(), FaqActivity::class.java)
            startActivity(intent)
        }

        binding.aboutButton.setOnClickListener {
            val intent = Intent(requireContext(), AboutActivity::class.java)
            startActivity(intent)
        }

//        binding.settingsButton.setOnClickListener {
//            val intent = Intent(requireContext(), SettingActivity::class.java)
//            startActivity(intent)
//        }

        binding.aboutLanguage.setOnClickListener {
            startActivity(Intent(Settings.ACTION_LOCALE_SETTINGS))
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}