package com.example.task10

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import coil.load
import com.bumptech.glide.Glide
import com.example.task10.databinding.ActivityMainBinding
import com.example.task10.databinding.FragmentEditInfoBinding

class EditFragment {

    private var _binding: FragmentEditInfoBinding? = null
    private val binding: FragmentEditInfoBinding get() = _binding!!
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentEditInfoBinding.bind(view)

        sharedPreferences = requireActivity().getSharedPreferences("App_Prefs",Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        setImageResourses()

        binding.btnSave.setOnClickListener {
            editor.putString("photo_url", binding.Image.text.toString())
            editor.putString("full_name", binding.FullName.text.toString())
            editor.putString("email", binding.Email.text.toString())
            editor.apply()
        }
    }

    fun setImageResourses() {
        binding.Image.setText(sharedPreferences.getString("photo_url", null))
        binding.FullName.setText(sharedPreferences.getString("full_name", null))
        binding.Email.setText(sharedPreferences.getString("email", null))
    }
}
