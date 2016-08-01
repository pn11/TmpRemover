# Tmp Remover for Android

Android の `/sdcard/` 以下に `*.tmp` というファイルが大量に生成されて困ってるんだけど、~~原因のアプリが分からないので~~ (下記追記参照)、練習のために `*.tmp` ファイルを消すためだけのアプリをつくってみた。[WRITE_EXTERNAL_STORAGE](https://developer.android.com/reference/android/Manifest.permission.html?hl=ja#WRITE_EXTERNAL_STORAGE) というパーミッションを与えると `/sdcard/` 上どこでも書き込めてしまうことが分かった。

## 追記

原因アプリは Outlook だったらしい。

- [Rotation?.tmp files - Android Forums at AndroidCentral.com](http://forums.androidcentral.com/ask-question/691556-rotation-tmp-files.html#post5232919)

に容疑者のひとつとして挙がってたので消したら `rotation????.tmp` というファイルが生成されなくなった。でも "Outlook tmp file" とかでググってもあまり情報が出てこない。

