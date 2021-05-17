# webp
## Android Webp demo comptaible with different architectures: armeabi-v7a arm64-v8a x86 x86_64 armeabi

webp is a library We use it to save bandwidth as well as shrinking our APK sizes.

webp is an adaptation of chromium's webp decoder, and an addition of a JNI wrapper to easily use it it in your java code.

## Ndk version : 

Android-ndk-r16b-windows-x86_64 

## How to use it?

```java
import me.everything.webp.WebPDecoder

Bitmap bitmap = WebPDecoder.getInstance().decodeWebP(bytes);

