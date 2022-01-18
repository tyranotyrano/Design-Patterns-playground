package com.tyranotyrano.structural.composite.leaf;

import com.tyranotyrano.structural.composite.component.SystemComponent;

public class File extends SystemComponent {

    public File(String name) {
        super(name);
    }

    @Override
    public void print(int depth) {
        System.out.print(createDepthSign(depth));
        System.out.println("[파일] " + name);
    }
}
