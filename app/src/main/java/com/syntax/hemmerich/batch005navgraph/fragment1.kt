package com.syntax.hemmerich.batch005navgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.syntax.hemmerich.batch005navgraph.databinding.FragmentFragment1Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment() {
    // TODO: Rename and change types of parameters

    private var _binding : FragmentFragment1Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFragment1Binding.inflate(inflater,container,false)
        val view = binding.root


        binding.textView.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.navigate_to_fragment2)
        }

        return view

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}