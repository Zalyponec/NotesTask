package com.example.notestask.domain.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notestask.R
import com.example.notestask.databinding.FragmentMainBinding
import com.example.notestask.databinding.ItemNoteLayoutBinding
import com.example.notestask.domain.model.NoteModel



class NoteAdapter: RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    var notelist = emptyList<NoteModel>()

    class NoteViewHolder(val binding: ItemNoteLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteAdapter.NoteViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var binding = ItemNoteLayoutBinding.inflate(inflater, parent, false)
        return NoteViewHolder(binding)
    }
    override fun onBindViewHolder(holder: NoteAdapter.NoteViewHolder, position: Int) {
        with(holder.binding) {
            NoteName.text = notelist[position].NoteName
            NoteDate.text = notelist[position].NoteDate
            NoteText.text = notelist[position].NoteText
        }
    }
        override fun getItemCount(): Int {
            return notelist.size
        }

    fun setlist(list: List<NoteModel>) {
        notelist = list
    }

}




