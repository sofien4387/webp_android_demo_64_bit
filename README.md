# webp
## webp for all! (Android devices)

webp is a library we use at EverythingMe Launcher since we love webp. We use it to save bandwidth as well as shrinking our APK sizes.

webp is an adaptation of chromium's webp decoder, and an addition of a JNI wrapper to easily use it it in your java code.

## compile
just `gradle clean build`, and add the output aar to your libs (a public aar will be available soon)

## How to use it?

```java
import me.everything.webp.WebPDecoder

Bitmap bitmap = WebPDecoder.getInstance().decodeWebP(bytes);
