package com.godslew.gkcoffeescrollviewpager2

import com.godslew.gkcoffeescrollviewpager2.databinding.ItemMenuBinding
import com.xwray.groupie.databinding.BindableItem

data class ItemMenu(
    private val menuName : String
) : BindableItem<ItemMenuBinding>() {
    override fun getLayout(): Int {
        return R.layout.item_menu
    }

    override fun bind(viewBinding: ItemMenuBinding, position: Int) {
        viewBinding.menu.text = menuName
    }
}