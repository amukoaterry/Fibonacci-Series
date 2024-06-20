package com.example.fibbonacciassignment

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fibonaci.R


class FibonacciRecyclerViewAdapter (var numbers:List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numberView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonaci_number_view,parent,false)
        return NumbersViewHolder(numberView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumbers.text = numbers[position].toString()

    }

    override fun getItemCount(): Int {
        return numbers.size
    }

}

class NumbersViewHolder(numberView:View):RecyclerView.ViewHolder(numberView){
    val tvNumbers = numberView.findViewById<TextView>(R.id.tvNumber)
}