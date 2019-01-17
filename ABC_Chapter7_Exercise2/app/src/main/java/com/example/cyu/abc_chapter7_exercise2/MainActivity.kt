package com.example.cyu.abc_chapter7_exercise2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.content.Context
import android.widget.*

class MainActivity : AppCompatActivity() {

    internal var animals = arrayOf(R.drawable.wonder1, R.drawable.wonder2, R.drawable.wonder3, R.drawable.wonder4, R.drawable.wonder5, R.drawable.wonder6, R.drawable.wonder7)

    internal lateinit var pic: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val grid = findViewById<GridView>(R.id.gridView)
        val pic = findViewById<ImageView>(R.id.imgLarge)
        grid.adapter = ImageAdapter(this)
        grid.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(baseContext, "Selected Species " + (position + 1),
                    Toast.LENGTH_SHORT).show()
            pic.setImageResource(animals[position])
        }
    }

    inner class ImageAdapter(private val context: Context) : BaseAdapter() {

        override fun getCount(): Int {
            return animals.size
        }

        override fun getItem(position: Int): Any? {
            return null
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
            pic = ImageView(context)
            pic.setImageResource(animals[position])
            pic.scaleType = ImageView.ScaleType.FIT_XY
            //pic.layoutParams = GridView.LayoutParams(330, 330)
            pic.layoutParams = AbsListView.LayoutParams(330, 300)
            return pic
        }
    }
}