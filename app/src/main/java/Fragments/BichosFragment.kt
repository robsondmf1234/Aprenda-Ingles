package Fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.aprendaingles.R

class BichosFragment : Fragment(), View.OnClickListener {
    private lateinit var buttonCao: ImageButton
    private lateinit var buttonGato: ImageButton
    private lateinit var buttonLeao: ImageButton
    private lateinit var buttonMacaco: ImageButton
    private lateinit var buttonOvelha: ImageButton
    private lateinit var buttonVaca: ImageButton
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_bichos, container, false)

        buttonCao = view.findViewById(R.id.buttonCao)
        buttonGato = view.findViewById(R.id.buttonGato)
        buttonLeao = view.findViewById(R.id.buttonLeao)
        buttonMacaco = view.findViewById(R.id.buttonMacaco)
        buttonOvelha = view.findViewById(R.id.buttonOvelha)
        buttonVaca = view.findViewById(R.id.buttonVaca)

        buttonCao.setOnClickListener(this)
        buttonGato.setOnClickListener(this)
        buttonLeao.setOnClickListener(this)
        buttonMacaco.setOnClickListener(this)
        buttonOvelha.setOnClickListener(this)
        buttonVaca.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.buttonCao -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.dog)
                    tocarSom()
                }
                R.id.buttonGato -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.cat)
                    tocarSom()
                }
                R.id.buttonLeao -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.lion)
                    tocarSom()
                }
                R.id.buttonMacaco -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.monkey)
                    tocarSom()
                }
                R.id.buttonOvelha -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.sheep)
                    tocarSom()
                }
                R.id.buttonVaca -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.cow)
                    tocarSom()
                }
            }
        }
    }

    fun tocarSom() {
        mediaPlayer.start()

        mediaPlayer.setOnCompletionListener(MediaPlayer.OnCompletionListener {
            mediaPlayer.release()
        })
    }
}
