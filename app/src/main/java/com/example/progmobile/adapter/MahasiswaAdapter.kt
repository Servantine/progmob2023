package com.example.progmobile.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mahasiswa.R
import com.example.mahasiswa.model.Mahasiswa

class MahasiswaAdapter: (val mahasiswa: List<Mahasiswa>) :
    RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MahasiswaAdapter.MahasiswaHolder {
        return
        Pe
    }

    override fun onBindViewHolder(holder: MahasiswaAdapter.MahasiswaHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}

class MahasiswaHolder(view: View) : RecyclerView.ViewHolder(view) {
    lateinit var txtNama: TextView
    lateinit var txtNim: TextView
    lateinit var txtAlamat: TextView
    lateinit var txtEmail: TextView
    lateinit var txtFoto: TextView
    fun bindPetani(mahasiswa: Mahasiswa) {
        itemView.apply {
            txtNama = findViewById(R.id.txtNama)
            txtNim = findViewById(R.id.txtNim)
            txtAlamat = findViewById(R.id.txtAlamat)
            txtEmail = findViewById(R.id.txtEmail)
            txtFoto = findViewById(R.id.txtFoto)
            txtNama.text = Mahasiswa.nama
            txtNim.text = Mahasiswa.nim
            txtAlamat.text = Mahasiswa.alamat
            txtEmail.text = Mahasiswa.email
            txtFoto.text = Mahasiswa.foto
        }
    }
}