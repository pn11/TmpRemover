# Tmp Remover for Android

Android の `/sdcard/` 以下に `*.tmp` というファイルが大量に生成されて困ってるんだけど、原因のアプリが分からないので、練習のために `*.tmp` ファイルを消すためだけのアプリをつくってみた。[WRITE_EXTERNAL_STORAGE](https://developer.android.com/reference/android/Manifest.permission.html?hl=ja#WRITE_EXTERNAL_STORAGE) というパーミッションを与えると `/sdcard/` 上どこでも書き込めるということが分かった。
