package com.jumbo.flutterembedder

import io.flutter.embedding.android.FlutterFragment

class BallFlutterFragment : FlutterFragment() {
    override fun getDartEntrypointFunctionName(): String {
        return "ball"
    }
}

class StarfieldFlutterFragment : FlutterFragment() {
    override fun getDartEntrypointFunctionName(): String {
        return "starfield"
    }
}
