package com.example.thailandtourisum


import android.database.DatabaseUtils
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.thailandtourisum.databinding.FragmentZoneBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class zoneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentZoneBinding>(inflater
            ,R.layout.fragment_zone,container,false)

        binding.northernButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)

            var alert:Int = Toast.LENGTH_SHORT;
            var toast = Toast.makeText(context,"ยินดีต้อนรับสู่ภาคเหนือ",alert)

            toast.show()}

        binding.northeasternButton.setOnClickListener{ view ->
                view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)

            var alert:Int = Toast.LENGTH_SHORT;
            var toast = Toast.makeText(context,"ยินดีต้อนรับสู่ภาคตะวันออกเฉียงเหนือ",alert)

            toast.show()}

        binding.southernButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)

            var alert:Int = Toast.LENGTH_SHORT;
            var toast = Toast.makeText(context,"ยินดีต้อนรับสู่ภาคเใต้",alert)

            toast.show()}

        binding.centralButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)

            var alert:Int = Toast.LENGTH_SHORT;
            var toast = Toast.makeText(context,"ยินดีต้อนรับสู่ภาคกลาง",alert)

            toast.show()}

        binding.easterButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_zoneFragment_to_provinceFragment)

            var alert:Int = Toast.LENGTH_SHORT;
            var toast = Toast.makeText(context,"ยินดีต้อนรับสู่ภาคตะวันออก",alert)

            toast.show()}

        setHasOptionsMenu(true)
        return  binding.root

        Timber.i("onCreate called")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater)
    {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.optionmenu,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
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
