package com.stefan.cts.main_builder;

import com.stefan.cts.builder.AutobuzBuilder;
import com.stefan.cts.builder.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        //autobuzBuilder.setNumeSofer("Sofer CTS");
        autobuzBuilder.setTextRulat("END LINE");
        AutobuzLinie autobuzLinie = autobuzBuilder.build();

        System.out.println(autobuzLinie);
    }
}
