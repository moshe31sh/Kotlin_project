package com.example.moshe.dinnerdeciderkotlin

import android.os.Bundle

/**
 * Created by moshe on 10/09/2017.
 */


class MainActivity : BaseActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getResourceLayout(): Int {
        return R.layout.activity_main
    }

}