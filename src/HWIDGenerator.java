import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.util.Arrays;
//import net.minecraft.client.main.Main;


public class HWIDGenerator {

    public static void main(String[] args) throws InterruptedException {
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1, 2));
        JTextComponent hwidfield = null;
        System.out.println("your HWID!");
        String hwid1 = (Arrays.toString(HWID.generateHWID()));
        System.out.println(hwid1);
        System.out.println(" ");
        System.out.println(" ");
        Thread.sleep(5000);

        String hwid2 = "Копируй и встовляй сюда свой хвид";

        JOptionPane.showMessageDialog(null, jp);
        if (hwid1.equals(hwid2)) {
            System.out.println("Афторизация пройдена!");
            //убери те знак " // " чтоб код запускал майн!
            //Main.main(concat(new String[] {"--version", "mcp", "--accessToken", "0", "--assetsDir", "assets", "--assetIndex", "1.12", "--userProperties", "{}"}, args));

            Thread.sleep(5000);
            System.exit(0);
        } else {
            System.out.println("HWID: " + hwid1);
            Thread.sleep(5000);
            System.exit(0);
        }

    }
    public static <T> T[] concat(T[] first, T[] second)
    {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}


