# url-shorten
java 版本url缩短

## 使用说明
```
    @Test
    public void testUrlToShorten(){
        String sLongUrl = "https://github.com/dounine/url-shorten" ;
        String[] aResult = ShortenUtils.shortUrl(sLongUrl);
        // 打印出结果
        for ( int i = 0; i < aResult. length ; i++) {
            System. out .println( "第[" + i + "]组 ==> https://github.com/" + aResult[i]);
        }
    }
```
输出结果
```
第[0]组 ==> https://github.com/Qvmua2
第[1]组 ==> https://github.com/FBRb2i
第[2]组 ==> https://github.com/MvuuMn
第[3]组 ==> https://github.com/3EFFvy
```
