package com.godslew.gkcoffeescrollviewpager2

enum class PageType {
    GRANDE,
    TALL,
    MEDIUM,
    SMALL;

    companion object {
        fun getPages(): List<PageType> {
            return listOf(
                GRANDE,
                TALL,
                MEDIUM,
                SMALL
            )
        }
    }
}