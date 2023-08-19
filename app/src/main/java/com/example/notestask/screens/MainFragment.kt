package com.example.notestask.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notestask.R
import com.example.notestask.databinding.FragmentMainBinding
import com.example.notestask.domain.adapter.NoteAdapter
import com.example.notestask.domain.model.NoteModel



lateinit var adapter: NoteAdapter
lateinit var recyclerView: RecyclerView
class MainFragment : Fragment() {
    private var _binding:FragmentMainBinding? = null;
    private val binding get() = _binding!!;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initial()

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initial() {
        recyclerView = binding.rvNote
        adapter = NoteAdapter()
        recyclerView.adapter = adapter
        adapter.setlist(myNote())
    }
    fun myNote(): ArrayList<NoteModel> {
        val notelist = ArrayList<NoteModel>()
        for(i in 1..100) {
            val note = NoteModel("test","12-12-12", "lkdjhgflaskdhflkajsdhflkjasdhflkjasdhflkjasdhflkjasdhflkjasdhfljkahflkjashdflkjashdflkjhasdlfkjhasdlkjfhaslkdjfhlkasjdhflkajsdhflkasdhflkjashdflkjh")
            notelist.add(note)
        }

//        val note1 = NoteModel("test","12-12-12", "lkdjhgflaskdhflkajsdhflkjasdhflkjasdhflkjasdhflkjasdhflkjasdhfljkahflkjashdflkjashdflkjhasdlfkjhasdlkjfhaslkdjfhlkasjdhflkajsdhflkasdhflkjashdflkjh")
//        notelist.add(note1)
//        val note2 = NoteModel("test","12-12-12", "lkdjhgflaskdhflkajsdhflkjasdhflkjasdhflkjasdhflkjasdhflkjasdhfljkahflkjashdflkjashdflkjhasdlfkjhasdlkjfhaslkdjfhlkasjdhflkajsdhflkasdhflkjashdflkjh")
//        notelist.add(note2)
//        val note3 = NoteModel("test","12-12-12", "lkdjhgflaskdhflkajsdhflkjasdhflkjasdhflkjasdhflkjasdhflkjasdhfljkahflkjashdflkjashdflkjhasdlfkjhasdlkjfhaslkdjfhlkasjdhflkajsdhflkasdhflkjashdflkjh")
//        notelist.add(note3)
//        val note4 = NoteModel("test","12-12-12", "lkdjhgflaskdhflkajsdhflkjasdhflkjasdhflkjasdhflkjasdhflkjasdhfljkahflkjashdflkjashdflkjhasdlfkjhasdlkjfhaslkdjfhlkasjdhflkajsdhflkasdhflkjashdflkjh")
//        notelist.add(note4)
        return notelist
    }
}