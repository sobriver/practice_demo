package com.example.practice_demo.t1;

import net.openhft.compiler.CompilerUtils;

public class ComplilerTest {
    public static void main(String[] args) throws Exception{
        String className = "com.example.practice_demo.t1.User";
        String code = "package com.example.practice_demo.t1;\n" +
                "\n" +
                "public class User implements UserInterface{\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    public void add() {\n" +
                "        System.out.println(\"sdsdsdsdsdsd\");\n" +
                "    }\n" +
                "}";
        Class clz = CompilerUtils.CACHED_COMPILER.loadFromJava(className, code);
        UserInterface user = (UserInterface) clz.newInstance();
        user.add();
    }
}
