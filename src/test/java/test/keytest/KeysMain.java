package test.keytest;

import com.badlogic.gdx.Input;
import org.lwjgl.glfw.GLFW;

import java.util.Arrays;

public class KeysMain {

    public static void main(String[] args) {
        Arrays.stream(GLFW.class.getFields()).forEach(f -> {
            if (f.getName().startsWith("GLFW_KEY_")) {
                String name = f.getName().replace("GLFW_KEY_", "");
                String gdxName = name;
                if (name.startsWith("KP_")) {
                    name = "NUMPAD_" + name.replaceAll("KP_", "");
                }
                if (name.replaceAll("[0-9]", "").isEmpty()) {
                    name = "NUM_" + name;
                }
                gdxName = name;
                String key = null;
                if (name.equals("EQUAL")) gdxName = "EQUALS";
                if (name.equals("GRAVE_ACCENT")) gdxName = "GRAVE";
                if (name.equals("DELETE")) gdxName = "DEL";
                if (name.equals("NUMPAD_DECIMAL")) name = gdxName = "NUMPAD_DOT";
                if (name.equals("NUMPAD_EQUAL")) name = gdxName = "NUMPAD_EQUALS";
                if (name.equals("LEFT_SHIFT")) name = gdxName = "SHIFT_LEFT";
                if (name.equals("RIGHT_SHIFT")) name = gdxName = "SHIFT_RIGHT";
                if (name.equals("LEFT_CONTROL")) name = gdxName = "CONTROL_LEFT";
                if (name.equals("RIGHT_CONTROL")) name = gdxName = "CONTROL_RIGHT";
                if (name.equals("LEFT_ALT")) name = gdxName = "ALT_LEFT";
                if (name.equals("RIGHT_ALT")) name = gdxName = "ALT_RIGHT";
                if (name.equals("RIGHT_SUPER")) gdxName = "SOFT_RIGHT";
                if (name.equals("LEFT_SUPER")) gdxName = "SOFT_LEFT";
                if (name.equals("LAST")) return;
                if (name.equals("FIRST")) return;
                if (name.equals("WORLD_1") || name.equals("WORLD_2") || name.equals("F25")) key = String.valueOf(-2);
                if (key == null) {
                    try {
                        key = ((Integer) Input.Keys.class.getField(gdxName).get(null)).toString();
                    } catch (IllegalAccessException | NoSuchFieldException e) {
                        e.printStackTrace();
                    };
                }
                try {
                    System.out.println(name + "(" + f.get(null) + ", " + key + ")");
                } catch (IllegalAccessException e) {
                    e.fillInStackTrace();
                }
            }
        });
    }

}
