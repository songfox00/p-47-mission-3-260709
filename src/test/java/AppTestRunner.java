import com.ll.App;
import com.ll.global.AppContext;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {
    public static String run(String input) {
        Scanner sc = TestUtil.genScanner(input + "\n종료");
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        AppContext.init(sc);
        new App().run();

        TestUtil.clearSetOutToByteArray(outputStream);

        return outputStream.toString();
    }
}
