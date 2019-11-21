package com.godslew.gkcoffeescrollviewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.godslew.gkcoffeescrollviewpager2.databinding.FragmentTallBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class TallFragment : Fragment(){
    private lateinit var binding : FragmentTallBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTallBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as FragmentAdapter.OnChangeTitleListener).onChangeTitle("Tall Menu")
        setupRecycleView()
    }

    override fun onResume() {
        super.onResume()
        (requireActivity() as FragmentAdapter.OnChangeTitleListener).onChangeTitle("Tall Menu")
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    private fun setupRecycleView() {
        val adapter = GroupAdapter<ViewHolder>()
        val manager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.list.adapter = adapter
        binding.list.layoutManager = manager

        adapter.update(
            listOf(
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate"),
                ItemMenu("CafeRate")
            )
        )

    }
}