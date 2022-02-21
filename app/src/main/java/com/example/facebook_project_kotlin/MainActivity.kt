package com.example.facebook_project_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.facebook_project_kotlin.adapter.FeedAdapter
import com.example.facebook_project_kotlin.modul.Feed
import com.example.facebook_project_kotlin.modul.Post
import com.example.facebook_project_kotlin.modul.Story

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(getAllFeeds())
    }

    private fun refreshAdapter(feeds: ArrayList<Feed>) {
        val adapter = FeedAdapter(this,feeds)
        recyclerView.adapter = adapter
    }

    private fun getAllFeeds(): ArrayList<Feed> {
        val stories: ArrayList<Story> = ArrayList()
        stories.add(Story(R.drawable.img12,"Natali_1004",true))
        stories.add(Story(R.drawable.img10,"Jorj Burj"))
        stories.add(Story(R.drawable.img11,"Alex Shfirman"))
        stories.add(Story(R.drawable.img12,"Maxs 5050"))
        stories.add(Story(R.drawable.img13,"Juli_beautiful girl"))
        stories.add(Story(R.drawable.img14,"Abu Sheyh"))
        stories.add(Story(R.drawable.img15,"Briefli_2035"))
        stories.add(Story(R.drawable.img16,"Maxs & Jon_Best_Frends"))

        val feeds: ArrayList<Feed> = ArrayList()

        feeds.add(Feed())
        feeds.add(Feed(stories))


        feeds.add(Feed(Post(R.drawable.img10,"Jozefina Laura",R.drawable.img2,0,0,0,0,3)))
        feeds.add(Feed(Post(R.drawable.img9,"Johs bood boy auff",R.drawable.img19,R.drawable.img20,R.drawable.img21,R.drawable.img22,R.drawable.img33,4)))
        feeds.add(Feed(Post(R.drawable.img11,"Murodjon_0507",R.drawable.img34,R.drawable.img35,R.drawable.img36,R.drawable.img37,R.drawable.img32,4)))
        feeds.add(Feed(Post(R.drawable.img1,"Marinda",R.drawable.img11)))
        feeds.add(Feed(Post(R.drawable.img17,"Siya",R.drawable.img17)))
        feeds.add(Feed(Post(R.drawable.img18,"Izabella",R.drawable.img18)))
        return feeds
    }
}