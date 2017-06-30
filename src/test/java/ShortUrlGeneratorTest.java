import com.dounine.shorten.core.ShortenUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.tomcat.util.security.MD5Encoder;
import org.junit.Test;

/**
 * Created by lake on 17-6-30.
 */
public class ShortUrlGeneratorTest {

    @Test
    public void testUrlToShorten(){
        String sLongUrl = "https://github.com/dounine/url-shorten" ;
        String[] aResult = ShortenUtils.shortUrl(sLongUrl);
        // 打印出结果
        for ( int i = 0; i < aResult. length ; i++) {
            System. out .println( "第[" + i + "]组 ==> https://github.com/" + aResult[i]);
        }
    }

}
