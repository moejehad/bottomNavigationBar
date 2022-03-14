package com.example.navigationtest.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 5
    private val list = arrayListOf<String>("About Us","Setting","I have an issue","Rate The App","Logout")

    init {
        // Add some sample items.
        for (item in list) {
            addItem(createDummyItem(item))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
    }

    private fun createDummyItem(txt: String): DummyItem {
        return DummyItem(txt)
    }


    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val content: String) {
        override fun toString(): String = content
    }
}