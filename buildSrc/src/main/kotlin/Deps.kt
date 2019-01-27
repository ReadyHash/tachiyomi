import org.gradle.api.artifacts.ProjectDependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

object Deps {

  object kotlin {
    const val version = "1.3.20"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
  }

  object coroutines {
    private const val version = "1.0.1"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    const val rx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:$version"
  }

  object androidX {
    const val core = "androidx.core:core:1.0.0"
    const val design = "com.google.android.material:material:1.0.0"
    const val appCompat = "androidx.appcompat:appcompat:1.0.0"
    const val recyclerView =  "androidx.recyclerview:recyclerview:1.0.0"
    const val card = "androidx.cardview:cardview:1.0.0"
    const val emoji = "androidx.emoji:emoji-bundled:1.0.0"
  }

  const val androidKTX = "androidx.core:core-ktx:1.0.1"

  const val storio = "com.pushtorefresh.storio3:sqlite:3.0.0"

  const val rxJava = "io.reactivex.rxjava2:rxjava:2.2.4"
  const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.0"
  const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.3.0"
  const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:2.1.0"
  const val rxPreferences = "com.f2prateek.rx.preferences2:rx-preferences:2.0.0"
  const val rxRedux = "com.freeletics.rxredux:rxredux:1.0.1"

  object rxBinding {
    private const val version = "2.2.0"
    const val platform = "com.jakewharton.rxbinding2:rxbinding-kotlin:$version"
    const val support = "com.jakewharton.rxbinding2:rxbinding-support-v4-kotlin:$version"
    const val appcompat = "com.jakewharton.rxbinding2:rxbinding-appcompat-v7-kotlin:$version"
  }

  object toothpick {
    private const val version = "1.1.3"
    const val runtime = "com.github.stephanenicolas.toothpick:toothpick-runtime:$version"
    const val smoothie = "com.github.stephanenicolas.toothpick:smoothie:$version"
    const val compiler = "com.github.stephanenicolas.toothpick:toothpick-compiler:$version"
    const val testing = "com.github.stephanenicolas.toothpick:toothpick-testing:$version"
  }

  const val okhttp = "com.squareup.okhttp3:okhttp:3.12.0"
  const val duktape = "com.squareup.duktape:duktape-android:1.3.0"
  const val gson = "com.google.code.gson:gson:2.8.5"
  const val kotson = "com.github.salomonbrys.kotson:kotson:2.5.0"
  const val jsoup = "org.jsoup:jsoup:1.11.3"
  const val timber = "com.jakewharton.timber:timber:4.7.1"

  const val conductor = "com.bluelinelabs:conductor:2.1.5"
  const val materialDimens = "com.dmitrymalkovich.android:material-design-dimens:1.4"
  const val materialDialog = "com.afollestad.material-dialogs:core:0.9.6.0"
  const val constraint = "com.android.support.constraint:constraint-layout:1.1.3"
  const val cyanea = "com.jaredrummler:cyanea:1.0.1"

  object glide {
    private const val version = "4.8.0"
    const val core = "com.github.bumptech.glide:glide:$version"
    const val okhttp = "com.github.bumptech.glide:okhttp3-integration:$version"
    const val compiler = "com.github.bumptech.glide:compiler:$version"
  }

  const val flexbox = "com.google.android:flexbox:1.1.0"

  const val junit = "junit:junit:4.12"

  const val mockito = "org.mockito:mockito-core:2.16.0"
  const val mockitokt = "com.nhaarman:mockito-kotlin:1.5.0"

}