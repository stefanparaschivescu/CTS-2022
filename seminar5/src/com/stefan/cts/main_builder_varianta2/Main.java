package com.stefan.cts.main_builder_varianta2;

import com.stefan.cts.builder_varianta2.AutobuzBuilder;
import com.stefan.cts.builder_varianta2.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrLinie(2)
                .setAreOprire(false);

        AutobuzLinie autobuz = autobuzBuilder.build();
        AutobuzLinie autobuz1 = autobuzBuilder.build();
        System.out.println(autobuz);
        System.out.println(autobuz1);
    }
}
