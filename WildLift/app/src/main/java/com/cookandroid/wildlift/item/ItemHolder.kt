package com.cookandroid.wildlift.item

import com.cookandroid.wildlift.base.BaseHolder
import com.cookandroid.wildlift.databinding.HolderItemBinding

class ItemHolder(binding: HolderItemBinding) : BaseHolder<HolderItemBinding, Item>(binding) {
    init {
        binding.holder = this
    }
}