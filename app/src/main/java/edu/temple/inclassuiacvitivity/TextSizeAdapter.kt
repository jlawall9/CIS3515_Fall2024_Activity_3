package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val numbers: Array<Int>) : BaseAdapter() {

    override fun getCount() = numbers.size

    override fun getItem(position: Int): Any {
        val pos = numbers[position]
        return pos
    }

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val textView : TextView

        if (convertView != null) {
            textView = TextView(context)
        } else{
            textView = TextView(context)
            textView.text = numbers[position].toString()

            textView.setPadding(5,10,0,10)
        }
        textView.textSize = numbers[position].toFloat()

        return textView

    }

}