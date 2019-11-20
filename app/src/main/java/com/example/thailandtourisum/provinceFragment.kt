package com.example.thailandtourisum


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.thailandtourisum.databinding.FragmentProvinceBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class provinceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentProvinceBinding>(inflater
            ,R.layout.fragment_province,container,false)
        val args=provinceFragmentArgs.fromBundle(arguments!!)

        binding.button.text = args.zone

        binding.button.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_provinceFragment_to_tourisumFragment)

        }

        return  binding.root
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

}
