package Fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.aprendaingles.R

class NumerosFragment : Fragment(), View.OnClickListener {
    private lateinit var buttonOne: ImageButton
    private lateinit var buttonTwo: ImageButton
    private lateinit var buttonThree: ImageButton
    private lateinit var buttonFour: ImageButton
    private lateinit var buttonFive: ImageButton
    private lateinit var buttonSix: ImageButton
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_numeros, container, false)

        buttonOne = view.findViewById(R.id.buttonUm)
        buttonTwo = view.findViewById(R.id.buttonDois)
        buttonThree = view.findViewById(R.id.buttonTres)
        buttonFour = view.findViewById(R.id.buttonQuatro)
        buttonFive = view.findViewById(R.id.buttonCinco)
        buttonSix = view.findViewById(R.id.buttonSeis)

        buttonOne.setOnClickListener(this)
        buttonTwo.setOnClickListener(this)
        buttonThree.setOnClickListener(this)
        buttonFour.setOnClickListener(this)
        buttonFive.setOnClickListener(this)
        buttonSix.setOnClickListener(this)

        return view
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.buttonUm -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.one)
                    tocarSom()
                }
                R.id.buttonDois -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.two)
                    tocarSom()
                }
                R.id.buttonTres -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.three)
                    tocarSom()
                }
                R.id.buttonQuatro -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.four)
                    tocarSom()
                }
                R.id.buttonCinco -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.five)
                    tocarSom()
                }
                R.id.buttonSeis -> {
                    mediaPlayer = MediaPlayer.create(activity, R.raw.six)
                    tocarSom()
                }
            }
        }
    }

    private fun tocarSom() {
        mediaPlayer.start()

        mediaPlayer.setOnCompletionListener(MediaPlayer.OnCompletionListener {
            mediaPlayer.release()
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()

        Toast.makeText(context,"Teste",Toast.LENGTH_SHORT).show()
    }
}
